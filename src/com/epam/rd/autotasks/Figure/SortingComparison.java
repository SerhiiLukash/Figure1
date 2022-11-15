package com.epam.rd.autotasks.Figure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingComparison {
    ArrayList <Figure> figureList = new ArrayList();
    public static void sortMax(ArrayList<Figure> figureList) {
        Collections.sort(figureList, new StockComparator());
        System.out.println("Sorted list:");
        for (Figure figure : figureList) {
            System.out.println(figure.getType() + " " + figure.getArea());
        }
        // creates the comparator for comparing Area value
    }

    public static void compareSum(double c, ArrayList<Figure> figureList) {

            double sum = 0;
            for (Figure i : figureList) {
                sum = sum + i.getArea();
            }

            //    return sum;
            //   figureList.forEach((n) -> sum = sum + n.getArea());
            if (sum >= c) {
                System.out.println("Sum of areas " + sum + " is more or equal than " + c);
            }
            else System.out.println("Sum of areas " + sum + " is less than " + c);
        }


    private static class StockComparator implements Comparator<Figure>, com.epam.rd.autotasks.Figure.StockComparator {
        @Override
        public int compare(Figure f1, Figure f2)
        {
            if (f1.getArea() == f2.getArea())
                return 0;
            else if (f1.getArea() > f2.getArea())
                return 1;
            else
                return -1;
        }
    }
}

