package com.rawsaurus.model.authentication;

public class OpenIDLogin {
    private String location;

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "OpenIDLogin{" +
                "location='" + location + '\'' +
                '}';
    }
}
