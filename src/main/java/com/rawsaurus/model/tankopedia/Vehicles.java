package com.rawsaurus.model.tankopedia;

import java.util.Arrays;
import java.util.Map;

public class Vehicles {
    private String description;
    private int[] engines;
    private int[] guns;
    private boolean is_gift;
    private boolean is_premium;
    private boolean is_premium_igr;
    private boolean is_wheeled;
    private String name;
    private String nation;
    private Map<String, Integer> next_tanks;
    private int price_credit;
    private int price_gold;
    private Map<String, Integer> prices_xp;
    private int[] provisions;
    private int[] radios;
    private String short_name;
    private int[] suspensions;
    private String tag;
    private int tank_id;
    private int tier;
    private int[] turrets;
    private String type;
    private Crew[] crew;
    private DefaultProfile default_profile;
    private Images images;
    private ModulesTree modules_tree;

    public String getDescription() {
        return description;
    }

    public int[] getEngines() {
        return engines;
    }

    public int[] getGuns() {
        return guns;
    }

    public boolean isIs_gift() {
        return is_gift;
    }

    public boolean isIs_premium() {
        return is_premium;
    }

    public boolean isIs_premium_igr() {
        return is_premium_igr;
    }

    public boolean isIs_wheeled() {
        return is_wheeled;
    }

    public String getName() {
        return name;
    }

    public String getNation() {
        return nation;
    }

    public Map<String, Integer> getNext_tanks() {
        return next_tanks;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public int getPrice_gold() {
        return price_gold;
    }

    public Map<String, Integer> getPrices_xp() {
        return prices_xp;
    }

    public int[] getProvisions() {
        return provisions;
    }

    public int[] getRadios() {
        return radios;
    }

    public String getShort_name() {
        return short_name;
    }

    public int[] getSuspensions() {
        return suspensions;
    }

    public String getTag() {
        return tag;
    }

    public int getTank_id() {
        return tank_id;
    }

    public int getTier() {
        return tier;
    }

    public int[] getTurrets() {
        return turrets;
    }

    public String getType() {
        return type;
    }

    public Crew[] getCrew() {
        return crew;
    }

    public DefaultProfile getDefault_profile() {
        return default_profile;
    }

    public Images getImages() {
        return images;
    }

    public ModulesTree getModules_tree() {
        return modules_tree;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "description='" + description + '\'' +
                ", engines=" + Arrays.toString(engines) +
                ", guns=" + Arrays.toString(guns) +
                ", is_gift=" + is_gift +
                ", is_premium=" + is_premium +
                ", is_premium_igr=" + is_premium_igr +
                ", is_wheeled=" + is_wheeled +
                ", name='" + name + '\'' +
                ", nation='" + nation + '\'' +
                ", next_tanks=" + next_tanks +
                ", price_credit=" + price_credit +
                ", price_gold=" + price_gold +
                ", prices_xp=" + prices_xp +
                ", provisions=" + Arrays.toString(provisions) +
                ", radios=" + Arrays.toString(radios) +
                ", short_name='" + short_name + '\'' +
                ", suspensions=" + Arrays.toString(suspensions) +
                ", tag='" + tag + '\'' +
                ", tank_id=" + tank_id +
                ", tier=" + tier +
                ", turrets=" + Arrays.toString(turrets) +
                ", type='" + type + '\'' +
                ", crew=" + crew +
                ", default_profile=" + default_profile +
                ", images=" + images +
                ", modules_tree=" + modules_tree +
                '}';
    }

    private static class Crew{
        private String member_id;
        private Map<String, String> roles;

        public String getMember_id() {
            return member_id;
        }

        public Map<String, String> getRoles() {
            return roles;
        }

        @Override
        public String toString() {
            return "Crew{" +
                    "member_id='" + member_id + '\'' +
                    ", roles=" + roles +
                    '}';
        }
    }

    private static class DefaultProfile{
        private int hp;
        private int hull_hp;
        private int hull_weight;
        private int max_ammo;
        private int max_weight;
        private int speed_backward;
        private int speed_forward;
        private int weight;
        private Ammo[] ammo;
        private Armor armor;
        private Engine engine;
        private Gun gun;
        private Modules modules;
        private Radio radio;
        private Rapid rapid;
        private Siege siege;
        private Suspension suspension;
        private Turret turret;

        public int getHp() {
            return hp;
        }

        public int getHull_hp() {
            return hull_hp;
        }

        public int getHull_weight() {
            return hull_weight;
        }

        public int getMax_ammo() {
            return max_ammo;
        }

        public int getMax_weight() {
            return max_weight;
        }

        public int getSpeed_backward() {
            return speed_backward;
        }

        public int getSpeed_forward() {
            return speed_forward;
        }

        public int getWeight() {
            return weight;
        }

        public Ammo[] getAmmo() {
            return ammo;
        }

        public Armor getArmor() {
            return armor;
        }

        public Engine getEngine() {
            return engine;
        }

        public Gun getGun() {
            return gun;
        }

        public Modules getModules() {
            return modules;
        }

        public Radio getRadio() {
            return radio;
        }

        public Rapid getRapid() {
            return rapid;
        }

        public Siege getSiege() {
            return siege;
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
                    "hp=" + hp +
                    ", hull_hp=" + hull_hp +
                    ", hull_weight=" + hull_weight +
                    ", max_ammo=" + max_ammo +
                    ", max_weight=" + max_weight +
                    ", speed_backward=" + speed_backward +
                    ", speed_forward=" + speed_forward +
                    ", weight=" + weight +
                    ", ammo=" + ammo +
                    ", armor=" + armor +
                    ", engine=" + engine +
                    ", gun=" + gun +
                    ", modules=" + modules +
                    ", radio=" + radio +
                    ", rapid=" + rapid +
                    ", siege=" + siege +
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
                            "duration='" + duration + '\'' +
                            '}';
                }
            }
        }
        private static class Armor{
            private Hull hull;
            private Turret turret;

