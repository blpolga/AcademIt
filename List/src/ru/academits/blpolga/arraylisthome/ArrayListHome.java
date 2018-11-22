package ru.academits.blpolga.arraylisthome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            ArrayList<String> stringArrayList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                stringArrayList.add(scanner.nextLine());
            }
            System.out.println(stringArrayList);
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

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 2, 1, 3, 5));
        ArrayList<Integer> newList = new ArrayList<>();

        i = 0;
        while (i < list.size()) {
            if (newList.contains(list.get(i))) {
                i++;
                continue;
            }
            newList.add(list.get(i));
            i++;
        }
        System.out.println(newList);
    }
}
