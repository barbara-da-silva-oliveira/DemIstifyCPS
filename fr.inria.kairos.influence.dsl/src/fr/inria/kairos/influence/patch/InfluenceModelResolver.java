package fr.inria.kairos.influence.patch;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import fr.inria.kairos.influence.metamodel.AbstractInfluence;
import fr.inria.kairos.influence.metamodel.FunctionRepresentation;
import fr.inria.kairos.influence.metamodel.InfluenceFunction;
import fr.inria.kairos.influence.metamodel.NamedElement;
import fr.inria.kairos.influence.metamodel.Participant;
import fr.inria.kairos.influence.metamodel.SystemResponseProperty;

public class InfluenceModelResolver {

    public AbstractInfluence findInfluenceByName(EObject root, String name) {
        if (root == null || name == null) {
            return null;
        }

        if (root instanceof AbstractInfluence) {
            AbstractInfluence influence = (AbstractInfluence) root;

            if (sameName(influence, name)) {
                return influence;
            }
        }

        TreeIterator<EObject> iterator = root.eAllContents();

        while (iterator.hasNext()) {
            EObject object = iterator.next();

            if (object instanceof AbstractInfluence) {
                AbstractInfluence influence = (AbstractInfluence) object;

                if (sameName(influence, name)) {
                    return influence;
                }
            }
        }

        return null;
    }

    public Participant findParticipantInInfluence(AbstractInfluence influence, String name) {
        if (influence == null || name == null) {
            return null;
        }

        TreeIterator<EObject> iterator = influence.eAllContents();

        while (iterator.hasNext()) {
            EObject object = iterator.next();

            if (object instanceof Participant) {
                Participant participant = (Participant) object;

                if (sameName(participant, name)) {
                    return participant;
                }
            }
        }

        return null;
    }

    public SystemResponseProperty findSRPByName(EObject root, String name) {
        if (root == null || name == null) {
            return null;
        }

        if (root instanceof SystemResponseProperty) {
            SystemResponseProperty srp = (SystemResponseProperty) root;

            if (sameName(srp, name)) {
                return srp;
            }
        }

        TreeIterator<EObject> iterator = root.eAllContents();

        while (iterator.hasNext()) {
            EObject object = iterator.next();

            if (object instanceof SystemResponseProperty) {
                SystemResponseProperty srp = (SystemResponseProperty) object;

                if (sameName(srp, name)) {
                    return srp;
                }
            }
        }

        return null;
    }

    public FunctionRepresentation findRepresentationByName(
        InfluenceFunction function,
        String representationName
    ) {
        if (function == null || representationName == null) {
            return null;
        }

        for (FunctionRepresentation representation : function.getRepresentations()) {
            if (representation instanceof NamedElement) {
                NamedElement named = (NamedElement) representation;

                if (sameName(named, representationName)) {
                    return representation;
                }
            }
        }

        return null;
    }

    private boolean sameName(NamedElement element, String expectedName) {
        if (element == null || expectedName == null) {
            return false;
        }

        String actual = element.getName();

        if (expectedName.equals(actual)) {
            return true;
        }

        return PatchNames.normalizeKey(expectedName).equals(PatchNames.normalizeKey(actual));
    }
}