            public Hull getHull() {
                return hull;
            }

            public Turret getTurret() {
                return turret;
            }

            @Override
            public String toString() {
                return "Armor{" +
                        "hull=" + hull +
                        ", turret=" + turret +
                        '}';
            }

            private static class Hull{
                private int front;
                private int rear;
                private int sides;

                public int getFront() {
                    return front;
                }

                public int getRear() {
                    return rear;
                }

                public int getSides() {
                    return sides;
                }

                @Override
                public String toString() {
                    return "Hull{" +
                            "front=" + front +
                            ", rear=" + rear +
                            ", sides=" + sides +
                            '}';
                }
            }
            private static class Turret{
                private int front;
                private int rear;
                private int sides;

                public int getFront() {
                    return front;
                }

                public int getRear() {
                    return rear;
                }

                public int getSides() {
                    return sides;
                }

                @Override
                public String toString() {
                    return "Turret{" +
                            "front=" + front +
                            ", rear=" + rear +
                            ", sides=" + sides +
                            '}';
                }
            }
        }
        private static class Engine{
            private double fire_chance;
            private String name;
            private int power;
            private String tag;
            private int tier;
            private int weight;

            public double getFire_chance() {
                return fire_chance;
            }

            public String getName() {
                return name;
            }

            public int getPower() {
                return power;
            }

            public String getTag() {
                return tag;
            }

            public int getTier() {
                return tier;
            }

            public int getWeight() {
                return weight;
            }

            @Override
            public String toString() {
                return "Engine{" +
                        "fire_chance=" + fire_chance +
                        ", name='" + name + '\'' +
                        ", power=" + power +
                        ", tag='" + tag + '\'' +
                        ", tier=" + tier +
                        ", weight=" + weight +
                        '}';
            }
        }

        private static class Gun{
            private double aim_time;
            private int caliber;
            private double dispersion;
            private double fire_rate;
            private int move_down_arc;
            private int move_up_arc;
            private String name;
            private double reload_time;
            private String tag;
            private int tier;
            private int traverse_speed;
            private int weight;

            public double getAim_time() {
                return aim_time;
            }

            public int getCaliber() {
                return caliber;
            }

            public double getDispersion() {
                return dispersion;
            }

