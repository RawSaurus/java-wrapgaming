package com.rawsaurus.model.clans;

import com.rawsaurus.model.statistics.Clan;

public class ClanMemberDetails {
    private int account_id;
    private String account_name;
    private long joined_at;
    private String role;
    private String role_i18n;
    private Clan clan;

    public int getAccount_id() {
        return account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public long getJoined_at() {
        return joined_at;
    }

    public String getRole() {
        return role;
    }

    public String getRole_i18n() {
        return role_i18n;
    }

    public Clan getClan() {
        return clan;
    }

    @Override
    public String toString() {
        return "ClanMemberDetails{" +
                "account_id=" + account_id +
                ", account_name='" + account_name + '\'' +
                ", joined_at=" + joined_at +
                ", role='" + role + '\'' +
                ", role_i18n='" + role_i18n + '\'' +
                ", clan=" + clan +
                '}';
    }

    private static class Clan{
        private int clan_id;
        private String color;
        private long created_at;
        private int members_count;
        private String name;
        private String tag;
        private Emblems emblems;

        public int getClan_id() {
            return clan_id;
        }

        public String getColor() {
            return color;
        }

        public long getCreated_at() {
            return created_at;
        }

        public int getMembers_count() {
            return members_count;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public Emblems getEmblems() {
            return emblems;
        }

        @Override
        public String toString() {
            return "Clan{" +
                    "clan_id=" + clan_id +
                    ", color='" + color + '\'' +
                    ", created_at=" + created_at +
                    ", members_count=" + members_count +
                    ", name='" + name + '\'' +
                    ", tag='" + tag + '\'' +
                    ", emblems=" + emblems +
                    '}';
        }
    }
}
