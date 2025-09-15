package com.rawsaurus.model.globalmap;

import java.util.List;

public class Events {
    private String end;
    private String event_id;
    private String event_name;
    private String start;
    private String status;
    private List<Fronts> fronts;

    public String getEnd() {
        return end;
    }

    public String getEvent_id() {
        return event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public String getStart() {
        return start;
    }

    public String getStatus() {
        return status;
    }

    public List<Fronts> getFronts() {
        return fronts;
    }

    @Override
    public String toString() {
        return "Events{" +
                "end='" + end + '\'' +
                ", event_id='" + event_id + '\'' +
                ", event_name='" + event_name + '\'' +
                ", start='" + start + '\'' +
                ", status='" + status + '\'' +
                ", fronts=" + fronts +
                '}';
    }

    private static class Fronts{
        private String front_id;
        private String front_name;
        private String url;

        public String getFront_id() {
            return front_id;
        }

        public String getFront_name() {
            return front_name;
        }

        public String getUrl() {
            return url;
        }

        @Override
        public String toString() {
            return "Fronts{" +
                    "front_id='" + front_id + '\'' +
                    ", front_name='" + front_name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}
