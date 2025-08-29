package com.rawsaurus.model.status;

import com.rawsaurus.model.accounts.PlayersVehicles;

import java.util.List;
import java.util.Map;

public class OkStatusMap<T> {
    private String status;
    private Meta meta;
    private Map<String, T> data;

    public String getStatus() {
        return status;
    }

    public Meta getMeta() {
        return meta;
    }

    public Map<String, T> getData() {
        return data;
    }

    public static class Meta {
        private int count;

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return "Meta{" +
                    "count=" + count +
                    '}';
        }
    }
}
