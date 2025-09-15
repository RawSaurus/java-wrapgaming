package com.rawsaurus.model.globalmap;

public class EventClanRatings {
    private String award_level;
    private int battle_fame_points;
    private int clan_id;
    private String color;
    private int fame_points_to_improve_award;
    private String name;
    private int rank;
    private int rank_delta;
    private String tag;
    private int task_fame_points;
    private int total_fame_points;
    private long updated_at;

    public String getAward_level() {
        return award_level;
    }

    public int getBattle_fame_points() {
        return battle_fame_points;
    }

    public int getClan_id() {
        return clan_id;
    }

    public String getColor() {
        return color;
    }

    public int getFame_points_to_improve_award() {
        return fame_points_to_improve_award;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getRank_delta() {
        return rank_delta;
    }

    public String getTag() {
        return tag;
    }

    public int getTask_fame_points() {
        return task_fame_points;
    }

    public int getTotal_fame_points() {
        return total_fame_points;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    @Override
    public String toString() {
        return "EventClanRatings{" +
                "award_level='" + award_level + '\'' +
                ", battle_fame_points=" + battle_fame_points +
                ", clan_id=" + clan_id +
                ", color='" + color + '\'' +
                ", fame_points_to_improve_award=" + fame_points_to_improve_award +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", rank_delta=" + rank_delta +
                ", tag='" + tag + '\'' +
                ", task_fame_points=" + task_fame_points +
                ", total_fame_points=" + total_fame_points +
                ", updated_at=" + updated_at +
                '}';
    }
}
