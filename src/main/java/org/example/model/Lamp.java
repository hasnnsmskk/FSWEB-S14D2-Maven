package org.example.model;

public class Lamp {
    private enums.LampType style;
    private boolean battery;
    private int globRating;

    public Lamp(enums.LampType style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }
    public enums.LampType getStyle() {
        return style;
    }

    public boolean isBattery(){
        return  battery;
    }

    public int getGlobRating() {
        return globRating;
    }


}
