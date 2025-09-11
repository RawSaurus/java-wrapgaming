package com.rawsaurus.model.players_vehicles;

import java.util.List;
import java.util.Map;

public class VehicleMasteryDistribution {
    private Map<String, Map<Integer, Integer>> distribution;
    private long updated_at;

    public Map<String, Map<Integer, Integer>> getDistribution() {
        return distribution;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    @Override
    public String toString() {
        return "VehicleMasteryDistribution{" +
                "distribution=" + distribution +
                ", updated_at=" + updated_at +
                '}';
    }
}
