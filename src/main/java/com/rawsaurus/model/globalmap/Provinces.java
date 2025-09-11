package com.rawsaurus.model.globalmap;

import java.util.List;

public class Provinces {
    private String arena_id;
    private String arena_name;
    private List<Integer> attackers;
    private String battles_start_at;
    private List<Integer> competitors;
    private int current_min_bet;
    private int daily_revenue;
    private String front_id;
    private boolean is_borders_disabled;
    private String landing_type;
    private int last_won_bet;
    private int max_bets;
    private List<String> neighbours;
    private int owner_clan_id;
    private String pillage_end_at;
    private String prime_time;
    private String province_id;
    private String province_name;
    private int revenue_level;
    private int round_number;
    private String server;
    private String status;
    private String uri;
    private boolean world_redivision;
    private List<ActiveBattles> active_battles;

    public String getArena_id() {
        return arena_id;
    }

    public String getArena_name() {
        return arena_name;
    }

    public List<Integer> getAttackers() {
        return attackers;
    }

    public String getBattles_start_at() {
        return battles_start_at;
    }

    public List<Integer> getCompetitors() {
        return competitors;
    }

    public int getCurrent_min_bet() {
        return current_min_bet;
    }

    public int getDaily_revenue() {
        return daily_revenue;
    }

    public String getFront_id() {
        return front_id;
    }

    public boolean isIs_borders_disabled() {
        return is_borders_disabled;
    }

    public String getLanding_type() {
        return landing_type;
    }

    public int getLast_won_bet() {
        return last_won_bet;
    }

    public int getMax_bets() {
        return max_bets;
    }

    public List<String> getNeighbours() {
        return neighbours;
    }

    public int getOwner_clan_id() {
        return owner_clan_id;
    }

    public String getPillage_end_at() {
        return pillage_end_at;
    }

    public String getPrime_time() {
        return prime_time;
    }

    public String getProvince_id() {
        return province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public int getRevenue_level() {
        return revenue_level;
    }

    public int getRound_number() {
        return round_number;
    }

    public String getServer() {
        return server;
    }

    public String getStatus() {
        return status;
    }

    public String getUri() {
        return uri;
    }

    public boolean isWorld_redivision() {
        return world_redivision;
    }

    public List<ActiveBattles> getActive_battles() {
        return active_battles;
    }

    @Override
    public String toString() {
        return "Provinces{" +
                "arena_id='" + arena_id + '\'' +
                ", arena_name='" + arena_name + '\'' +
                ", attackers=" + attackers +
                ", battles_start_at='" + battles_start_at + '\'' +
                ", competitors=" + competitors +
                ", current_min_bet=" + current_min_bet +
                ", daily_revenue=" + daily_revenue +
                ", front_id='" + front_id + '\'' +
                ", is_borders_disabled=" + is_borders_disabled +
                ", landing_type='" + landing_type + '\'' +
                ", last_won_bet=" + last_won_bet +
                ", max_bets=" + max_bets +
                ", neighbours=" + neighbours +
                ", owner_clan_id=" + owner_clan_id +
                ", pillage_end_at='" + pillage_end_at + '\'' +
                ", prime_time='" + prime_time + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                ", revenue_level=" + revenue_level +
                ", round_number=" + round_number +
                ", server='" + server + '\'' +
                ", status='" + status + '\'' +
                ", uri='" + uri + '\'' +
                ", world_redivision=" + world_redivision +
                ", active_battles=" + active_battles +
                '}';
    }

    private static class ActiveBattles{
        private int battle_reward;
        private int round;
        private String start_at;
        private Clan clan_a;
        private Clan clan_b;

        public int getBattle_reward() {
            return battle_reward;
        }

        public int getRound() {
            return round;
        }

        public String getStart_at() {
            return start_at;
        }

        public Clan getClan_a() {
            return clan_a;
        }

        public Clan getClan_b() {
            return clan_b;
        }

        @Override
        public String toString() {
            return "ActiveBattles{" +
                    "battle_reward=" + battle_reward +
                    ", round=" + round +
                    ", start_at='" + start_at + '\'' +
                    ", clan_a=" + clan_a +
                    ", clan_b=" + clan_b +
                    '}';
        }

        private static class Clan{
            private int battle_reward;
            private int clan_id;
            private int loose_elo_delta;
            private int win_elo_delta;


            public int getBattle_reward() {
                return battle_reward;
            }

            public int getClan_id() {
                return clan_id;
            }

            public int getLoose_elo_delta() {
                return loose_elo_delta;
            }

            public int getWin_elo_delta() {
                return win_elo_delta;
            }

            @Override
            public String toString() {
                return "Clan{" +
                        "battle_reward=" + battle_reward +
                        ", clan_id=" + clan_id +
                        ", loose_elo_delta=" + loose_elo_delta +
                        ", win_elo_delta=" + win_elo_delta +
                        '}';
            }
        }
    }
}
