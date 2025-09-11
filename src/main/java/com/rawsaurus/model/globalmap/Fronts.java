package com.rawsaurus.model.globalmap;

import java.util.Arrays;

public class Fronts {
    private int avg_clans_rating;
    private int avg_min_bet;
    private int avg_won_bet;
    private int battle_time_limit;
    private int division_cost;
    private boolean fog_of_war;
    private String front_id;
    private String front_name;
    private boolean is_active;
    private boolean is_event;
    private int max_tanks_per_division;
    private int max_vehicle_level;
    private int min_tanks_per_division;
    private int min_vehicle_level;
    private int provinces_count;
    private boolean vehicle_freeze;
    private AvailableExtensions[] available_extensions;

    public int getAvg_clans_rating() {
        return avg_clans_rating;
    }

    public int getAvg_min_bet() {
        return avg_min_bet;
    }

    public int getAvg_won_bet() {
        return avg_won_bet;
    }

    public int getBattle_time_limit() {
        return battle_time_limit;
    }

    public int getDivision_cost() {
        return division_cost;
    }

    public boolean isFog_of_war() {
        return fog_of_war;
    }

    public String getFront_id() {
        return front_id;
    }

    public String getFront_name() {
        return front_name;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public boolean isIs_event() {
        return is_event;
    }

    public int getMax_tanks_per_division() {
        return max_tanks_per_division;
    }

    public int getMax_vehicle_level() {
        return max_vehicle_level;
    }

    public int getMin_tanks_per_division() {
        return min_tanks_per_division;
    }

    public int getMin_vehicle_level() {
        return min_vehicle_level;
    }

    public int getProvinces_count() {
        return provinces_count;
    }

    public boolean isVehicle_freeze() {
        return vehicle_freeze;
    }

    public AvailableExtensions[] getAvailable_extensions() {
        return available_extensions;
    }

    @Override
    public String toString() {
        return "Fronts{" +
                "avg_clans_rating=" + avg_clans_rating +
                ", avg_min_bet=" + avg_min_bet +
                ", avg_won_bet=" + avg_won_bet +
                ", battle_time_limit=" + battle_time_limit +
                ", division_cost=" + division_cost +
                ", fog_of_war=" + fog_of_war +
                ", front_id='" + front_id + '\'' +
                ", front_name='" + front_name + '\'' +
                ", is_active=" + is_active +
                ", is_event=" + is_event +
                ", max_tanks_per_division=" + max_tanks_per_division +
                ", max_vehicle_level=" + max_vehicle_level +
                ", min_tanks_per_division=" + min_tanks_per_division +
                ", min_vehicle_level=" + min_vehicle_level +
                ", provinces_count=" + provinces_count +
                ", vehicle_freeze=" + vehicle_freeze +
                ", available_extensions=" + Arrays.toString(available_extensions) +
                '}';
    }

    private static class AvailableExtensions{
        private int cost;
        private String description_strategic;
        private String description_tactical;
        private String extension_id;
        private String name;
        private int wage;

        public int getCost() {
            return cost;
        }

        public String getDescription_strategic() {
            return description_strategic;
        }

        public String getDescription_tactical() {
            return description_tactical;
        }

        public String getExtension_id() {
            return extension_id;
        }

        public String getName() {
            return name;
        }

        public int getWage() {
            return wage;
        }

        @Override
        public String toString() {
            return "AvailableExtensions{" +
                    "cost=" + cost +
                    ", description_strategic='" + description_strategic + '\'' +
                    ", description_tactical='" + description_tactical + '\'' +
                    ", extension_id='" + extension_id + '\'' +
                    ", name='" + name + '\'' +
                    ", wage=" + wage +
                    '}';
        }
    }

}
