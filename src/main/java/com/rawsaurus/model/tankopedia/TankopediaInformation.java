package com.rawsaurus.model.tankopedia;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class TankopediaInformation {
    private String game_version;
    private Map<String, String> languages;
    private long tanks_updated_at;
    private Map<String, String> vehicle_crew_roles;
    private Map<String, String> vehicle_nations;
    private Map<String, String> vehicle_types;
    private Map<String, AchievementSection> achievement_sections;

    public String getGame_version() {
        return game_version;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public long getTanks_updated_at() {
        return tanks_updated_at;
    }

    public Map<String, String> getVehicle_crew_roles() {
        return vehicle_crew_roles;
    }

    public Map<String, String> getVehicle_nations() {
        return vehicle_nations;
    }

    public Map<String, String> getVehicle_types() {
        return vehicle_types;
    }

    public Map<String, AchievementSection> getAchievement_sections() {
        return achievement_sections;
    }

    @Override
    public String toString() {
        return "TankopediaInformation{" +
                "game_version='" + game_version + '\'' +
                ", languages=" + languages +
                ", tanks_updated_at=" + tanks_updated_at +
                ", vehicle_crew_roles=" + vehicle_crew_roles +
                ", vehicle_nations=" + vehicle_nations +
                ", vehicle_types=" + vehicle_types +
                ", achievement_sections=" + achievement_sections +
                '}';
    }

    private static class AchievementSection {
        private String name;
        private int order;

        public String getName() {
            return name;
        }

        public int getOrder() {
            return order;
        }

        @Override
        public String toString() {
            return "AchievementSection{" +
                    "name='" + name + '\'' +
                    ", order=" + order +
                    '}';
        }
    }

}
