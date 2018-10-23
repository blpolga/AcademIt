package ru.academits.blpolga.shapes.Comparators;

import ru.academits.blpolga.shapes.shape.Shapes;

import java.util.Comparator;

public class PerimeterComparator implements Comparator <Shapes> {
    @Override
    public int compare(Shapes o1, Shapes o2) {
        double perimeter1 = o1.getPerimeter();
        double perimeter2 = o2.getPerimeter();
        return Double.compare(perimeter1, perimeter2);
    }
}
