package com.rawsaurus.model.globalmap;

import java.util.Map;

public class AccountSeasonData {
    private Seasons seasons;

    public Seasons getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "AccountSeasonData{" +
                "seasons=" + seasons +
                '}';
    }

    private static class Seasons{
        private int account_id;
        private String award_level;
        private int battles;
        private int battles_to_award;
        private int clan_id;
        private int clan_rank;
        private String season_id;
        private long updated_at;
        private int vehicle_level;

        public int getAccount_id() {
            return account_id;
        }

        public String getAward_level() {
            return award_level;
        }

        public int getBattles() {
            return battles;
        }

        public int getBattles_to_award() {
            return battles_to_award;
        }

        public int getClan_id() {
            return clan_id;
        }

        public int getClan_rank() {
            return clan_rank;
        }

        public String getSeason_id() {
            return season_id;
        }

        public long getUpdated_at() {
            return updated_at;
        }

        public int getVehicle_level() {
            return vehicle_level;
        }

        @Override
        public String toString() {
            return "Seasons{" +
                    "account_id=" + account_id +
                    ", award_level='" + award_level + '\'' +
                    ", battles=" + battles +
                    ", battles_to_award=" + battles_to_award +
                    ", clan_id=" + clan_id +
                    ", clan_rank=" + clan_rank +
                    ", season_id='" + season_id + '\'' +
                    ", updated_at=" + updated_at +
                    ", vehicle_level=" + vehicle_level +
                    '}';
        }
    }
}
