package fr.inria.kairos.influence.ui;

import org.eclipse.xtext.builder.builderState.IBuilderState;

import fr.inria.kairos.influence.MyIndexChangeListener;
import jakarta.inject.Inject;

public class ListenerRegistrar {
    @Inject
    public ListenerRegistrar(IBuilderState builderState, MyIndexChangeListener listener) {
        System.out.println(">>> Registering index listener (eager singleton)");
        builderState.addListener(listener);
    }
}
