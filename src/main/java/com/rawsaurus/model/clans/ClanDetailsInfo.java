package com.rawsaurus.model.clans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ClanDetailsInfo {
    private boolean accepts_join_requests;
    private int clan_id;
    private String color;
    private long created_at;
    private int creator_id;
    private String creator_name;
    private String description;
    private String description_html;
    private boolean is_clan_disbanded;
    private int leader_id;
    private String leader_name;
    private int members_count;
    private String motto;
    private String name;
    private String old_name;
    private String old_tag;
    private long renamed_at;
    private String tag;
    private long updated_at;
    private Emblems emblems;
    private List<Members> members;
    @SerializedName("private")
    private ClanPrivate clan_private;

    public boolean isAccepts_join_requests() {
        return accepts_join_requests;
    }

    public int getClan_id() {
        return clan_id;
    }

    public String getColor() {
        return color;
    }

    public long getCreated_at() {
        return created_at;
    }

    public int getCreator_id() {
        return creator_id;
    }

    public String getCreator_name() {
        return creator_name;
    }

    public String getDescription() {
        return description;
    }

    public String getDescription_html() {
        return description_html;
    }

    public boolean isIs_clan_disbanded() {
        return is_clan_disbanded;
    }

    public int getLeader_id() {
        return leader_id;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public int getMembers_count() {
        return members_count;
    }

    public String getMotto() {
        return motto;
    }

    public String getName() {
        return name;
    }

    public String getOld_name() {
        return old_name;
    }

    public String getOld_tag() {
        return old_tag;
    }

    public long getRenamed_at() {
        return renamed_at;
    }

    public String getTag() {
        return tag;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public Emblems getEmblems() {
        return emblems;
    }

    public List<Members> getMembers() {
        return members;
    }

    public ClanPrivate getClan_private() {
        return clan_private;
    }

    @Override
    public String toString() {
        return "ClanDetails{" +
                "accepts_join_requests=" + accepts_join_requests +
                ", clan_id=" + clan_id +
                ", color='" + color + '\'' +
                ", created_at=" + created_at +
                ", creator_id=" + creator_id +
                ", creator_name='" + creator_name + '\'' +
                ", description='" + description + '\'' +
                ", description_html='" + description_html + '\'' +
                ", is_clan_disbanded=" + is_clan_disbanded +
                ", leader_id=" + leader_id +
                ", leader_name='" + leader_name + '\'' +
                ", members_count=" + members_count +
                ", motto='" + motto + '\'' +
                ", name='" + name + '\'' +
                ", old_name='" + old_name + '\'' +
                ", old_tag='" + old_tag + '\'' +
                ", renamed_at=" + renamed_at +
                ", tag='" + tag + '\'' +
                ", updated_at=" + updated_at +
                ", emblems=" + emblems +
                ", members=" + members +
                ", clan_private=" + clan_private +
                '}';
    }

    private static class Members{
        private int account_id;
        private String account_name;
        private long joined_at;
        private String role;
        private String role_i18n;

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

        @Override
        public String toString() {
            return "Members{" +
                    "account_id=" + account_id +
                    ", account_name='" + account_name + '\'' +
                    ", joined_at=" + joined_at +
                    ", role='" + role + '\'' +
                    ", role_i18n='" + role_i18n + '\'' +
                    '}';
        }
    }

    private static class ClanPrivate{
        private List<Integer> online_members;
        private int treasury;
        private ClanTreasury clan_treasury;

        public List<Integer> getOnline_members() {
            return online_members;
        }

        public int getTreasury() {
            return treasury;
        }

        public ClanTreasury getClan_treasury() {
            return clan_treasury;
        }

        @Override
        public String toString() {
            return "Private{" +
                    "online_members=" + online_members +
                    ", treasury=" + treasury +
                    ", clan_treasury=" + clan_treasury +
                    '}';
        }

        private static class ClanTreasury{
            private int credits;
            private int crystal;
            private int gold;

            public int getCredits() {
                return credits;
            }

            public int getCrystal() {
                return crystal;
            }

            public int getGold() {
                return gold;
            }

            @Override
            public String toString() {
                return "ClanTreasury{" +
                        "credits=" + credits +
                        ", crystal=" + crystal +
                        ", gold=" + gold +
                        '}';
            }
        }
    }
}
