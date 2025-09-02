package com.rawsaurus.model.tankopedia;

import java.util.Map;

public class PersonalReserves {
    private int booster_id;
    private String description;
    private long expires_at;
    private boolean is_auto;
    private int lifetime;
    private String name;
    private int price_credit;
    private int price_gold;
    private String resource;
    private Map<String, String> images;

    public int getBooster_id() {
        return booster_id;
    }

    public String getDescription() {
        return description;
    }

    public long getExpires_at() {
        return expires_at;
    }

    public boolean isIs_auto() {
        return is_auto;
    }

    public int getLifetime() {
        return lifetime;
    }

    public String getName() {
        return name;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public int getPrice_gold() {
        return price_gold;
    }

    public String getResource() {
        return resource;
    }

    public Map<String, String> getImages() {
        return images;
    }

    @Override
    public String toString() {
        return "PersonalReserves{" +
                "booster_id=" + booster_id +
                ", description='" + description + '\'' +
                ", expires_at=" + expires_at +
                ", is_auto=" + is_auto +
                ", lifetime=" + lifetime +
                ", name='" + name + '\'' +
                ", price_credit=" + price_credit +
                ", price_gold=" + price_gold +
                ", resource='" + resource + '\'' +
                ", images=" + images +
                '}';
    }
}
