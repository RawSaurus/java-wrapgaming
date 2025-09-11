package com.rawsaurus.model.strongholds;

import java.util.Arrays;

public class InformationAboutStronghold {
    private int clan_id;
    private String clan_name;
    private String clan_tag;
    private String command_center_arena_id;
    private int stronghold_buildings_level;
    private int stronghold_level;
    private BattlesForStrongholdStatistics battles_for_strongholds_statistics;
    private BattlesSeriesForStrongholdStatistics battles_series_for_strongholds_statistics;
    private BuildingSlots[] building_slots;
    private SkirmishStatistics skirmish_statistics;

    public int getClan_id() {
        return clan_id;
    }

    public String getClan_name() {
        return clan_name;
    }

    public String getClan_tag() {
        return clan_tag;
    }

    public String getCommand_center_arena_id() {
        return command_center_arena_id;
    }

    public int getStronghold_buildings_level() {
        return stronghold_buildings_level;
    }

    public int getStronghold_level() {
        return stronghold_level;
    }

    public BattlesForStrongholdStatistics getBattles_for_strongholds_statistics() {
        return battles_for_strongholds_statistics;
    }

    public BattlesSeriesForStrongholdStatistics getBattles_series_for_strongholds_statistics() {
        return battles_series_for_strongholds_statistics;
    }

    public BuildingSlots[] getBuilding_slots() {
        return building_slots;
    }

    public SkirmishStatistics getSkirmish_statistics() {
        return skirmish_statistics;
    }

    @Override
    public String toString() {
        return "InformationAboutStronghold{" +
                "clan_id=" + clan_id +
                ", clan_name='" + clan_name + '\'' +
                ", clan_tag='" + clan_tag + '\'' +
                ", command_center_arena_id='" + command_center_arena_id + '\'' +
                ", stronghold_buildings_level=" + stronghold_buildings_level +
                ", stronghold_level=" + stronghold_level +
                ", battles_for_strongholds_statistics=" + battles_for_strongholds_statistics +
                ", battles_series_for_strongholds_statistics=" + battles_series_for_strongholds_statistics +
                ", building_slots=" + Arrays.toString(building_slots) +
                ", skirmish_statistics=" + skirmish_statistics +
                '}';
    }

    private static class BattlesForStrongholdStatistics{
        private long last_time_10;
        private int lose_10;
        private int total_10;
        private int total_10_in_28d;
        private int win_10;
        private int win_10_in_28d;

        public int getLose_10() {
            return lose_10;
        }

        public int getTotal_10() {
            return total_10;
        }

        public int getTotal_10_in_28d() {
            return total_10_in_28d;
        }

        public int getWin_10() {
            return win_10;
        }

        public int getWin_10_in_28d() {
            return win_10_in_28d;
        }

        @Override
        public String toString() {
            return "BattlesForStrongholdStatistics{" +
                    "lose_10=" + lose_10 +
                    ", total_10=" + total_10 +
                    ", total_10_in_28d=" + total_10_in_28d +
                    ", win_10=" + win_10 +
                    ", win_10_in_28d=" + win_10_in_28d +
                    '}';
        }
    }

    private static class BattlesSeriesForStrongholdStatistics{
        private int lose_10;
        private int total_10;
        private int total_10_in_28d;
        private int win_10;
        private int win_10_in_28d;

        public int getLose_10() {
            return lose_10;
        }

        public int getTotal_10() {
            return total_10;
        }

        public int getTotal_10_in_28d() {
            return total_10_in_28d;
        }

        public int getWin_10() {
            return win_10;
        }

        public int getWin_10_in_28d() {
            return win_10_in_28d;
        }

        @Override
        public String toString() {
            return "BattlesSeriesForStrongholdStatistics{" +
                    "lose_10=" + lose_10 +
                    ", total_10=" + total_10 +
                    ", total_10_in_28d=" + total_10_in_28d +
                    ", win_10=" + win_10 +
                    ", win_10_in_28d=" + win_10_in_28d +
                    '}';
        }
    }

    private static class BuildingSlots{
        private String arena_id;
        private int building_level;
        private String building_title;
        private String direction;
        private String position;
        private String reserve_title;

        public String getArena_id() {
            return arena_id;
        }

        public int getBuilding_level() {
            return building_level;
        }

        public String getBuilding_title() {
            return building_title;
        }

        public String getDirection() {
            return direction;
        }

        public String getPosition() {
            return position;
        }

        public String getReserve_title() {
            return reserve_title;
        }

        @Override
        public String toString() {
            return "BuildingSlots{" +
                    "arena_id='" + arena_id + '\'' +
                    ", building_level=" + building_level +
                    ", building_title='" + building_title + '\'' +
                    ", direction='" + direction + '\'' +
                    ", position='" + position + '\'' +
                    ", reserve_title='" + reserve_title + '\'' +
                    '}';
        }
    }

    private static class SkirmishStatistics{
        private long last_time_10;
        private long last_time_6;
        private long last_time_8;
        private int lose_10;
        private int lose_6;
        private int lose_8;
        private int total_10;
        private int total_10_in_28d;
        private int total_6;
        private int total_6_in_28d;
        private int total_8;
        private int total_8_in_28d;
        private int win_10;
        private int win_10_in_28d;
        private int win_6;
        private int win_6_in_28d;
        private int win_8;
        private int win_8_in_28d;

        public long getLast_time_10() {
            return last_time_10;
        }

        public long getLast_time_6() {
            return last_time_6;
        }

        public long getLast_time_8() {
            return last_time_8;
        }

        public int getLose_10() {
            return lose_10;
        }

        public int getLose_6() {
            return lose_6;
        }

        public int getLose_8() {
            return lose_8;
        }

        public int getTotal_10() {
            return total_10;
        }

        public int getTotal_10_in_28d() {
            return total_10_in_28d;
        }

        public int getTotal_6() {
            return total_6;
        }

        public int getTotal_6_in_28d() {
            return total_6_in_28d;
        }

        public int getTotal_8() {
            return total_8;
        }

        public int getTotal_8_in_28d() {
            return total_8_in_28d;
        }

        public int getWin_10() {
            return win_10;
        }

        public int getWin_10_in_28d() {
            return win_10_in_28d;
        }

        public int getWin_6() {
            return win_6;
        }

        public int getWin_6_in_28d() {
            return win_6_in_28d;
        }

        public int getWin_8() {
            return win_8;
        }

        public int getWin_8_in_28d() {
            return win_8_in_28d;
        }

        @Override
        public String toString() {
            return "SkirmishStatistics{" +
                    "last_time_10=" + last_time_10 +
                    ", last_time_6=" + last_time_6 +
                    ", last_time_8=" + last_time_8 +
                    ", lose_10=" + lose_10 +
                    ", lose_6=" + lose_6 +
                    ", lose_8=" + lose_8 +
                    ", total_10=" + total_10 +
                    ", total_10_in_28d=" + total_10_in_28d +
                    ", total_6=" + total_6 +
                    ", total_6_in_28d=" + total_6_in_28d +
                    ", total_8=" + total_8 +
                    ", total_8_in_28d=" + total_8_in_28d +
                    ", win_10=" + win_10 +
                    ", win_10_in_28d=" + win_10_in_28d +
                    ", win_6=" + win_6 +
                    ", win_6_in_28d=" + win_6_in_28d +
                    ", win_8=" + win_8 +
                    ", win_8_in_28d=" + win_8_in_28d +
                    '}';
        }
    }
}
