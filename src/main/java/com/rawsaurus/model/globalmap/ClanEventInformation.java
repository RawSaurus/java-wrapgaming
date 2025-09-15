package com.rawsaurus.model.globalmap;

public class ClanEventInformation {
    private Events events;

    public Events getEvents() {
        return events;
    }

    @Override
    public String toString() {
        return "ClanEventInformation{" +
                "events=" + events +
                '}';
    }

    private static class Events{
        private int battle_fame_points;
        private int battles;
        private String event_id;
        private int fame_points;
        private int fame_points_since_turn;
        private String front_id;
        private int rank;
        private int rank_delta;
        private int task_fame_points;
        private String url;
        private int wins;

        public int getBattle_fame_points() {
            return battle_fame_points;
        }

        public int getBattles() {
            return battles;
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

        public String getFront_id() {
            return front_id;
        }

        public int getRank() {
            return rank;
        }

        public int getRank_delta() {
            return rank_delta;
        }

        public int getTask_fame_points() {
            return task_fame_points;
        }

        public String getUrl() {
            return url;
        }

        public int getWins() {
            return wins;
        }

        @Override
        public String toString() {
            return "Events{" +
                    "battle_fame_points=" + battle_fame_points +
                    ", battles=" + battles +
                    ", event_id='" + event_id + '\'' +
                    ", fame_points=" + fame_points +
                    ", fame_points_since_turn=" + fame_points_since_turn +
                    ", front_id='" + front_id + '\'' +
                    ", rank=" + rank +
                    ", rank_delta=" + rank_delta +
                    ", task_fame_points=" + task_fame_points +
                    ", url='" + url + '\'' +
                    ", wins=" + wins +
                    '}';
        }
    }
}
