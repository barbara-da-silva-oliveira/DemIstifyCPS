package fr.inria.kairos.influence.patch;

import java.util.Locale;

public final class PatchNames {

    private PatchNames() {
    }

    public static String safeName(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "unnamed";
        }

        String cleaned = text.trim().replaceAll("[^A-Za-z0-9_]", "_");

        if (cleaned.isEmpty()) {
            return "unnamed";
        }

        if (Character.isDigit(cleaned.charAt(0))) {
            cleaned = "v_" + cleaned;
        }

        return cleaned;
    }

    public static String normalizeKey(String text) {
        if (text == null) {
            return "";
        }

        return text.toLowerCase(Locale.ROOT)
            .replace("_", "")
            .replace("-", "")
            .replace(" ", "")
            .trim();
    }

    public static String normalizeTrend(String trend) {
        if (trend == null) {
            return "NotMonotonic";
        }

        String t = trend.trim().toLowerCase(Locale.ROOT);

        if (t.equals("increasing")) {
            return "Increasing";
        }

        if (t.equals("decreasing")) {
            return "Decreasing";
        }

        if (t.equals("flat")) {
            return "Flat";
        }

        return "NotMonotonic";
    }

    public static double confidenceFromR2(Double r2) {
        if (r2 == null || Double.isNaN(r2)) {
            return 0.1;
        }

        if (r2 >= 0.85) {
            return 0.95;
        }

        if (r2 >= 0.60) {
            return 0.75;
        }

        if (r2 >= 0.30) {
            return 0.45;
        }

        return 0.1;
    }

    public static String defaultInfluenceName(String participant, String srp) {
        return "I_" + safeName(participant) + "_to_" + safeName(srp);
    }
}