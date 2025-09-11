package com.rawsaurus.model.statistics;

public class Random {
    private int battle_avg_xp;
    private int battles;
    private int battles_on_stunning_vehicles;
    private int capture_points;
    private int damage_dealt;
    private int damage_received;
    private int draws;
    private int dropped_capture_points;
    private int frags;
    private int hits;
    private int hits_percents;
    private int losses;
    private int max_damage;
    private int max_frags;
    private int max_xp;
    private int radio_assisted_damage;
    private int shots;
    private int spotted;
    private int stun_assisted_damage;
    private int stun_number;
    private int survived_battles;
    private int track_assisted_damage;
    private int wins;
    private int xp;

    public int getBattle_avg_xp() {
        return battle_avg_xp;
    }

    public int getBattles() {
        return battles;
    }

    public int getBattles_on_stunning_vehicles() {
        return battles_on_stunning_vehicles;
    }

    public int getCapture_points() {
        return capture_points;
    }

    public int getDamage_dealt() {
        return damage_dealt;
    }

    public int getDamage_received() {
        return damage_received;
    }

    public int getDraws() {
        return draws;
    }

    public int getDropped_capture_points() {
        return dropped_capture_points;
    }

    public int getFrags() {
        return frags;
    }

    public int getHits() {
        return hits;
    }

    public int getHits_percents() {
        return hits_percents;
    }

    public int getLosses() {
        return losses;
    }

    public int getMax_damage() {
        return max_damage;
    }

    public int getMax_frags() {
        return max_frags;
    }

    public int getMax_xp() {
        return max_xp;
    }

    public int getRadio_assisted_damage() {
        return radio_assisted_damage;
    }

    public int getShots() {
        return shots;
    }

    public int getSpotted() {
        return spotted;
    }

    public int getStun_assisted_damage() {
        return stun_assisted_damage;
    }

    public int getStun_number() {
        return stun_number;
    }

    public int getSurvived_battles() {
        return survived_battles;
    }

    public int getTrack_assisted_damage() {
        return track_assisted_damage;
    }

    public int getWins() {
        return wins;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Random{" +
                "battle_avg_xp=" + battle_avg_xp +
                ", battles=" + battles +
                ", battles_on_stunning_vehicles=" + battles_on_stunning_vehicles +
                ", capture_points=" + capture_points +
                ", damage_dealt=" + damage_dealt +
                ", damage_received=" + damage_received +
                ", draws=" + draws +
                ", dropped_capture_points=" + dropped_capture_points +
                ", frags=" + frags +
                ", hits=" + hits +
                ", hits_percents=" + hits_percents +
                ", losses=" + losses +
                ", max_damage=" + max_damage +
                ", max_frags=" + max_frags +
                ", max_xp=" + max_xp +
                ", radio_assisted_damage=" + radio_assisted_damage +
                ", shots=" + shots +
                ", spotted=" + spotted +
                ", stun_assisted_damage=" + stun_assisted_damage +
                ", stun_number=" + stun_number +
                ", survived_battles=" + survived_battles +
                ", track_assisted_damage=" + track_assisted_damage +
                ", wins=" + wins +
                ", xp=" + xp +
                '}';
    }
}
