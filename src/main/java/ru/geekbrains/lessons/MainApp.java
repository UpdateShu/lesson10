package ru.geekbrains.lessons;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        Task1();
        Task2();
    }

    static void Task1()
    {
        String[] fruits = { "яблоко", "груша", "банан", "манго", "яблоко", "слива", "банан", "персик", "банан", "киви",
                "яблоко", "персик", "груша", "гранат", "апельсин", "груша", "киви", "персик", "абрикос", "груша" };
        System.out.println("В массиве " + Arrays.toString(fruits) + "\nнайдены совпадения:");

        HashMap<String, List<String>> map = new HashMap();
        for (int i = 0; i < fruits.length; i++) {
            String key = Integer.toString(fruits[i].hashCode());
            List<String> val = map.getOrDefault(key, new ArrayList<String>());
            val.add(fruits[i]);
            if (!map.containsKey(key))
                map.put(key, val);
        }
        for (Map.Entry<String, List<String>> mapFruit : map.entrySet())
        {
            List<String> val = (List<String>)mapFruit.getValue();
            System.out.println(val.get(0) + " - " + val.size());
        }
    }

    static void Task2()
    {
        System.out.println();
        System.out.println("Телефонный справочник");

        Directory dir = new Directory();
        dir.add("Иванов","123456");
        dir.add("Сидоров", "300200");
        dir.add("Михайлов", "464646");
        dir.add("Александров", "785634");
        dir.add("Иванов", "567234");
        dir.add("Кузнецова", "555222");
        dir.add("Петров", "987654");
        dir.add("Иванов", "201201");
        dir.add("Петров", "321654");
        dir.add("Иванов", "876876");
        dir.add("Сидоров", "151515");
        dir.add("Сидоров", "777333");
        System.out.println(dir);
        System.out.println();

        System.out.println("Поиск по фамилии:");
        System.out.println(dir.get("Иванов"));
        System.out.println(dir.get("Сидоров"));
        System.out.println(dir.get("Михайлов"));

        Collections.sort(dir);
        System.out.println("Сортировка: " + dir);
    }
}
