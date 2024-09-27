package com.example.ocelot;

public class Circle extends Shape {
    private double radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

