package com.rawsaurus.model.status;

import com.rawsaurus.model.accounts.PlayersVehicles;

import java.util.List;
import java.util.Map;

public class OkStatus<T> {
//    private String status;
//    private Meta meta;
    private T[] data;

//    public String getStatus() {
//        return status;
//    }
//
//    public OkStatusMap.Meta getMeta() {
//        return meta;
//    }

    public T[] getData() {
        return data;
    }

//    public static class Meta {
//        private int count;
//
//        public int getCount() {
//            return count;
//        }
//
//        @Override
//        public String toString() {
//            return "Meta{" +
//                    "count=" + count +
//                    '}';
//        }
//    }
}
