package com.rawsaurus.enums;

public enum Distribution {
    DAMAGE("damage"),
    XP("xp");

    private final String value;

    Distribution(final String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
