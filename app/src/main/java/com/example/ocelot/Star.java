package com.example.ocelot;

public class Star extends Shape{
    private int points;
    private float length;

    public Star(int x, int y, int points, float length) {
        super(x, y);
        this.points = points;
        this.length = length;
    }

    public int getPoints() {
        return points;
    }

    public double getLength() {
        return length;
    }
}
