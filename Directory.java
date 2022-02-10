package ru.geekbrains.java2.lesson3;

import java.util.HashMap;
import java.util.Map;

public class Directory {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ivanov", 223221);
        map.put("Petrov", 291012);
        map.put("Sidorov", 123421);
        map.put("Kozlov", 124354);
        map.put("Fedorov", 542354);
        map.put("Sidorov", 564321);
        map.put("Zaicev", 215634);
//
//            for (Map.Entry<String, String> o : hm.entrySet()) {
//                System.out.println(o.getKey() + ": " + o.getValue());
//            }
//            hm.put("Germany", "Berlin2");
            System.out.println(map);
//            map.add("Copy", 215634);
        System.out.println(map);
    }
}
