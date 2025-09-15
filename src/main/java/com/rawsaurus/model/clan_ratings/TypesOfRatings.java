package com.rawsaurus.model.clan_ratings;

import com.rawsaurus.model.statistics.All;

import java.util.List;

public class TypesOfRatings {
    private All all;

    public All getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "TypesOfRatings{" +
                "all=" + all +
                '}';
    }

    private static class All {
        private List<String> rank_fields;
        private String type;

        public List<String> getRank_fields() {
            return rank_fields;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "TypesOfRatings{" +
                    "rank_fields=" + rank_fields +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
