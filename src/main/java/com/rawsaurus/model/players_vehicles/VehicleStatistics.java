package com.rawsaurus.model.players_vehicles;

import com.rawsaurus.model.statistics.*;

import java.util.Map;

public class VehicleStatistics {

    private int account_id;
    private int mark_of_mastery;
    private int max_frags;
    private int max_xp;
    private int tank_id;
    private Map<String, String> frags;
    private boolean in_garage;
    private All all;
    private Clan clan;
    private Company company;
    private Epic epic;
    private Fallout fallout;
    private Globalmap globalmap;
    private Random random;
    private Ranked_10x10 ranked_10x10;
    private RankedBattles ranked_battles;
    private RegularTeam regular_team;
    private StrongholdSkirmish stronghold_skirmish;
    private Team team;

    public int getAccount_id() {
        return account_id;
    }

    public int getMark_of_mastery() {
        return mark_of_mastery;
    }

    public int getMax_frags() {
        return max_frags;
    }

    public int getMax_xp() {
        return max_xp;
    }

    public int getTank_id() {
        return tank_id;
    }

    public Map<String, String> getFrags() {
        return frags;
    }

    public boolean isIn_garage() {
        return in_garage;
    }

    public All getAll() {
        return all;
    }

    public Clan getClan() {
        return clan;
    }

    public Company getCompany() {
        return company;
    }

    public Epic getEpic() {
        return epic;
    }

    public Fallout getFallout() {
        return fallout;
    }

    public Globalmap getGlobalmap() {
        return globalmap;
    }

    public Random getRandom() {
        return random;
    }

    public Ranked_10x10 getRanked_10x10() {
        return ranked_10x10;
    }

    public RankedBattles getRankedBattles() {
        return ranked_battles;
    }

    public RegularTeam getRegularTeam() {
        return regular_team;
    }

    public StrongholdSkirmish getStronghold_skirmish() {
        return stronghold_skirmish;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "VehicleStatistics{" +
                "account_id=" + account_id +
                ", mark_of_mastery=" + mark_of_mastery +
                ", max_frags=" + max_frags +
                ", max_xp=" + max_xp +
                ", tank_id=" + tank_id +
                ", frags=" + frags +
                ", in_garage=" + in_garage +
                ", all=" + all +
                ", clan=" + clan +
                ", company=" + company +
                ", epic=" + epic +
                ", fallout=" + fallout +
                ", globalmap=" + globalmap +
                ", random=" + random +
                ", ranked_10x10=" + ranked_10x10 +
                ", ranked_battles=" + ranked_battles +
                ", regular_team=" + regular_team +
                ", stronghold_skirmish=" + stronghold_skirmish +
                ", team=" + team +
                '}';
    }
}
