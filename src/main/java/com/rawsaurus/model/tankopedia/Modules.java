package com.rawsaurus.model.tankopedia;

import java.util.Arrays;

public class Modules {
    private String image;
    private int module_id;
    private String name;
    private String nation;
    private int price_credit;
    private int[] tanks;
    private int tier;
    private String type;
    private int weight;
    private DefaultProfile defaultProfile;

    public String getImage() {
        return image;
    }

    public int getModule_id() {
        return module_id;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public int[] getTanks() {
        return tanks;
    }

    public int getTier() {
        return tier;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public DefaultProfile getDefaultProfile() {
        return defaultProfile;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "image='" + image + '\'' +
                ", module_id=" + module_id +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", price_credit=" + price_credit +
                ", tanks=" + Arrays.toString(tanks) +
                ", tier=" + tier +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", defaultProfile=" + defaultProfile +
                '}';
    }

    private static class DefaultProfile{
        private Ammo[] ammo;
        private Engine engine;
        private Gun gun;
        private Radio radio;
        private Suspension suspension;
        private Turret turret;

        public Ammo[] getAmmo() {
            return ammo;
        }

        public Engine getEngine() {
            return engine;
        }

        public Gun getGun() {
            return gun;
        }

        public Radio getRadio() {
            return radio;
        }

        public Suspension getSuspension() {
            return suspension;
        }

        public Turret getTurret() {
            return turret;
        }

        @Override
        public String toString() {
            return "DefaultProfile{" +
                    "ammo=" + Arrays.toString(ammo) +
                    ", engine=" + engine +
                    ", gun=" + gun +
                    ", radio=" + radio +
                    ", suspension=" + suspension +
                    ", turret=" + turret +
                    '}';
        }

        private static class Ammo{
            private int[] damage;
            private int[] penetration;
            private String type;
            private Stun stun;

            public int[] getDamage() {
                return damage;
            }

            public int[] getPenetration() {
                return penetration;
            }

            public String getType() {
                return type;
            }

            public Stun getStun() {
                return stun;
            }

            @Override
            public String toString() {
                return "Ammo{" +
                        "damage=" + Arrays.toString(damage) +
                        ", penetration=" + Arrays.toString(penetration) +
                        ", type='" + type + '\'' +
                        ", stun=" + stun +
                        '}';
            }

            private static class Stun{
                private String[] duration;

                public String[] getDuration() {
                    return duration;
                }

                @Override
                public String toString() {
                    return "Stun{" +
                            "duration='" + Arrays.toString(duration) + '\'' +
                            '}';
                }
            }
        }
        private static class Engine{
            private double fire_chance;
            private int power;

            public double getFire_chance() {
                return fire_chance;
            }

            public int getPower() {
                return power;
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "fire_chance=" + fire_chance +
                        ", power=" + power +
                        '}';
            }
        }

        private static class Gun{
            private double aim_time;
            private double dispersion;
            private double fire_rate;
            private int max_ammo;
            private int move_down_arc;
            private int move_up_arc;
            private double reload_time;
            private int traverse_speed;

            public double getAim_time() {
                return aim_time;
            }

            public double getDispersion() {
                return dispersion;
            }

            public double getFire_rate() {
                return fire_rate;
            }

            public int getMax_ammo() {
                return max_ammo;
            }

            public int getMove_down_arc() {
                return move_down_arc;
            }

            public int getMove_up_arc() {
                return move_up_arc;
            }

            public double getReload_time() {
                return reload_time;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            @Override
            public String toString() {
                return "Gun{" +
                        "aim_time=" + aim_time +
                        ", dispersion=" + dispersion +
                        ", fire_rate=" + fire_rate +
                        ", max_ammo=" + max_ammo +
                        ", move_down_arc=" + move_down_arc +
                        ", move_up_arc=" + move_up_arc +
                        ", reload_time=" + reload_time +
                        ", traverse_speed=" + traverse_speed +
                        '}';
            }
        }
        private static class Radio{
            private int signal_range;

            public int getSignal_range() {
                return signal_range;
            }

            @Override
            public String toString() {
                return "Radio{" +
                        ", signal_range=" + signal_range +
                        '}';
            }
        }
        private static class Suspension{
            private int load_limit;
            private int traverse_speed;

            public int getLoad_limit() {
                return load_limit;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            @Override
            public String toString() {
                return "Suspension{" +
                        "load_limit=" + load_limit +
                        ", traverse_speed=" + traverse_speed +
                        '}';
            }
        }

        private static class Turret{
            private int armor_front;
            private int armor_rear;
            private int armor_sides;
            private int hp;
            private int traverse_speed;
            private int view_range;

            public int getArmor_front() {
                return armor_front;
            }

            public int getArmor_rear() {
                return armor_rear;
            }

            public int getArmor_sides() {
                return armor_sides;
            }

            public int getHp() {
                return hp;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            public int getView_range() {
                return view_range;
            }

            @Override
            public String toString() {
                return "Turret{" +
                        "armor_front=" + armor_front +
                        ", armor_rear=" + armor_rear +
                        ", armor_sides=" + armor_sides +
                        ", hp=" + hp +
                        ", traverse_speed=" + traverse_speed +
                        ", view_range=" + view_range +
                        '}';
            }
        }
    }
}
