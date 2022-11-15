package com.epam.rd.autotasks.Figure;

public class Square extends Figure {
    private double side1;
    private String type;

    public Square (int side1) {
        type = "Square";
        this.side1 = side1;

    }
    public double getArea () {

        return side1*side1;
    }

    public String getType() {
        return type;
    }

}