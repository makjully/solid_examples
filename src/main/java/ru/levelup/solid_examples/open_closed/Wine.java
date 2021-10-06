package ru.levelup.solid_examples.open_closed;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString(includeFieldNames = false, of = "name")
public class Wine implements Comparable<Wine> {
    private String name;
    private String grape;
    private double price;

    @Override
    public int compareTo(Wine o) {
        int compareResult = 0;

        if (grape.compareTo(o.grape) > 0 && name.compareTo(o.name) > 0 && price > o.price)
            compareResult = 1;

        if (grape.compareTo(o.grape) < 0 && name.compareTo(o.name) < 0 && price < o.price)
            compareResult = -1;

        return compareResult;
    }
}