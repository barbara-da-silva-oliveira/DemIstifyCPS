package fr.inria.kairos.influence.patch;

import java.nio.file.Path;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import fr.inria.kairos.influence.metamodel.MetamodelPackage;

import com.google.inject.Injector;

import fr.inria.kairos.influence.InfluenceDSLStandaloneSetup;

public class ApplyApprovedPatchMain {

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: ApplyApprovedPatchMain <model.inf> <approved-patch.json>");
            System.exit(1);
        }

        Path modelPath = Path.of(args[0]);
        Path patchPath = Path.of(args[1]);

        /*
         * Register the imported Ecore metamodel explicitly.
         */
        MetamodelPackage.eINSTANCE.eClass();

        EPackage.Registry.INSTANCE.put(
            MetamodelPackage.eNS_URI,
            MetamodelPackage.eINSTANCE
        );

        /*
         * Register the exact URI used in the Xtext grammar.
         */
        EPackage.Registry.INSTANCE.put(
            "http://kairos.inria.fr/influences",
            MetamodelPackage.eINSTANCE
        );

        Injector injector =
            new InfluenceDSLStandaloneSetup().createInjectorAndDoEMFRegistration();

        XtextResourceSet resourceSet =
            injector.getInstance(XtextResourceSet.class);

        resourceSet.addLoadOption(
            XtextResource.OPTION_RESOLVE_ALL,
            Boolean.TRUE
        );

        Resource modelResource =
            resourceSet.getResource(
                URI.createFileURI(modelPath.toAbsolutePath().toString()),
                true
            );

        InfluencePatchProposal proposal =
            PatchJsonIO.readProposal(patchPath);

        InfluencePatchApplier applier =
            new InfluencePatchApplier();

        PatchApplicationLog log =
            applier.applyPatch(modelResource, proposal, true);

        Path logPath =
            patchPath.getParent().resolve("applied_patch_log.json");

        PatchJsonIO.writeApplicationLog(logPath, log);

        if (log.hasErrors()) {
            System.err.println("Patch application failed. See: " + logPath);
            System.exit(2);
        }

        System.out.println("Patch applied successfully.");
        System.out.println("Log written to: " + logPath);
    }
}