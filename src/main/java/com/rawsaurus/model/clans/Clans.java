package com.rawsaurus.model.clans;

import java.util.Map;

public class Clans {
    private int clan_id;
    private String color;
    private long created_at;
    private int members_count;
    private String name;
    private String tag;
    private Emblems emblems;

    public int getClan_id() {
        return clan_id;
    }

    public String getColor() {
        return color;
    }

    public long getCreated_at() {
        return created_at;
    }

    public int getMembers_count() {
        return members_count;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public Emblems getEmblems() {
        return emblems;
    }

    @Override
    public String toString() {
        return "Clans{" +
                "clan_id=" + clan_id +
                ", color='" + color + '\'' +
                ", created_at=" + created_at +
                ", members_count=" + members_count +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", emblems=" + emblems +
                '}';
    }
}
