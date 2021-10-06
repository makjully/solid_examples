package ru.levelup.solid_examples.open_closed.wrong;

public class BubbleSorter {

    public int[] integerSort(int[] array) {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public String[] stringSort(String[] array) {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    // здесь мог быть Ваш метод по сортировке Wine, или котиков, или дурацких требований заказчика
}