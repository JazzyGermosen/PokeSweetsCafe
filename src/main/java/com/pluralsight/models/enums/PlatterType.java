package com.pluralsight.models.enums;

public enum PlatterType {

    PORKKATSU("Pork Katsu"),
    CHICKENKATSU("Chicken Katsu"),
    BEEFKATSU("Beef Katsu");

    private final String meatType;

    PlatterType(String meatType) {
        this.meatType = meatType;
    }

    @Override
    public String toString() {
        return "PlatterType{" +
                "meatType='" + meatType + '\'' +
                '}';
    }

    public String getMeatType() {
        return meatType;
    }
}
