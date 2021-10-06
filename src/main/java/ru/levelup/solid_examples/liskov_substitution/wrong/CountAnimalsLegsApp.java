package ru.levelup.solid_examples.liskov_substitution.wrong;

import java.util.Arrays;
import java.util.List;

public class CountAnimalsLegsApp {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Lion(), new Penguin(), new Snake(), new Penguin());
        animalsLegCount(animals);
    }

    public static void animalsLegCount(List<Animal> list) {
        list.forEach(animal -> {
            if (animal instanceof Lion) {
                Lion lion = (Lion) animal;
                System.out.printf("Я лев и у меня %d лапы \n", lion.getLegCount());
            }
            if (animal instanceof Penguin) {
                Penguin penguin = (Penguin) animal;
                System.out.printf("Я пингвин и у меня %d ноги \n", penguin.getLegCount());
            }
            if (animal instanceof Snake)
                System.out.println("Я змея и что-то мне подсказывает, что у меня нет конечностей");
        });
    }
}