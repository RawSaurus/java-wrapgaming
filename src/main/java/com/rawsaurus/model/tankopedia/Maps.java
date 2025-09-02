package com.rawsaurus.model.tankopedia;

public class Maps {
    private String arena_id;
    private String camouflage_type;
    private String description;
    private String name_i18n;

    public String getArena_id() {
        return arena_id;
    }

    public String getCamouflage_type() {
        return camouflage_type;
    }

    public String getDescription() {
        return description;
    }

    public String getName_i18n() {
        return name_i18n;
    }

    @Override
    public String toString() {
        return "Maps{" +
                "arena_id='" + arena_id + '\'' +
                ", camouflage_type='" + camouflage_type + '\'' +
                ", description='" + description + '\'' +
                ", name_i18n='" + name_i18n + '\'' +
                '}';
    }
}
