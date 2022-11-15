package com.epam.rd.autotasks.Figure;

public abstract class Figure


{
    public abstract double getArea();

    public abstract String getType();

    public enum FigureType {Circle, Square, Rectangle}
}