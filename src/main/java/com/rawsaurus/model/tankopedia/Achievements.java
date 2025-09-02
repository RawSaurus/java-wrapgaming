package com.rawsaurus.model.tankopedia;

import java.util.Arrays;
import java.util.Map;

public class Achievements {
    private String condition;
    private String description;
    private String hero_info;
    private String image;
    private String image_big;
    private String name;
    private String name_i18n;
    private int order;
    private boolean outdated;
    private String section;
    private int section_order;
    private String type;
    private Options[] options;

    public String getCondition() {
        return condition;
    }

    public String getDescription() {
        return description;
    }

    public String getHero_info() {
        return hero_info;
    }

    public String getImage() {
        return image;
    }

    public String getImage_big() {
        return image_big;
    }

    public String getName() {
        return name;
    }

    public String getName_i18n() {
        return name_i18n;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOutdated() {
        return outdated;
    }

    public String getSection() {
        return section;
    }

    public int getSection_order() {
        return section_order;
    }

    public String getType() {
        return type;
    }

    public Options[] getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Achievements{" +
                "condition='" + condition + '\'' +
                ", description='" + description + '\'' +
                ", hero_info='" + hero_info + '\'' +
                ", image='" + image + '\'' +
                ", image_big='" + image_big + '\'' +
                ", name='" + name + '\'' +
                ", name_i18n='" + name_i18n + '\'' +
                ", order=" + order +
                ", outdated=" + outdated +
                ", section='" + section + '\'' +
                ", section_order=" + section_order +
                ", type='" + type + '\'' +
                ", options=" + options +
                '}';
    }

    private static class Options{
        private String description;
        private String image;
        private String image_big;
        private String name_i18n;
        private Map<String, NationImages> nation_images;

        public String getDescription() {
            return description;
        }

        public String getImage() {
            return image;
        }

        public String getImage_big() {
            return image_big;
        }

        public String getName_i18n() {
            return name_i18n;
        }

        public Map<String, NationImages> getNation_images() {
            return nation_images;
        }

        @Override
        public String toString() {
            return "Options{" +
                    "description='" + description + '\'' +
                    ", image='" + image + '\'' +
                    ", image_big='" + image_big + '\'' +
                    ", name_i18n='" + name_i18n + '\'' +
                    ", nation_images=" + nation_images +
                    '}';
        }

        private static class NationImages{
            private String[] x180;
            private String[] x71;
            private String[] x85;

            public String[] getX180() {
                return x180;
            }

            public String[] getX71() {
                return x71;
            }

            public String[] getX85() {
                return x85;
            }

            @Override
            public String toString() {
                return "NationImages{" +
                        "x180=" + Arrays.toString(x180) +
                        ", x71=" + Arrays.toString(x71) +
                        ", x85=" + Arrays.toString(x85) +
                        '}';
            }
        }

    }

}
