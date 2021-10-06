package ru.levelup.solid_examples.open_closed.right;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BubbleSorter<T extends Comparable<? super T>> {
    private T[] array;

    public T[] sort() {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array);
                }
            }
        }
        return array;
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }
}