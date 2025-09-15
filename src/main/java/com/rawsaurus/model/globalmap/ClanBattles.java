package com.rawsaurus.model.globalmap;

public class ClanBattles {
    private String attack_type;
    private int competitor_id;
    private String front_id;
    private String front_name;
    private String province_id;
    private String province_name;
    private long time;
    private String type;
    private int vehicle_level;

    public String getAttack_type() {
        return attack_type;
    }

    public int getCompetitor_id() {
        return competitor_id;
    }

    public String getFront_id() {
        return front_id;
    }

    public String getFront_name() {
        return front_name;
    }

    public String getProvince_id() {
        return province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public long getTime() {
        return time;
    }

    public String getType() {
        return type;
    }

    public int getVehicle_level() {
        return vehicle_level;
    }

    @Override
    public String toString() {
        return "ClanBattles{" +
                "attack_type='" + attack_type + '\'' +
                ", competitor_id=" + competitor_id +
                ", front_id='" + front_id + '\'' +
                ", front_name='" + front_name + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                ", time=" + time +
                ", type='" + type + '\'' +
                ", vehicle_level=" + vehicle_level +
                '}';
    }
}