            public double getFire_rate() {
                return fire_rate;
            }

            public int getMove_down_arc() {
                return move_down_arc;
            }

            public int getMove_up_arc() {
                return move_up_arc;
            }

            public String getName() {
                return name;
            }

            public double getReload_time() {
                return reload_time;
            }

            public String getTag() {
                return tag;
            }

            public int getTier() {
                return tier;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            public int getWeight() {
                return weight;
            }

            @Override
            public String toString() {
                return "Gun{" +
                        "aim_time=" + aim_time +
                        ", caliber=" + caliber +
                        ", dispersion=" + dispersion +
                        ", fire_rate=" + fire_rate +
                        ", move_down_arc=" + move_down_arc +
                        ", move_up_arc=" + move_up_arc +
                        ", name='" + name + '\'' +
                        ", reload_time=" + reload_time +
                        ", tag='" + tag + '\'' +
                        ", tier=" + tier +
                        ", traverse_speed=" + traverse_speed +
                        ", weight=" + weight +
                        '}';
            }
        }
        private static class Modules{
            private int engine_id;
            private int gun_id;
            private int radio_id;
            private int suspension_id;
            private int turret_id;

            public int getEngine_id() {
                return engine_id;
            }

            public int getGun_id() {
                return gun_id;
            }

            public int getRadio_id() {
                return radio_id;
            }

            public int getSuspension_id() {
                return suspension_id;
            }

            public int getTurret_id() {
                return turret_id;
            }

            @Override
            public String toString() {
                return "Modules{" +
                        "engine_id=" + engine_id +
                        ", gun_id=" + gun_id +
                        ", radio_id=" + radio_id +
                        ", suspension_id=" + suspension_id +
                        ", turret_id=" + turret_id +
                        '}';
            }
        }
        private static class Radio{
            private String name;
            private int signal_range;
            private String tag;
            private int tier;
            private int weight;

            public String getName() {
                return name;
            }

            public int getSignal_range() {
                return signal_range;
            }

            public String getTag() {
                return tag;
            }

            public int getTier() {
                return tier;
            }

            public int getWeight() {
                return weight;
            }

            @Override
            public String toString() {
                return "Radio{" +
                        "name='" + name + '\'' +
                        ", signal_range=" + signal_range +
                        ", tag='" + tag + '\'' +
                        ", tier=" + tier +
                        ", weight=" + weight +
                        '}';
            }
        }

        private static class Rapid{
            private int speed_backward;
            private int speed_forward;
            private int suspension_steering_lock_angle;
            private double switch_off_time;
            private double switch_on_time;

            public int getSpeed_backward() {
                return speed_backward;
            }

            public int getSpeed_forward() {
                return speed_forward;
            }

            public int getSuspension_steering_lock_angle() {
                return suspension_steering_lock_angle;
            }

            public double getSwitch_off_time() {
                return switch_off_time;
            }

            public double getSwitch_on_time() {
                return switch_on_time;
            }

            @Override
            public String toString() {
                return "Rapid{" +
                        "speed_backward=" + speed_backward +
                        ", speed_forward=" + speed_forward +
                        ", suspension_steering_lock_angle=" + suspension_steering_lock_angle +
                        ", switch_off_time=" + switch_off_time +
                        ", switch_on_time=" + switch_on_time +
                        '}';
            }
        }
        private static class Siege{
            private double aim_time;
            private double dispersion;
            private int move_down_arc;
            private int move_up_arc;
            private double reload_time;
            private int speed_backward;
            private int suspension_traverse_speed;
            private double switch_off_time;
            private double switch_on_time;

            public double getAim_time() {
                return aim_time;
            }

