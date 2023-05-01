import java.util.*;

import static java.util.Collections.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));
        List<String> strings = new ArrayList<>(List.of("one","by","by","one","try"));
        task1();
        task2();
        task3(words);
        task4(strings);

    }


    List<String> strings = new ArrayList<>(List.of("один", "один", "два", "два", "два", "три", "три", "три"));

    public static void task1() {
        System.out.println("Задача 1");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> newNumber = new HashSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0 && !newNumber.contains(num)) {
                System.out.println(num);
                newNumber.add(num);
            }

        }
    }

    public static void task3(List<String> words) {
        System.out.println("Задача 3");
        Set<String> newWords = new HashSet<>(words);
        System.out.println(newWords);
        System.out.println();
    }

    public static void task4(List<String> strings) {
        System.out.println("Задача 4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : strings) {
            if (map.containsKey(word)) {
                Integer count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        System.out.println(map);
    }
}