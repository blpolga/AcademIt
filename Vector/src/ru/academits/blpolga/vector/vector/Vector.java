package ru.academits.blpolga.vector.vector;

import java.util.Arrays;

public class Vector {
    private double[] coordinates;

    public Vector(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        } else {
            coordinates = new double[n];
        }
    }

    public Vector(Vector vector) {
        this.coordinates = Arrays.copyOf(vector.coordinates, vector.getSize());
    }

    public Vector(double[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        } else {
            coordinates = Arrays.copyOf(array, array.length);
        }
    }

    public Vector(int n, double[] array) {
        if (n <= 0 || array.length == 0) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        } else {
            coordinates = Arrays.copyOf(array, n);
        }
    }

    public String toString() {
        return Arrays.toString(coordinates).replace("[", "{").replace("]", "}");
    }

    public void addVectors(Vector vector) {
        Vector v = new Vector(vector);
        if (this.coordinates.length < vector.getSize()) {
            coordinates = Arrays.copyOf(this.coordinates, vector.coordinates.length);
        }
        for (int i = 0; i < v.coordinates.length; i++) {
            this.coordinates[i] += v.coordinates[i];
        }
    }

    public void subtractVectors(Vector vector) {
        Vector v = new Vector(vector);
        if (this.coordinates.length < vector.getSize()) {
            coordinates = Arrays.copyOf(this.coordinates, vector.coordinates.length);
        }
        for (int i = 0; i < v.coordinates.length; i++) {
            this.coordinates[i] -= v.coordinates[i];
        }
    }

    public void multiplicationVectors(double scalar) {
        for (int i = 0; i < this.coordinates.length; i++) {
            this.coordinates[i] *= scalar;
        }
    }

    public static Vector addVectors(Vector vector1, Vector vector2) {
        Vector v = new Vector(vector1);
        v.addVectors(vector2);
        return v;
    }

    public static Vector subVectors(Vector vector1, Vector vector2) {
        Vector v = new Vector(vector1);
        v.subtractVectors(vector2);
        return v;
    }

    public static double scalarMultiplication(Vector vector1, Vector vector2) {
        double result = 0;
        int n = Math.min(vector1.getSize(), vector2.getSize());
        for (int i = 0; i < n; i++) {
            result += vector1.coordinates[i] * vector2.coordinates[i];
        }
        return result;
    }

    public Vector reverseVector() {
        multiplicationVectors(-1);
        return this;
    }

    public double getLength() {
        double length = 0;
        for (int i = 0; i < this.getSize(); i++) {
            length += Math.pow(this.coordinates[i], 2);
        }
        return length;
    }

    public double getElement(int i) {
        if (i >= this.getSize() || i < 0) {
            throw new IllegalArgumentException("Выход за пределы размерности");
        }
        return this.coordinates[i];
    }

    public void setElement(int i, double component) {
        if (i >= this.getSize() || i < 0) {
            throw new IllegalArgumentException("Выход за пределы размерности");
        }
        this.coordinates[i] = component;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        Vector vector = (Vector) object;
        return Arrays.equals(coordinates, vector.coordinates);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + Arrays.hashCode(this.coordinates);
    }

    public int getSize() {
        return coordinates.length;
    }
}