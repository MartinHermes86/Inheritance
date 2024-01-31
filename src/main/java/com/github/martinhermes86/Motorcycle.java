package com.github.martinhermes86;

public class Motorcycle extends Vehicle{
    private boolean hasSideCar;

    private String type;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, boolean hasSideCar, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.hasSideCar = hasSideCar;
        this.type = type;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }

    public void setHasSideCar(boolean hasSideCar) {
        this.hasSideCar = hasSideCar;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSideCar=" + hasSideCar +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }
}
