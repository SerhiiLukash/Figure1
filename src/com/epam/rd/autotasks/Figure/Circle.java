package com.epam.rd.autotasks.Figure;

public class Circle extends Figure {
    private double radius;
    private String type;

    public Circle (int radius) {
        type = "Circle";
        this.radius = radius;

    }
    public double getArea () {

        return Math.PI*radius*radius;
    }

    public String getType() {
        return type;
    }

}