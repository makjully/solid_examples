package ru.levelup.solid_examples.open_closed.right;

import ru.levelup.solid_examples.open_closed.Wine;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        Integer[] intArr = {45, 85, 69, 34, 9, 27, 28, -5, 11, 99};
        BubbleSorter<Integer> bs1 = new BubbleSorter<>(intArr);
        Integer[] sa1 = bs1.sort();
        System.out.println("Sorted array: " + Arrays.toString(sa1));

        String[] strArr = {"Rick", "Summer", "Morty", "Jerry", "Beth", "Squanchy", "Mr. Poopybutthole", "Birdperson"};
        BubbleSorter<String> bs2 = new BubbleSorter<>(strArr);
        String[] sa2 = bs2.sort();
        System.out.println("Sorted array: " + Arrays.toString(sa2));

        Wine[] wineArr = {
                new Wine("19 Crimes", "Blend", 1350.5),
                new Wine("Pfefferer", "Muscat", 1990),
                new Wine("Fetzer", "Merlot", 990),
                new Wine("Chateau Belair Monange", "Blend", 25490),
                new Wine("Marsannay Rose", "Pinot Noir", 4890)
        };
        BubbleSorter<Wine> bs3 = new BubbleSorter<>(wineArr);
        Wine[] sa3 = bs3.sort();
        System.out.println("Sorted array: " + Arrays.toString(sa3));
    }
}