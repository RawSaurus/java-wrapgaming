package com.rawsaurus.model.tankopedia;

public class VehicleConfigurations {
    private boolean is_default;
    private int price_credit;
    private String profile_id;
    private int tank_id;

    public boolean isIs_default() {
        return is_default;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public String getProfile_id() {
        return profile_id;
    }

    public int getTank_id() {
        return tank_id;
    }

    @Override
    public String toString() {
        return "VehicleConfigurations{" +
                "is_default=" + is_default +
                ", price_credit=" + price_credit +
                ", profile_id='" + profile_id + '\'' +
                ", tank_id=" + tank_id +
                '}';
    }
}
