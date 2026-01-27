package gr.aueb.cf.cf9.ch17.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10);

        // Filter even numbers
        numbers.stream()
                .filter(num -> num % 2 == 0) // Intermediate op
                .forEach(System.out::println);      // terminal

        Iterable<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Intermediate op
                .toList();                         // unmodifiable list

        List<Integer> evenNumbers2 = numbers.stream()
                .filter(n -> n % 2 == 0)    // Intermediate op
                .collect(Collectors.toList());    // unmodifiable list

        var evenNumber3 = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toArray();


        List<String> cities = List.of("Athens", "Berlin", "Tokyo", "Paris");

        var filteredCities = cities.stream()
                .filter(city -> city.startsWith("T"))
                .collect(Collectors.toCollection(HashSet::new));
    }
}
