package ru.academits.blpolga.range.main;

import ru.academits.blpolga.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало и конец первого диапазона");
        double from1 = scanner.nextDouble();
        double to1 = scanner.nextDouble();

        System.out.println("Введите начало и конец второго диапазона");
        double from2 = scanner.nextDouble();
        double to2 = scanner.nextDouble();

        Range range1 = new Range(from1, to1);
        Range range2 = new Range(from2, to2);

        range1.printLength();
        range2.printLength();

        Range range3 = range1.getIntersection(range2);
        if (range3 == null) {
            System.out.println("Пересечения нет");
        } else {
            System.out.println("Пересечение от " + range3.getFrom() + " до " + range3.getTo());
        }

        Range[] intervalUnion = range1.getUnion(range2);
        Range.printArrayUnion(intervalUnion);

        Range[] intervalDifference = range1.getDifference(range2);
        Range.printArrayDifference(intervalDifference);

        Range range = new Range(0, 0);
        System.out.println("Задайте границы нового диапазона");
        range.setFrom(scanner.nextDouble());
        range.setTo(scanner.nextDouble());

        System.out.println("Введите число");
        double number = scanner.nextDouble();
        if (range.isInside(number)) {
            System.out.println("Число принадлежит диапазону");
        } else {
            System.out.println("Число не принадлежит диапазону");
        }
    }
}