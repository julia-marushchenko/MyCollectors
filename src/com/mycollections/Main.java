/**
 *  Java program to create and recreate required collection with condition.
 */

package com.mycollections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create a list with numbers.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(8);
        numbers.add(5);
        numbers.add(6);
        numbers.add(4);
        numbers.add(11);
        numbers.add(9);

        // Create a list with numbers two times bigger.
        ArrayList<Integer> doubleNumbers = numbers.stream()
                .map(val -> val * 2)
                .collect(Collectors.toCollection(ArrayList::new));

        // Printing two collections to console.
        System.out.println("Original list: " + numbers);
        System.out.println("Modified list: " + doubleNumbers);

    }
}