package ru.academits.blpolga.shapes.Comparators;

import ru.academits.blpolga.shapes.shape.Shapes;

import java.util.Comparator;

public class AreaComparator implements Comparator<Shapes> {
    @Override
    public int compare(Shapes o1, Shapes o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();
        return Double.compare(area1, area2);
    }
}
