package exercise;

import java.util.ArrayList;

public class RemoveDuplicateNumberFromList {
    public static void main(String[] args) {
        // Write a program to remove duplicate numbers from a list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(104);
        list.add(109);
        list.add(109);
        list.add(207);

        list.stream().distinct().toList().forEach(System.out::println);
    }
}
