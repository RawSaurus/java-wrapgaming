package com.rawsaurus.model.tankopedia;

import java.util.Arrays;
import java.util.Map;

public class PersonalMissions {
    private int campaign_id;
    private String description;
    private String name;
    private Map<Integer, Operations> operations;

    public int getCampaign_id() {
        return campaign_id;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Operations> getOperations() {
        return operations;
    }

    @Override
    public String toString() {
        return "PersonalMissions{" +
                "campaign_id=" + campaign_id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", operations=" + operations +
                '}';
    }

    private static class Operations{
        private String description;
        private String image;
        private int missions_in_set;
        private String name;
        private int next_id;
        private int operation_id;
        private int sets_count;
        private int sets_to_next;
        private Map<Integer, Missions> missions;
        private Reward reward;

        public String getDescription() {
            return description;
        }

        public String getImage() {
            return image;
        }

        public int getMissions_in_set() {
            return missions_in_set;
        }

        public String getName() {
            return name;
        }

        public int getNext_id() {
            return next_id;
        }

        public int getOperation_id() {
            return operation_id;
        }

        public int getSets_count() {
            return sets_count;
        }

        public int getSets_to_next() {
            return sets_to_next;
        }

        public Map<Integer, Missions> getMissions() {
            return missions;
        }

        public Reward getReward() {
            return reward;
        }

        @Override
        public String toString() {
            return "Operations{" +
                    "description='" + description + '\'' +
                    ", image='" + image + '\'' +
                    ", missions_in_set=" + missions_in_set +
                    ", name='" + name + '\'' +
                    ", next_id=" + next_id +
                    ", operation_id=" + operation_id +
                    ", sets_count=" + sets_count +
                    ", sets_to_next=" + sets_to_next +
                    ", missions=" + missions +
                    ", reward=" + reward +
                    '}';
        }

        private static class Missions{
            private String description;
            private String hint;
            private int max_level;
            private int min_level;
            private int mission_id;
            private String name;
            private int set_id;
            private String[] tags;
            private Map<String, Rewards> rewards;

            public String getDescription() {
                return description;
            }

            public String getHint() {
                return hint;
            }

            public int getMax_level() {
                return max_level;
            }

            public int getMin_level() {
                return min_level;
            }

            public int getMission_id() {
                return mission_id;
            }

            public String getName() {
                return name;
            }

            public int getSet_id() {
                return set_id;
            }

            public String[] getTags() {
                return tags;
            }

            public Map<String, Rewards> getRewards() {
                return rewards;
            }

            @Override
            public String toString() {
                return "Missions{" +
                        "description='" + description + '\'' +
                        ", hint='" + hint + '\'' +
                        ", max_level=" + max_level +
                        ", min_level=" + min_level +
                        ", mission_id=" + mission_id +
                        ", name='" + name + '\'' +
                        ", set_id=" + set_id +
                        ", tags=" + Arrays.toString(tags) +
                        ", rewards=" + rewards +
                        '}';
            }

            private static class Rewards{
                private int berths;
                private String conditions;
                private int credits;
                private int free_xp;
                private Map<Integer, Integer> items;
                private int premium;
                private int slots;
                private int tokens;

                public int getBerths() {
                    return berths;
                }

                public String getConditions() {
                    return conditions;
                }

                public int getCredits() {
                    return credits;
                }

                public int getFree_xp() {
                    return free_xp;
                }

                public Map<Integer, Integer> getItems() {
                    return items;
                }

                public int getPremium() {
                    return premium;
                }

                public int getSlots() {
                    return slots;
                }

                public int getTokens() {
                    return tokens;
                }

                @Override
                public String toString() {
                    return "Rewards{" +
                            "berths=" + berths +
                            ", conditions='" + conditions + '\'' +
                            ", credits=" + credits +
                            ", free_xp=" + free_xp +
                            ", items=" + items +
                            ", premium=" + premium +
                            ", slots=" + slots +
                            ", tokens=" + tokens +
                            '}';
                }
            }
        }
        private static class Reward{
            private int slots;
            private int[] tanks;

            public int getSlots() {
                return slots;
            }

            public int[] getTanks() {
                return tanks;
            }

            @Override
            public String toString() {
                return "Reward{" +
                        "slots=" + slots +
                        ", tanks=" + Arrays.toString(tanks) +
                        '}';
            }
        }
    }
}
