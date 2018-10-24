package ru.academits.blpolga.shapes.main;

import ru.academits.blpolga.shapes.Comparators.AreaComparator;
import ru.academits.blpolga.shapes.Comparators.PerimeterComparator;
import ru.academits.blpolga.shapes.shape.*;

import java.util.Arrays;

public class Main {
    private static Shapes getMaxAreaShape(Shapes... array) {
        Arrays.sort(array, new AreaComparator());
        return array[array.length - 1];
    }

    private static Shapes getSecondPerimeterShape(Shapes... array) {
        Arrays.sort(array, new PerimeterComparator());
        return array[array.length - 2];
    }

    public static void main(String[] args) {
        Shapes triangle = new Triangle(0, 4, 1, -4, 0, 6);
        Shapes circle = new Circle(10);
        Shapes rectangle = new Rectangle(5, 6);
        Shapes square1 = new Square(3);
        Shapes square2 = new Square(1);

        Shapes[] array = {triangle, circle, rectangle, square1, square2};
        Shapes maxArea = getMaxAreaShape(array);
        System.out.println("Max area = " + maxArea.getArea());
        System.out.println("Figure parameters: " + maxArea.toString());

        Shapes secondPerimeter = getSecondPerimeterShape(array);
        System.out.println("Second perimeter = " + secondPerimeter.getPerimeter());
        System.out.println("Figure parameters: " + secondPerimeter.toString());
    }
}
