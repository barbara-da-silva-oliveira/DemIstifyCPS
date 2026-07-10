package fr.inria.kairos.influence.patch;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SimpleCsv {

    private SimpleCsv() {
    }

    public static List<Map<String, String>> read(Path csvPath) throws IOException {
        List<String> lines = Files.readAllLines(csvPath, StandardCharsets.UTF_8);
        List<Map<String, String>> rows = new ArrayList<>();

        if (lines.isEmpty()) {
            return rows;
        }

        List<String> headers = parseLine(lines.get(0));

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);

            if (line == null || line.trim().isEmpty()) {
                continue;
            }

            List<String> values = parseLine(line);
            Map<String, String> row = new LinkedHashMap<>();

            for (int c = 0; c < headers.size(); c++) {
                String key = headers.get(c).trim();
                String value = c < values.size() ? values.get(c).trim() : "";
                row.put(key, value);
            }

            rows.add(row);
        }

        return rows;
    }

    private static List<String> parseLine(String line) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();

        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch == '"') {
                if (inQuotes && i + 1 < line.length() && line.charAt(i + 1) == '"') {
                    current.append('"');
                    i++;
                } else {
                    inQuotes = !inQuotes;
                }
            } else if (ch == ',' && !inQuotes) {
                result.add(current.toString());
                current.setLength(0);
            } else {
                current.append(ch);
            }
        }

        result.add(current.toString());

        return result;
    }
}