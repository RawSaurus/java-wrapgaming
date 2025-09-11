package com.rawsaurus.model.strongholds;

import java.util.Arrays;

public class ClanReserves {
    private String bonus_type;
    private boolean disposable;
    private String icon;
    private String name;
    private String type;
    private InStock[] in_stock;

    public String getBonus_type() {
        return bonus_type;
    }

    public boolean isDisposable() {
        return disposable;
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public InStock[] getIn_stock() {
        return in_stock;
    }

    @Override
    public String toString() {
        return "ClanReserves{" +
                "bonus_type='" + bonus_type + '\'' +
                ", disposable=" + disposable +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", in_stock=" + Arrays.toString(in_stock) +
                '}';
    }

    private static class InStock{
        private int action_time;
        private int activated_at;
        private int active_till;
        private int amount;
        private int level;
        private String status;
        private boolean x_level_only;
        private BonusValues[] bonus_values;

        public int getAction_time() {
            return action_time;
        }

        public int getActivated_at() {
            return activated_at;
        }

        public int getActive_till() {
            return active_till;
        }

        public int getAmount() {
            return amount;
        }

        public int getLevel() {
            return level;
        }

        public String getStatus() {
            return status;
        }

        public boolean isX_level_only() {
            return x_level_only;
        }

        public BonusValues[] getBonus_values() {
            return bonus_values;
        }

        @Override
        public String toString() {
            return "InStock{" +
                    "action_time=" + action_time +
                    ", activated_at=" + activated_at +
                    ", active_till=" + active_till +
                    ", amount=" + amount +
                    ", level=" + level +
                    ", status='" + status + '\'' +
                    ", x_level_only=" + x_level_only +
                    ", bonus_values=" + Arrays.toString(bonus_values) +
                    '}';
        }

        private static class BonusValues{
            private String battle_type;
            private double value;

            public String getBattle_type() {
                return battle_type;
            }

            public double getValue() {
                return value;
            }

            @Override
            public String toString() {
                return "BonusValues{" +
                        "battle_type='" + battle_type + '\'' +
                        ", value=" + value +
                        '}';
            }
        }
    }
}
