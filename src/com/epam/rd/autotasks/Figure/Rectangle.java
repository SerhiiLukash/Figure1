package com.epam.rd.autotasks.Figure;

public class Rectangle extends Figure {
    private double side1, side2;
    private String type;

    public Rectangle (int side1, int side2) {
        type = "Rectangle";
        this.side1 = side1;
        this.side2 = side2;

    }
    public double getArea () {

        return side1*side2;
    }

    public String getType() {
        return type;
    }

}
