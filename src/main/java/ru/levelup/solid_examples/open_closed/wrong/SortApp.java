package ru.levelup.solid_examples.open_closed.wrong;

import java.util.Arrays;
import java.util.Random;

public class SortApp {
    public static void main(String[] args) {
        BubbleSorter bs = new BubbleSorter();

        int[] intArr = new Random().ints(10, 1, 100).toArray();
        int[] sa1 = bs.integerSort(intArr);
        System.out.println("Sorted array: " + Arrays.toString(sa1));

        String[] strArr = {"Rick", "Summer", "Morty", "Jerry", "Beth", "Squanchy", "Mr. Poopybutthole", "Birdperson"};
        String[] sa2 = bs.stringSort(strArr);
        System.out.println("Sorted array: " + Arrays.toString(sa2));
    }
}