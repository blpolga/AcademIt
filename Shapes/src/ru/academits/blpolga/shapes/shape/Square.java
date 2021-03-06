package ru.academits.blpolga.shapes.shape;

public class Square implements Shapes {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return length;
    }

    @Override
    public double getHeight() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    public String toString() {
        return "Square " + "length = " + length;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (object.getClass() != this.getClass())) {
            return false;
        }
        Square square = (Square) object;
        return length == square.length;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(length);
    }
}