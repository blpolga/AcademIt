package ru.academits.blpolga.arraylisthome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            ArrayList<String> stringArrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                stringArrayList.add(scanner.nextLine());
            }
            System.out.println(stringArrayList);
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 10));
        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(numbers);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 3, 5, 2, 4));
        ArrayList<Integer> newList = new ArrayList<>();

        for (int e : list) {
            if (!newList.contains(e)) {
                newList.add(e);
            }
        }
        System.out.println(newList);
    }
}
