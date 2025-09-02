package com.rawsaurus.model.tankopedia;

import java.util.Arrays;

public class CrewQualifications {
    private String name;
    private String role;
    private String[] skills;

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String[] getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "CrewQualifications{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
