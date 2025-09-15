package com.rawsaurus.model.globalmap;

import com.google.gson.annotations.SerializedName;

public class ClanProvinces {
    private String arena_id;
    private String arena_name;
    private int clan_id;
    private int daily_revenue;
    private String front_id;
    private String front_name;
    private String landing_type;
    private int max_vehicle_level;
    private String pillage_end_at;
    private String prime_time;
    private String province_id;
    private String province_name;
    private int revenue_level;
    private int turns_owned;
    @SerializedName("private")
    private  PrivateInfo privateInfo;

    public String getArena_id() {
        return arena_id;
    }

    public String getArena_name() {
        return arena_name;
    }

    public int getClan_id() {
        return clan_id;
    }

    public int getDaily_revenue() {
        return daily_revenue;
    }

    public String getFront_id() {
        return front_id;
    }

    public String getFront_name() {
        return front_name;
    }

    public String getLanding_type() {
        return landing_type;
    }

    public int getMax_vehicle_level() {
        return max_vehicle_level;
    }

    public String getPillage_end_at() {
        return pillage_end_at;
    }

    public String getPrime_time() {
        return prime_time;
    }

    public String getProvince_id() {
        return province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public int getRevenue_level() {
        return revenue_level;
    }

    public int getTurns_owned() {
        return turns_owned;
    }

    public PrivateInfo getPrivateInfo() {
        return privateInfo;
    }

    @Override
    public String toString() {
        return "ClanProvinces{" +
                "arena_id='" + arena_id + '\'' +
                ", arena_name='" + arena_name + '\'' +
                ", clan_id=" + clan_id +
                ", daily_revenue=" + daily_revenue +
                ", front_id='" + front_id + '\'' +
                ", front_name='" + front_name + '\'' +
                ", landing_type='" + landing_type + '\'' +
                ", max_vehicle_level=" + max_vehicle_level +
                ", pillage_end_at='" + pillage_end_at + '\'' +
                ", prime_time='" + prime_time + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                ", revenue_level=" + revenue_level +
                ", turns_owned=" + turns_owned +
                ", privateInfo=" + privateInfo +
                '}';
    }

    private static class PrivateInfo{
        private boolean hq_conected;
        private boolean is_revenue_limit_exceeded;

        public boolean isHq_conected() {
            return hq_conected;
        }

        public boolean isIs_revenue_limit_exceeded() {
            return is_revenue_limit_exceeded;
        }

        @Override
        public String toString() {
            return "PrivateInfo{" +
                    "hq_conected=" + hq_conected +
                    ", is_revenue_limit_exceeded=" + is_revenue_limit_exceeded +
                    '}';
        }
    }
}
