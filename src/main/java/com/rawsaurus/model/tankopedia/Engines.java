package com.rawsaurus.model.tankopedia;

import java.util.Arrays;

class Engines {
    private int fire_starting_chance;
    private int level;
    private int module_id;
    private String name;
    private String name_i18n;
    private String nation;
    private int power;
    private int price_credit;
    private int price_gold;
    private int[] tanks;

    public int getFire_starting_chance() {
        return fire_starting_chance;
    }

    public int getLevel() {
        return level;
    }

    public int getModule_id() {
        return module_id;
    }

    public String getName() {
        return name;
    }

    public String getName_i18n() {
        return name_i18n;
    }

    public String getNation() {
        return nation;
    }

    public int getPower() {
        return power;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public int getPrice_gold() {
        return price_gold;
    }

    public int[] getTanks() {
        return tanks;
    }

    @Override
    public String toString() {
        return "Engines{" +
                "fire_starting_chance=" + fire_starting_chance +
                ", level=" + level +
                ", module_id=" + module_id +
                ", name='" + name + '\'' +
                ", name_i18n='" + name_i18n + '\'' +
                ", nation='" + nation + '\'' +
                ", power=" + power +
                ", price_credit=" + price_credit +
                ", price_gold=" + price_gold +
                ", tanks=" + Arrays.toString(tanks) +
                '}';
    }
}
