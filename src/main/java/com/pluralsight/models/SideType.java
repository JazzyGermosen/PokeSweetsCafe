package com.pluralsight.models;

public enum SideType {

    CALIFORNIAROLL("California Roll", 5.50),
    DRAGONROLL("Dragon Roll", 6.50),
    FRIEDEGG("Fried Egg", 5.50),
    OMELETTE("Omelette", 6.50);

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
    public String toString(){
        return displayName + " ($" + String.format("%.2f", basePrice) + ")";
    }

}
