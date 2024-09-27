/*Author: Nathan Barrett
* Date Sept 27, 2024
* */

package com.example.ocelot;

public class Hexagon extends Shape{
    int radius;

    public Hexagon(int x, int y, int radius){
        super(x,y);
        this.radius = radius;
    }
    public int getRadius(){return radius;}
    public void setRadius(int radius){this.radius = radius;}
}
