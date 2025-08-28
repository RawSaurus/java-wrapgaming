package com.rawsaurus.model.accounts;

public class PlayersVehicles {
    private int mark_of_mastery;
    private int tank_id;
    private Statistics statistics;

    public int getMark_of_mastery() {
        return mark_of_mastery;
    }

    public int getTank_id() {
        return tank_id;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public static class Statistics{
        private int battles;
        private int wins;

        public int getBattles() {
            return battles;
        }

        public int getWins() {
            return wins;
        }

        @Override
        public String toString() {
            return "Statistics{" +
                    "battles=" + battles +
                    ", wins=" + wins +
                    '}';
        }
    }
}
