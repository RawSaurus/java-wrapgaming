package com.rawsaurus.model.tankopedia;

public class EquipmentAndConsumables {
    private String description;
    private String image;
    private String name;
    private int price_credit;
    private int price_gold;
    private int provision_id;
    private String tag;
    private String type;
    private int weight;

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public int getPrice_credit() {
        return price_credit;
    }

    public int getPrice_gold() {
        return price_gold;
    }

    public int getProvision_id() {
        return provision_id;
    }

    public String getTag() {
        return tag;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "EquipmentAndConsumables{" +
                "description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", price_credit=" + price_credit +
                ", price_gold=" + price_gold +
                ", provision_id=" + provision_id +
                ", tag='" + tag + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
