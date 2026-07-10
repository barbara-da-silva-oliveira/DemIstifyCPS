package fr.inria.kairos.influence.patch;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class PatchJsonIO {

    private static final Gson GSON = new GsonBuilder()
        .setPrettyPrinting()
        .disableHtmlEscaping()
        .create();

    private PatchJsonIO() {
    }

    public static InfluencePatchProposal readProposal(Path path) throws IOException {
        try (Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            return GSON.fromJson(reader, InfluencePatchProposal.class);
        }
    }

	public static void writeProposal(Path path, InfluencePatchProposal proposal) throws IOException {
        ensureParent(path);

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            GSON.toJson(proposal, writer);
        }
    }

    public static void writeApplicationLog(Path path, PatchApplicationLog log) throws IOException {
        ensureParent(path);

        try (Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            GSON.toJson(log, writer);
        }
    }

    private static void ensureParent(Path path) throws IOException {
        Path parent = path.getParent();

        if (parent != null && !Files.exists(parent)) {
            Files.createDirectories(parent);
        }
    }
}