//package fr.inria.kairos.influence.ui;
//
//import org.eclipse.core.runtime.jobs.Job;
//import org.eclipse.ui.IStartup;
//import org.eclipse.xtext.builder.builderState.IBuilderState;
//
//import fr.inria.kairos.influence.MyIndexChangeListener;
//import jakarta.inject.Inject;
//
//public class ListenerStartup implements IStartup {
//
//    @Inject
//    private IBuilderState builderState;
//
//    @Inject
//    private MyIndexChangeListener myListener;
//
//    @Override
//    public void earlyStartup() {
//        // Eclipse UI thread - defer to background job
//        Job job = Job.create("Register Index Listener", monitor -> {
////            builderState.addListener(myListener);
//        });
//        job.schedule();
//    }
//}
