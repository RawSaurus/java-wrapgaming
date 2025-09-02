package com.rawsaurus.model.tankopedia;

import java.util.Map;

public class Badges {
    private int badge_id;
    private String description;
    private String name;
    private Map<String, String> images;

    public int getBadge_id() {
        return badge_id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "Badges{" +
                "badge_id=" + badge_id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", images=" + images +
                '}';
    }
}
