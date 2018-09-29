package ru.academits.blpolga.range.main;

import ru.academits.blpolga.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Range range = new Range(0, 0);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало диапазона");
        range.setFrom(scanner.nextDouble());
        System.out.println("Введите конец диапазона");
        range.setTo(scanner.nextDouble());

        System.out.println("Начало диапазона = " + range.getFrom());
        System.out.println("Конец диапазона = " + range.getTo());
        System.out.println("Длина диапазона = " + range.getLength());

        System.out.println("Введите число");
        double number = scanner.nextDouble();
        if (range.isInside(number)) {
            System.out.println("Число принадлежит диапазону");
        } else {
            System.out.println("Число не принадлежит диапазону");
        }
    }
}
