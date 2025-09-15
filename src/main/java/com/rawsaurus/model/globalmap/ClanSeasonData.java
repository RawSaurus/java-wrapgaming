package com.rawsaurus.model.globalmap;

import java.util.List;

public class ClanSeasonData {
    private Seasons seasons;

    public Seasons getSeasons() {
        return seasons;
    }

    @Override
    public String toString() {
        return "ClanSeasonData{" +
                "seasons=" + seasons +
                '}';
    }

    private static class Seasons{
        private int battles;
        private int elo;
        private int rank;
        private int rank_delta;
        private int vehicle_level;
        private int victory_points;
        private int victory_points_since_turn;
        private int wins;

        public int getBattles() {
            return battles;
        }

        public int getElo() {
            return elo;
        }

        public int getRank() {
            return rank;
        }

        public int getRank_delta() {
            return rank_delta;
        }

        public int getVehicle_level() {
            return vehicle_level;
        }

        public int getVictory_points() {
            return victory_points;
        }

        public int getVictory_points_since_turn() {
            return victory_points_since_turn;
        }

        public int getWins() {
            return wins;
        }

        @Override
        public String toString() {
            return "Seasons{" +
                    "battles=" + battles +
                    ", elo=" + elo +
                    ", rank=" + rank +
                    ", rank_delta=" + rank_delta +
                    ", vehicle_level=" + vehicle_level +
                    ", victory_points=" + victory_points +
                    ", victory_points_since_turn=" + victory_points_since_turn +
                    ", wins=" + wins +
                    '}';
        }
    }
}
