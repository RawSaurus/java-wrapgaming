package com.rawsaurus.model.clan_ratings;

import com.rawsaurus.model.statistics.All;

import java.util.List;

public class DatesWithAvailableRatings {
    private All all;

    public All getAll() {
        return all;
    }

    @Override
    public String toString() {
        return "DatesWithAvailableRatings{" +
                "all=" + all +
                '}';
    }

    private static class All {
        private List<Long> dates;

        public List<Long> getDates() {
            return dates;
        }

        @Override
        public String toString() {
            return "DatesWithAvailableRatings{" +
                    "dates=" + dates +
                    '}';
        }
    }
}
