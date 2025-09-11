package com.rawsaurus.model.accounts;

import com.google.gson.annotations.SerializedName;
import com.rawsaurus.model.statistics.*;
import com.rawsaurus.model.players_vehicles.VehicleStatistics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PlayerPersonalData {
    private int account_id;
    private int clan_id;
    private String client_language;
    private long created_at;
    private int global_rating;
    private long last_battle_time;
    private long logout_at;
    private String nickname;
    private long updated_at;
    @SerializedName("private")
    private PrivateInfo privateInfo;
    private Statistics statistics;

    @Override
    public String toString() {
        return "PlayerPersonalData{" +
                "account_id=" + account_id +
                ", clan_id=" + clan_id +
                ", client_language='" + client_language + '\'' +
                ", created_at=" + created_at +
                ", global_rating=" + global_rating +
                ", last_battle_time=" + last_battle_time +
                ", logout_at=" + logout_at +
                ", nickname='" + nickname + '\'' +
                ", updated_at=" + updated_at +
                ", privateInfo=" + privateInfo +
                ", statistics=" + statistics +
                '}';
    }

    private static class PrivateInfo{
        private String ban_info;
        private long ban_time;
        private int battle_life_time;
        private int bonds;
        private int credits;
        private int free_xp;
        private int[] garage;
        private int gold;
        private boolean is_bound_to_phone;
        private boolean is_premium;
        private Map<Integer, String> personal_missions;
        private long premium_expires_at;
        private Boosters boosters;
        private GroupedContacts grouped_contacts;
        private Map<Integer, Rented> rented;
        private Restrictions restrictions;

        @Override
        public String toString() {
            return "PrivateInfo{" +
                    "ban_info='" + ban_info + '\'' +
                    ", ban_time=" + ban_time +
                    ", battle_life_time=" + battle_life_time +
                    ", bonds=" + bonds +
                    ", credits=" + credits +
                    ", free_xp=" + free_xp +
                    ", garage=" + Arrays.toString(garage) +
                    ", gold=" + gold +
                    ", is_bound_to_phone=" + is_bound_to_phone +
                    ", is_premium=" + is_premium +
                    ", personal_missions=" + personal_missions +
                    ", premium_expires_at=" + premium_expires_at +
                    ", boosters=" + boosters +
                    ", grouped_contacts=" + grouped_contacts +
                    ", rented=" + rented +
                    ", restrictions=" + restrictions +
                    '}';
        }

        private static class Boosters{
            private int count;
            private long expiration_time;
            private String state;

            public int getCount() {
                return count;
            }

            public long getExpiration_time() {
                return expiration_time;
            }

            public String getState() {
                return state;
            }

            @Override
            public String toString() {
                return "Boosters{" +
                        "count=" + count +
                        ", expiration_time=" + expiration_time +
                        ", state='" + state + '\'' +
                        '}';
            }
        }
        private static class GroupedContacts{
            private int[] blocked;
            private Map<String, List<Integer>> groups;
            private int[] ignored;
            private int[] muted;
            private int[] ungrouped;

            public int[] getBlocked() {
                return blocked;
            }

            public Map<String, List<Integer>> getGroups() {
                return groups;
            }

            public int[] getIgnored() {
                return ignored;
            }

            public int[] getMuted() {
                return muted;
            }

            public int[] getUngrouped() {
                return ungrouped;
            }

            @Override
            public String toString() {
                return "GroupedContacts{" +
                        "blocked=" + Arrays.toString(blocked) +
                        ", groups=" + groups +
                        ", ignored=" + Arrays.toString(ignored) +
                        ", muted=" + Arrays.toString(muted) +
                        ", ungrouped=" + Arrays.toString(ungrouped) +
                        '}';
            }
        }

        private static class Rented{
            private int compensation_credits;
            private int compensation_gold;
            private long expiration_time;
            private int tank_id;

            public int getCompensation_credits() {
                return compensation_credits;
            }

            public int getCompensation_gold() {
                return compensation_gold;
            }

            public long getExpiration_time() {
                return expiration_time;
            }

            public int getTank_id() {
                return tank_id;
            }

            @Override
            public String toString() {
                return "Rented{" +
                        "compensation_credits=" + compensation_credits +
                        ", compensation_gold=" + compensation_gold +
                        ", expiration_time=" + expiration_time +
                        ", tank_id=" + tank_id +
                        '}';
            }
        }

        private static class Restrictions{
            private long chat_ban_time;

            public long getChat_ban_time() {
                return chat_ban_time;
            }

            @Override
            public String toString() {
                return "Restrictions{" +
                        "chat_ban_time=" + chat_ban_time +
                        '}';
            }
        }
    }
    private static class Statistics{
        private int trees_cut;
        private Map<Integer, Integer> frags;
        private PlayerAll all;
        private PlayerClan clan;
        private PlayerCompany company;
        private PlayerEpic epic;
        private PlayerFallout fallout;
        private Globalmap globalmap_absolute;
        private Globalmap globalmap_champion;
        private Globalmap globalmap_middle;
        private Historical historical;
        private PlayerRandom random;
        private PlayerRanked_10x10 ranked_10x10;
        private Ranked_15x15 ranked_15x15;
        private PlayerRankedBattles ranked_battles;
        private RankedBattlesCurrent ranked_battles_current;
        private RankedBattlesPrevious ranked_battles_previous;
        private RankedSeason1 ranked_season_1;
        private RankedSeason2 ranked_season_2;
        private RankedSeason3 ranked_season_3;
        private PlayerRegularTeams regular_team;
        private PlayerStronghold stronghold_defense;
        private PlayerStronghold stronghold_skirmish;
        private PlayerTeam team;

        public int getTrees_cut() {
            return trees_cut;
        }

        public Map<Integer, Integer> getFrags() {
            return frags;
        }

        public PlayerAll getAll() {
            return all;
        }

        public PlayerClan getClan() {
            return clan;
        }

        public PlayerCompany getCompany() {
            return company;
        }

        public PlayerEpic getEpic() {
            return epic;
        }

        public PlayerFallout getFallout() {
            return fallout;
        }

        public Globalmap getGlobalmap_absolute() {
            return globalmap_absolute;
        }

        public Globalmap getGlobalmap_champion() {
            return globalmap_champion;
        }

        public Globalmap getGlobalmap_middle() {
            return globalmap_middle;
        }

        public Historical getHistorical() {
            return historical;
        }

        public PlayerRandom getRandom() {
            return random;
        }

        public PlayerRanked_10x10 getRanked_10x10() {
            return ranked_10x10;
        }

        public Ranked_15x15 getRanked_15x15() {
            return ranked_15x15;
        }

        public PlayerRankedBattles getRanked_battles() {
            return ranked_battles;
        }

        public RankedBattlesCurrent getRanked_battles_current() {
            return ranked_battles_current;
        }

        public RankedBattlesPrevious getRanked_battles_previous() {
            return ranked_battles_previous;
        }

        public RankedSeason1 getRanked_season_1() {
            return ranked_season_1;
        }

        public RankedSeason2 getRanked_season_2() {
            return ranked_season_2;
        }

        public RankedSeason3 getRanked_season_3() {
            return ranked_season_3;
        }

        public PlayerRegularTeams getRegular_team() {
            return regular_team;
        }

        public PlayerStronghold getStronghold_defense() {
            return stronghold_defense;
        }

        public PlayerStronghold getStronghold_skirmish() {
            return stronghold_skirmish;
        }

        public PlayerTeam getTeam() {
            return team;
        }

        @Override
        public String toString() {
            return "Statistics{" +
                    "trees_cut=" + trees_cut +
                    ", frags=" + frags +
                    ", all=" + all +
                    ", clan=" + clan +
                    ", company=" + company +
                    ", epic=" + epic +
                    ", fallout=" + fallout +
                    ", globalmap_absolute=" + globalmap_absolute +
                    ", globalmap_champion=" + globalmap_champion +
                    ", globalmap_middle=" + globalmap_middle +
                    ", historical=" + historical +
                    ", random=" + random +
                    ", ranked_10x10=" + ranked_10x10 +
                    ", ranked_15x15=" + ranked_15x15 +
                    ", ranked_battles=" + ranked_battles +
                    ", ranked_battles_current=" + ranked_battles_current +
                    ", ranked_battles_previous=" + ranked_battles_previous +
                    ", ranked_season_1=" + ranked_season_1 +
                    ", ranked_season_2=" + ranked_season_2 +
                    ", ranked_season_3=" + ranked_season_3 +
                    ", regular_team=" + regular_team +
                    ", stronghold_defense=" + stronghold_defense +
                    ", stronghold_skirmish=" + stronghold_skirmish +
                    ", team=" + team +
                    '}';
        }

        private static class PlayerAll extends All {
            private int max_damage;
            private int max_damage_tank_id;
            private int max_frags;
            private int max_frags_tank_id;
            private int max_xp;
            private int max_xp_tank_id;

//            public PlayerAll(int max_damage, int max_damage_tank_id, int max_frags, int max_frags_tank_id, int max_xp, int max_xp_tank_id) {
//                super();
//                this.max_damage = max_damage;
//                this.max_damage_tank_id = max_damage_tank_id;
//                this.max_frags = max_frags;
//                this.max_frags_tank_id = max_frags_tank_id;
//                this.max_xp = max_xp;
//                this.max_xp_tank_id = max_xp_tank_id;
//            }

            @Override
            public String toString() {
                return  super.toString() +
                        "max_damage=" + max_damage +
                        ", max_damage_tank_id=" + max_damage_tank_id +
                        ", max_frags=" + max_frags +
                        ", max_frags_tank_id=" + max_frags_tank_id +
                        ", max_xp=" + max_xp +
                        ", max_xp_tank_id=" + max_xp_tank_id +
                        '}';
            }
        }

        private static class PlayerClan extends Clan {
            private double avg_damage_assisted;
            private double avg_damage_assisted_radio;
            private double avg_damage_assisted_stun;
            private double avg_damage_assisted_track;
            private double avg_damage_blocked;
            private int explosion_hits;
            private int explosion_hits_received;
            private int no_damage_direct_hits_received;
            private int piercings;
            private int piercings_received;
            private double tanking_factor;

            public double getAvg_damage_assisted() {
                return avg_damage_assisted;
            }

            public double getAvg_damage_assisted_radio() {
                return avg_damage_assisted_radio;
            }

            public double getAvg_damage_assisted_stun() {
                return avg_damage_assisted_stun;
            }

            public double getAvg_damage_assisted_track() {
                return avg_damage_assisted_track;
            }

            public double getAvg_damage_blocked() {
                return avg_damage_blocked;
            }

            public int getExplosion_hits() {
                return explosion_hits;
            }

            public int getExplosion_hits_received() {
                return explosion_hits_received;
            }

            public int getNo_damage_direct_hits_received() {
                return no_damage_direct_hits_received;
            }

            public int getPiercings() {
                return piercings;
            }

            public int getPiercings_received() {
                return piercings_received;
            }

            public double getTanking_factor() {
                return tanking_factor;
            }

            @Override
            public String toString() {
                return super.toString() +
                        ", avg_damage_assisted=" + avg_damage_assisted +
                        ", avg_damage_assisted_radio=" + avg_damage_assisted_radio +
                        ", avg_damage_assisted_stun=" + avg_damage_assisted_stun +
                        ", avg_damage_assisted_track=" + avg_damage_assisted_track +
                        ", avg_damage_blocked=" + avg_damage_blocked +
                        ", explosion_hits=" + explosion_hits +
                        ", explosion_hits_received=" + explosion_hits_received +
                        ", no_damage_direct_hits_received=" + no_damage_direct_hits_received +
                        ", piercings=" + piercings +
                        ", piercings_received=" + piercings_received +
                        ", tanking_factor=" + tanking_factor +
                        '}';
            }
        }

        private static class PlayerCompany extends Company {
            private double avg_damage_assisted;
            private double avg_damage_assisted_radio;
            private double avg_damage_assisted_stun;
            private double avg_damage_assisted_track;
            private double avg_damage_blocked;
            private int direct_hits_received;
            private int explosion_hits;
            private int explosion_hits_received;
            private int no_damage_direct_hits_received;
            private int piercings;
            private int piercings_received;
            private double tanking_factor;

            public double getAvg_damage_assisted() {
                return avg_damage_assisted;
            }

            public double getAvg_damage_assisted_radio() {
                return avg_damage_assisted_radio;
            }

            public double getAvg_damage_assisted_stun() {
                return avg_damage_assisted_stun;
            }

            public double getAvg_damage_assisted_track() {
                return avg_damage_assisted_track;
            }

            public double getAvg_damage_blocked() {
                return avg_damage_blocked;
            }

            public int getDirect_hits_received() {
                return direct_hits_received;
            }

            public int getExplosion_hits() {
                return explosion_hits;
            }

            public int getExplosion_hits_received() {
                return explosion_hits_received;
            }

            public int getNo_damage_direct_hits_received() {
                return no_damage_direct_hits_received;
            }

            public int getPiercings() {
                return piercings;
            }

            public int getPiercings_received() {
                return piercings_received;
            }

            public double getTanking_factor() {
                return tanking_factor;
            }

            @Override
            public String toString() {
                return super.toString() +
                        ", avg_damage_assisted=" + avg_damage_assisted +
                        ", avg_damage_assisted_radio=" + avg_damage_assisted_radio +
                        ", avg_damage_assisted_stun=" + avg_damage_assisted_stun +
                        ", avg_damage_assisted_track=" + avg_damage_assisted_track +
                        ", avg_damage_blocked=" + avg_damage_blocked +
                        ", direct_hits_received=" + direct_hits_received +
                        ", explosion_hits=" + explosion_hits +
                        ", explosion_hits_received=" + explosion_hits_received +
                        ", no_damage_direct_hits_received=" + no_damage_direct_hits_received +
                        ", piercings=" + piercings +
                        ", piercings_received=" + piercings_received +
                        ", tanking_factor=" + tanking_factor +
                        '}';
            }
        }

        private static class PlayerEpic extends Epic {
            private double avg_damage_assisted;
            private double avg_damage_assisted_radio;
            private double avg_damage_assisted_stun;
            private double avg_damage_assisted_track;
            private double avg_damage_blocked;
            private int direct_hits_received;
            private int explosion_hits;
            private int explosion_hits_received;
            private int max_damage_tank_id;
            private int max_frag_tank_id;
            private int max_xp_tank_id;
            private int no_damage_direct_hits_received;
            private int piercings;
            private int piercings_received;
            private double tanking_factor;

            public double getAvg_damage_assisted() {
                return avg_damage_assisted;
            }

            public double getAvg_damage_assisted_radio() {
                return avg_damage_assisted_radio;
            }

            public double getAvg_damage_assisted_stun() {
                return avg_damage_assisted_stun;
            }

            public double getAvg_damage_assisted_track() {
                return avg_damage_assisted_track;
            }

            public double getAvg_damage_blocked() {
                return avg_damage_blocked;
            }

            public int getDirect_hits_received() {
                return direct_hits_received;
            }

            public int getExplosion_hits() {
                return explosion_hits;
            }

            public int getExplosion_hits_received() {
                return explosion_hits_received;
            }

            public int getMax_damage_tank_id() {
                return max_damage_tank_id;
            }

            public int getMax_frag_tank_id() {
                return max_frag_tank_id;
            }

            public int getMax_xp_tank_id() {
                return max_xp_tank_id;
            }

            public int getNo_damage_direct_hits_received() {
                return no_damage_direct_hits_received;
            }

            public int getPiercings() {
                return piercings;
            }

            public int getPiercings_received() {
                return piercings_received;
            }

            public double getTanking_factor() {
                return tanking_factor;
            }

            @Override
            public String toString() {
                return super.toString() +
                        ", avg_damage_assisted=" + avg_damage_assisted +
                        ", avg_damage_assisted_radio=" + avg_damage_assisted_radio +
                        ", avg_damage_assisted_stun=" + avg_damage_assisted_stun +
                        ", avg_damage_assisted_track=" + avg_damage_assisted_track +
                        ", avg_damage_blocked=" + avg_damage_blocked +
                        ", direct_hits_received=" + direct_hits_received +
                        ", explosion_hits=" + explosion_hits +
                        ", explosion_hits_received=" + explosion_hits_received +
                        ", max_damage_tank_id=" + max_damage_tank_id +
                        ", max_frag_tank_id=" + max_frag_tank_id +
                        ", max_xp_tank_id=" + max_xp_tank_id +
                        ", no_damage_direct_hits_received=" + no_damage_direct_hits_received +
                        ", piercings=" + piercings +
                        ", piercings_received=" + piercings_received +
                        ", tanking_factor=" + tanking_factor +
                        '}';
            }
        }

        private static class PlayerFallout extends Fallout{
            private int max_damage_tank_id;
            private int max_frags_tank_id;
            private int max_xp_tank_id;
            private int resource_absorbed;

            public int getMax_damage_tank_id() {
                return max_damage_tank_id;
            }

            public int getMax_frags_tank_id() {
                return max_frags_tank_id;
            }

            public int getMax_xp_tank_id() {
                return max_xp_tank_id;
            }

            public int getResource_absorbed() {
                return resource_absorbed;
            }

            @Override
            public String toString() {
                return super.toString() +
                        ", max_damage_tank_id=" + max_damage_tank_id +
                        ", max_frags_tank_id=" + max_frags_tank_id +
                        ", max_xp_tank_id=" + max_xp_tank_id +
                        ", resource_absorbed=" + resource_absorbed +
                        '}';
            }
        }

        private static class Historical extends BaseStats{

            @Override
            public String toString(){
                return "Historical{ " + super.toString();
            }
        }

        private static class PlayerRandom extends Random{
            private double avg_damage_assisted;
            private double avg_damage_assisted_radio;
            private double avg_damage_assisted_stun;
            private double avg_damage_assisted_track;
            private double avg_damage_blocked;
            private int direct_hits_received;
            private int explosion_hits;
            private int explosion_hits_received;
            private int no_damage_direct_hits_received;
            private int piercings;
            private int piercings_received;
            private double tanking_factor;

            public double getAvg_damage_assisted() {
                return avg_damage_assisted;
            }

            public double getAvg_damage_assisted_radio() {
                return avg_damage_assisted_radio;
            }

            public double getAvg_damage_assisted_stun() {
                return avg_damage_assisted_stun;
            }

            public double getAvg_damage_assisted_track() {
                return avg_damage_assisted_track;
            }

            public double getAvg_damage_blocked() {
                return avg_damage_blocked;
            }

            public int getDirect_hits_received() {
                return direct_hits_received;
            }

            public int getExplosion_hits() {
                return explosion_hits;
            }

            public int getExplosion_hits_received() {
                return explosion_hits_received;
            }

            public int getNo_damage_direct_hits_received() {
                return no_damage_direct_hits_received;
            }

            public int getPiercings() {
                return piercings;
            }

            public int getPiercings_received() {
                return piercings_received;
            }

            public double getTanking_factor() {
                return tanking_factor;
            }

            @Override
            public String toString() {
                return super.toString() +
                        ", avg_damage_assisted=" + avg_damage_assisted +
                        ", avg_damage_assisted_radio=" + avg_damage_assisted_radio +
                        ", avg_damage_assisted_stun=" + avg_damage_assisted_stun +
                        ", avg_damage_assisted_track=" + avg_damage_assisted_track +
                        ", avg_damage_blocked=" + avg_damage_blocked +
                        ", direct_hits_received=" + direct_hits_received +
                        ", explosion_hits=" + explosion_hits +
                        ", explosion_hits_received=" + explosion_hits_received +
                        ", no_damage_direct_hits_received=" + no_damage_direct_hits_received +
                        ", piercings=" + piercings +
                        ", piercings_received=" + piercings_received +
                        ", tanking_factor=" + tanking_factor +
                        '}';
            }
        }

        private static class PlayerRanked_10x10 extends BaseRankedBattles{

            @Override
            public String toString(){
                return "Ranked_10x10{" + super.toString();
            }
        }

        private static class Ranked_15x15 extends BaseRankedBattles{

            @Override
            public String toString(){
                return "Ranked_15x15{" + super.toString();
            }
        }

        private static class PlayerRankedBattles extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_battles{" + super.toString();
            }
        }

        private static class RankedBattlesCurrent extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_battles_current{" + super.toString();
            }
        }

        private static class RankedBattlesPrevious extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_battles_previous{" + super.toString();
            }
        }

        private static class RankedSeason1 extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_season_1{" + super.toString();
            }
        }

        private static class RankedSeason2 extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_season_2{" + super.toString();
            }
        }

        private static class RankedSeason3 extends BaseRankedBattles{

            @Override
            public String toString(){
                return "ranked_season_3{" + super.toString();
            }
        }

        private static class PlayerRegularTeams extends BaseRankedBattles{

            @Override
            public String toString(){
                return "regular_teams{" + super.toString();
            }
        }

        private static class PlayerStronghold extends StrongholdSkirmish{
            private int max_damage_tank_id;
            private int max_frags_tank_id;
            private int max_xp_tank_id;

            public int getMax_damage_tank_id() {
                return max_damage_tank_id;
            }

            public int getMax_frags_tank_id() {
                return max_frags_tank_id;
            }

            public int getMax_xp_tank_id() {
                return max_xp_tank_id;
            }

            @Override
            public String toString() {
                return "StrongholdDefense{" +
                        "max_damage_tank_id=" + max_damage_tank_id +
                        ", max_frags_tank_id=" + max_frags_tank_id +
                        ", max_xp_tank_id=" + max_xp_tank_id +
                        super.toString();
            }
        }

        private static class PlayerTeam extends BaseRankedBattles{

            @Override
            public String toString(){
                return "Team{" + super.toString();
            }
        }
    }
}
