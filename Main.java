package ru.geekbrains.java2.lesson3;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        String word [] = {"Желтый", "Синий", "Красный" };
        List <String> list = new ArrayList<>();
        list.add("Зеленый");
        System.out.println(list);
        list.addAll(Arrays.asList (word));
        System.out.println(list);
        list.addAll(Arrays.asList ("Красный" , "Фиолетовый", "Желтый" , "Черный" , "Синий" , "Синий") );
        System.out.println(list);

        Map<String, Integer> hmap = new HashMap<>();
        for (String x : word) {
            hmap.put(x, hmap.getOrDefault(x, 0) + 1);
        }
        System.out.println(hmap);

    }

}
