package com.rawsaurus.model.globalmap;

public class MapStatus {
    private int last_turn;
    private long last_turn_calculated_at;
    private long last_turn_created_at;
    private String state;

    public int getLast_turn() {
        return last_turn;
    }

    public long getLast_turn_calculated_at() {
        return last_turn_calculated_at;
    }

    public long getLast_turn_created_at() {
        return last_turn_created_at;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "MapStatus{" +
                "last_turn=" + last_turn +
                ", last_turn_calculated_at=" + last_turn_calculated_at +
                ", last_turn_created_at=" + last_turn_created_at +
                ", state='" + state + '\'' +
                '}';
    }
}
