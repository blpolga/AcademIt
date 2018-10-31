package ru.academits.blpolga.vector.main;

import ru.academits.blpolga.vector.vector.Vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] vector1Array = {1, 2};
        Vector vector1 = new Vector(vector1Array);
        System.out.println("Параметры вектора1: " + vector1.toString());
        System.out.println("Размер вектора = " + vector1.getSize());
        System.out.println("Длина вектора = " + vector1.getLength());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, на которое хотите умножить вектор");
        vector1.scalarMultiplication(scanner.nextDouble());
        System.out.println("Умножение вектора на скаляр = " + vector1.toString());
        System.out.println("Разворот вектора: " + vector1.reverse());

        double[] vector2Array = {5, 6, 3};
        Vector vector2 = new Vector(vector2Array);
        System.out.println("Параметры вектора2: " + vector2.toString());
        System.out.println("Размер вектора = " + vector2.getSize());
        System.out.println("Длина вектора = " + vector2.getLength());

        System.out.println("Сложение векторов: " + Vector.addVector(vector1, vector2));
        System.out.println("Разность векторов: " + Vector.subVectors(vector1, vector2));
        System.out.println("Скалярное произведение векторов: " + Vector.scalarMultiplication(vector1, vector2));

        System.out.println("Установка компоненты вектора по индексу. Введите индекс и компоненту (вектор1)");
        int index = scanner.nextInt();
        double component = scanner.nextDouble();
        vector1.setElement(index, component);
        System.out.println(vector1.toString());

        System.out.println("Введите индекс элемента, который хотите получить (вектор2)");
        index = scanner.nextInt();
        double element = vector2.getElement(index);
        System.out.println(element);
    }
}