            public double getDispersion() {
                return dispersion;
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

            public int getSpeed_backward() {
                return speed_backward;
            }

            public int getSuspension_traverse_speed() {
                return suspension_traverse_speed;
            }

            public double getSwitch_off_time() {
                return switch_off_time;
            }

            public double getSwitch_on_time() {
                return switch_on_time;
            }

            @Override
            public String toString() {
                return "Siege{" +
                        "aim_time=" + aim_time +
                        ", dispersion=" + dispersion +
                        ", move_down_arc=" + move_down_arc +
                        ", move_up_arc=" + move_up_arc +
                        ", reload_time=" + reload_time +
                        ", speed_backward=" + speed_backward +
                        ", suspension_traverse_speed=" + suspension_traverse_speed +
                        ", switch_off_time=" + switch_off_time +
                        ", switch_on_time=" + switch_on_time +
                        '}';
            }
        }
        private static class Suspension{
            private int load_limit;
            private String name;
            private int steering_lock_angle;
            private String tag;
            private int tier;
            private int traverse_speed;
            private int weight;

            public int getLoad_limit() {
                return load_limit;
            }

            public String getName() {
                return name;
            }

            public int getSteering_lock_angle() {
                return steering_lock_angle;
            }

            public String getTag() {
                return tag;
            }

            public int getTier() {
                return tier;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            public int getWeight() {
                return weight;
            }

            @Override
            public String toString() {
                return "Suspension{" +
                        "load_limit=" + load_limit +
                        ", name='" + name + '\'' +
                        ", steering_lock_angle=" + steering_lock_angle +
                        ", tag='" + tag + '\'' +
                        ", tier=" + tier +
                        ", traverse_speed=" + traverse_speed +
                        ", weight=" + weight +
                        '}';
            }
        }

        private static class Turret{
            private int hp;
            private String name;
            private String tag;
            private int tier;
            private int traverse_left_arc;
            private int traverse_right_arc;
            private int traverse_speed;
            private int view_range;
            private int weight;

            public int getHp() {
                return hp;
            }

            public String getName() {
                return name;
            }

            public String getTag() {
                return tag;
            }

            public int getTier() {
                return tier;
            }

            public int getTraverse_left_arc() {
                return traverse_left_arc;
            }

            public int getTraverse_right_arc() {
                return traverse_right_arc;
            }

            public int getTraverse_speed() {
                return traverse_speed;
            }

            public int getView_range() {
                return view_range;
            }

            public int getWeight() {
                return weight;
            }

            @Override
            public String toString() {
                return "Turret{" +
                        "hp=" + hp +
                        ", name='" + name + '\'' +
                        ", tag='" + tag + '\'' +
                        ", tier=" + tier +
                        ", traverse_left_arc=" + traverse_left_arc +
                        ", traverse_right_arc=" + traverse_right_arc +
                        ", traverse_speed=" + traverse_speed +
                        ", view_range=" + view_range +
                        ", weight=" + weight +
                        '}';
            }
        }
    }
    private static class Images{
        private String big_icon;
        private String contour_icon;
        private String small_icon;

        public String getBig_icon() {
            return big_icon;
        }

        public String getContour_icon() {
            return contour_icon;
        }

        public String getSmall_icon() {
            return small_icon;
        }

        @Override
        public String toString() {
            return "Images{" +
                    "big_icon='" + big_icon + '\'' +
                    ", contour_icon='" + contour_icon + '\'' +
                    ", small_icon='" + small_icon + '\'' +
                    '}';
        }
    }
    private static class ModulesTree{
        private boolean is_default;
        private int module_id;
        private String name;
        private int[] next_modules;
        private int[] next_tanks;
        private int price_credit;
        private int price_xp;
        private String type;

        public boolean isIs_default() {
            return is_default;
        }

        public int getModule_id() {
            return module_id;
        }

        public String getName() {
            return name;
        }

        public int[] getNext_modules() {
            return next_modules;
        }

        public int[] getNext_tanks() {
            return next_tanks;
        }

        public int getPrice_credit() {
            return price_credit;
        }

        public int getPrice_xp() {
            return price_xp;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return "ModulesTree{" +
                    "is_default=" + is_default +
                    ", module_id=" + module_id +
                    ", name='" + name + '\'' +
                    ", next_modules=" + Arrays.toString(next_modules) +
                    ", next_tanks=" + Arrays.toString(next_tanks) +
                    ", price_credit=" + price_credit +
                    ", price_xp=" + price_xp +
                    ", type='" + type + '\'' +
                    '}';
        }
    }
}
