package fr.inria.kairos.influence.patch;

import java.util.ArrayList;
import java.util.List;

public class PatchApplicationLog {

    public String status;
    public String targetInfluence;
    public String targetModel;

    public List<String> appliedChanges = new ArrayList<>();
    public List<String> warnings = new ArrayList<>();
    public List<String> errors = new ArrayList<>();

    public void applied(String message) {
        appliedChanges.add(message);
    }

    public void warning(String message) {
        warnings.add(message);
    }

    public void error(String message) {
        errors.add(message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}