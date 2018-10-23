package ru.academits.blpolga.shapes.shape;

public class Triangle implements Shapes {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public static double getSideLength(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    @Override
    public double getWidth() {
        return Math.max(Math.max(x1, x2), x3) - Math.min(Math.min(x1, x2), x3);
    }

    @Override
    public double getHeight() {
        return Math.max(Math.max(y1, y2), y3) - Math.min(Math.min(y1, y2), y3);
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - getSideLength(x1, x2, y1, y2)) *
                (semiPerimeter - getSideLength(x2, x3, y2, y3)) * (semiPerimeter - getSideLength(x3, x1, y3, y1)));
    }

    @Override
    public double getPerimeter() {
        return getSideLength(x1, x2, y1, y2) + getSideLength(x2, x3, y2, y3) + getSideLength(x3, x1, y3, y1);
    }

    public String toString() {
        return "Triangle " + "x-coordinate = " + x1 + " " + x2 + " " + x3 + " y-coordinate = " + y1 + " " + y2 + " " + y3;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (object.getClass() != this.getClass())) {
            return false;
        }
        Triangle triangle = (Triangle) object;
        return x1 == triangle.x1 && x2 == triangle.x2 && x3 == triangle.x3 && y1 == triangle.y1 && y2 == triangle.y2
                && y3 == triangle.y3 ;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(x1);
        result = prime * result + Double.hashCode(x2);
        result = prime * result + Double.hashCode(x3);
        result = prime * result + Double.hashCode(y1);
        result = prime * result + Double.hashCode(y2);
        result = prime * result + Double.hashCode(y3);
        return result;
    }
}