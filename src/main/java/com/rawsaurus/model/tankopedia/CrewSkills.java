package com.rawsaurus.model.tankopedia;

import java.util.Map;

public class CrewSkills {
    private String description;
    private boolean is_perk;
    private String name;
    private String skill;
    private Map<String, String> image_url;

    public String getDescription() {
        return description;
    }

    public boolean isIs_perk() {
        return is_perk;
    }

    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    public Map<String, String> getImage_url() {
        return image_url;
    }

    @Override
    public String toString() {
        return "CrewSkills{" +
                "description='" + description + '\'' +
                ", is_perk=" + is_perk +
                ", name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", image_url=" + image_url +
                '}';
    }
}
