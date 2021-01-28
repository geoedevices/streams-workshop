package com.codecool.streams;

import java.util.*;

public class Main {

    private static List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
    private static List<String> newList = new ArrayList<>();

    public static void main(String[] args) {

        for (String actualString : myList) {
            if (actualString.charAt(0) == 'c') {
                newList.add(actualString);
            }
        }

        for (int i = 0; i < newList.size(); i++) {
            newList.set(i, newList.get(i).toUpperCase());
        }


        Collections.sort(newList);

        for (String actualString : newList) {
            System.out.println(actualString);
        }

    }

}
