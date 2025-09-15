package com.rawsaurus.model.globalmap;

public class SeasonRating {
    private String award_level;
    private int clan_id;
    private String color;
    private String name;
    private int rank;
    private int rank_delta;
    private String tag;
    private long updated_at;
    private int victory_points;
    private int victory_points_to_next_award;

    public String getAward_level() {
        return award_level;
    }

    public int getClan_id() {
        return clan_id;
    }

    public String getColor() {
        return color;
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

    public long getUpdated_at() {
        return updated_at;
    }

    public int getVictory_points() {
        return victory_points;
    }

    public int getVictory_points_to_next_award() {
        return victory_points_to_next_award;
    }

    @Override
    public String toString() {
        return "SeasonRating{" +
                "award_level='" + award_level + '\'' +
                ", clan_id=" + clan_id +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", rank_delta=" + rank_delta +
                ", tag='" + tag + '\'' +
                ", updated_at=" + updated_at +
                ", victory_points=" + victory_points +
                ", victory_points_to_next_award=" + victory_points_to_next_award +
                '}';
    }
}