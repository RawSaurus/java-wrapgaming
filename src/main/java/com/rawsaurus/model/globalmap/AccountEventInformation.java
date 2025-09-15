package com.rawsaurus.model.globalmap;

public class AccountEventInformation {
    private Events events;

    public Events getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "AccountEventInformation{" +
                "events=" + events +
                '}';
    }

    private static class Events{
        private int account_id;
        private String award_level;
        private int battles;
        private int battles_to_award;
        private int clan_id;
        private int clan_rank;
        private String event_id;
        private int fame_points;
        private int fame_points_since_turn;
        private int fame_points_to_improve_award;
        private String front_id;
        private int rank;
        private int rank_delta;
        private long updated_at;
        private String url;

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

        public String getEvent_id() {
            return event_id;
        }

        public int getFame_points() {
            return fame_points;
        }

        public int getFame_points_since_turn() {
            return fame_points_since_turn;
        }

        public int getFame_points_to_improve_award() {
            return fame_points_to_improve_award;
        }

        public String getFront_id() {
            return front_id;
        }

        public int getRank() {
            return rank;
        }

        public int getRank_delta() {
            return rank_delta;
        }

        public long getUpdated_at() {
            return updated_at;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "Events{" +
                    "account_id=" + account_id +
                    ", award_level='" + award_level + '\'' +
                    ", battles=" + battles +
                    ", battles_to_award=" + battles_to_award +
                    ", clan_id=" + clan_id +
                    ", clan_rank=" + clan_rank +
                    ", event_id='" + event_id + '\'' +
                    ", fame_points=" + fame_points +
                    ", fame_points_since_turn=" + fame_points_since_turn +
                    ", fame_points_to_improve_award=" + fame_points_to_improve_award +
                    ", front_id='" + front_id + '\'' +
                    ", rank=" + rank +
                    ", rank_delta=" + rank_delta +
                    ", updated_at=" + updated_at +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}
