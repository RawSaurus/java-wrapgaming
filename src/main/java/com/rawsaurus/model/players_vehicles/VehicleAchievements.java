package com.rawsaurus.model.players_vehicles;

import java.util.Map;

public class VehicleAchievements {
    private int account_id;
    private Map<String, Integer> achievements;
    private Map<String, Integer> max_series;
    private Map<String, Integer> series;
    private int tank_id;

    public int getAccount_id() {
        return account_id;
    }

    public Map<String, Integer> getAchievements() {
        return achievements;
    }

    public Map<String, Integer> getMax_series() {
        return max_series;
    }

    public Map<String, Integer> getSeries() {
        return series;
    }

    public int getTank_id() {
        return tank_id;
    }

    @Override
    public String toString() {
        return "VehicleAchievements{" +
                "account_id=" + account_id +
                ", achievements=" + achievements +
                ", max_series=" + max_series +
                ", series=" + series +
                ", tank_id=" + tank_id +
                '}';
    }
}
