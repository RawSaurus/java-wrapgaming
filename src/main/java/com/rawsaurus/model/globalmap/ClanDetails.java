package com.rawsaurus.model.globalmap;

import com.google.gson.annotations.SerializedName;

public class ClanDetails {
    private int clan_id;
    private String name;
    private String tag;
    @SerializedName("private")
    private PrivateInfo privateInfo;
    private Ratings ratings;
    private Statistics statistics;

    public int getClan_id() {
        return clan_id;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public PrivateInfo getPrivateInfo() {
        return privateInfo;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    @Override
    public String toString() {
        return "ClanDetails{" +
                "clan_id=" + clan_id +
                ", name='" + name + '\'' +
                ", tag='" + tag + '\'' +
                ", privateInfo=" + privateInfo +
                ", ratings=" + ratings +
                ", statistics=" + statistics +
                '}';
    }

    private static class PrivateInfo{
        private int daily_wage;
        private int influence;

        public int getDaily_wage() {
            return daily_wage;
        }

        public int getInfluence() {
            return influence;
        }

        @Override
        public String toString() {
            return "PrivateInfo{" +
                    "daily_wage=" + daily_wage +
                    ", influence=" + influence +
                    '}';
        }
    }

    private static class Ratings{
        private int elo_10;
        private int elo_6;
        private int elo_8;
        private long updated_at;

        public int getElo_10() {
            return elo_10;
        }

        public int getElo_6() {
            return elo_6;
        }

        public int getElo_8() {
            return elo_8;
        }

        public long getUpdated_at() {
            return updated_at;
        }

        @Override
        public String toString() {
            return "Ratings{" +
                    "elo_10=" + elo_10 +
                    ", elo_6=" + elo_6 +
                    ", elo_8=" + elo_8 +
                    ", updated_at=" + updated_at +
                    '}';
        }
    }

    private static class Statistics{
        private int battles;
        private int battles_10_level;
        private int battles_6_level;
        private int battles_8_level;
        private int captures;
        private int losses;
        private int provinces_count;
        private int wins;
        private int wins_10_level;
        private int wins_6_level;
        private int wins_8_level;

        public int getBattles() {
            return battles;
        }

        public int getBattles_10_level() {
            return battles_10_level;
        }

        public int getBattles_6_level() {
            return battles_6_level;
        }

        public int getBattles_8_level() {
            return battles_8_level;
        }

        public int getCaptures() {
            return captures;
        }

        public int getLosses() {
            return losses;
        }

        public int getProvinces_count() {
            return provinces_count;
        }

        public int getWins() {
            return wins;
        }

        public int getWins_10_level() {
            return wins_10_level;
        }

        public int getWins_6_level() {
            return wins_6_level;
        }

        public int getWins_8_level() {
            return wins_8_level;
        }

        @Override
        public String toString() {
            return "Statistics{" +
                    "battles=" + battles +
                    ", battles_10_level=" + battles_10_level +
                    ", battles_6_level=" + battles_6_level +
                    ", battles_8_level=" + battles_8_level +
                    ", captures=" + captures +
                    ", losses=" + losses +
                    ", provinces_count=" + provinces_count +
                    ", wins=" + wins +
                    ", wins_10_level=" + wins_10_level +
                    ", wins_6_level=" + wins_6_level +
                    ", wins_8_level=" + wins_8_level +
                    '}';
        }
    }
}
