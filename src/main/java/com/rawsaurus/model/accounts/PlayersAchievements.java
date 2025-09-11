package com.rawsaurus.model.accounts;

import java.util.Map;

public class PlayersAchievements {

    private Map<String, Integer> achievements;
    private Map<String, Integer> frags;
    private Map<String, Integer> max_series;

    public Map<String, Integer> getAchievements() {
        return achievements;
    }

    public Map<String, Integer> getFrags() {
        return frags;
    }

    public Map<String, Integer> getMax_series() {
        return max_series;
    }

    @Override
    public String toString() {
        return "PlayersAchievements{" +
                "achievements=" + achievements +
                ", frags=" + frags +
                ", max_series=" + max_series +
                '}';
    }
}
