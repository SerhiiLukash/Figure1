package com.epam.rd.autotasks.Figure;

import com.epam.rd.autotasks.Figure.Figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


import static com.epam.rd.autotasks.Figure.SortingComparison.sortMax;
import static com.epam.rd.autotasks.Figure.SortingComparison.compareSum;

public class Main {
    public static void main(String[] args) {

        ArrayList <Figure> figureList = inputData();
        sortMax(figureList);
        compareSum(100, figureList);

    }


    public enum FigureType {Circle, Square, Rectangle};

    int area;
    String type;


    public static boolean enumContains(String type) {
        try {
            Enum.valueOf(Figure.FigureType.class, type);
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    public static ArrayList<Figure> inputData() {
      ArrayList <Figure> figureList = new ArrayList();
      Figure newFigure;

        Boolean isContinue = true;

        while (isContinue) {
            System.out.println("Select figure's type: Circle, Square, Rectangle ");
            Scanner scanner = new Scanner(System.in);
            String type = scanner.nextLine();
            if (!enumContains(type)) {
                throw new IllegalArgumentException("Figure is not from the list: Circle, Square, Rectangle");
            }
            else if (type.equals("Circle")) {
                System.out.println("Enter radius");
                Scanner scanner1 = new Scanner(System.in);
                int radius = scanner1.nextInt();
                newFigure = new Circle(radius);
            }
            else if (type.equals("Square")) {
                System.out.println("Enter side");
                Scanner scanner2 = new Scanner(System.in);
                int side1 = scanner2.nextInt();
                newFigure = new Square(side1);
            }
            else                            {
                System.out.println("Enter 1st side");
                Scanner scanner3 = new Scanner(System.in);
                int side1 = scanner3.nextInt();
                System.out.println("Enter 2nd side");
                Scanner scanner4 = new Scanner(System.in);
                int side2 = scanner4.nextInt();
                newFigure = new Rectangle(side1,side2);
            }
          //  Figure newFigure = new Figure(type);

            System.out.println("Figure is created. Type: " + newFigure.getType() + " with area: " + newFigure.getArea());
            figureList.add(newFigure);
            System.out.println("Continue? Y/N");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            switch (x) {
                case "Y":
                    isContinue = true;
                    break;
                case "N":
                    isContinue = false;
                    break;
                default:
                    System.out.println("Please choose Y or N ");
            }
        }
        return figureList;
    }


}
