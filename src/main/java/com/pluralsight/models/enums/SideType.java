package com.pluralsight.models.enums;

public enum SideType {

    TATSUGIRI("Tatsugiri Roll", 5.50),
    RHYPERIOR("Rhyperior Roll", 6.50),
    TORCHI("Torchic Fried Egg", 5.50),
    VULLABY("Vullaby's Omelette", 6.50);



    private final String displayName;
    private final double basePrice;

    SideType(String displayName, double basePrice) {
        this.displayName = displayName;
        this.basePrice = basePrice;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "SideType{" +
                "displayName='" + displayName + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }
}
