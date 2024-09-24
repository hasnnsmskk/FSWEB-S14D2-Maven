package org.example.model;

public class Carpet {
    private int width;
    private int height;
    private enums.PaintColor color;

    public Carpet(int width, int height, enums.PaintColor color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public enums.PaintColor getColor() {
        return color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
