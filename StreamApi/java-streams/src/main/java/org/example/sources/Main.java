package org.example.sources;

import java.util.Collections;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var firstStream = Stream.of("One", "Two", "Three")
                .sorted(Collections.reverseOrder());
        var secondStream = Stream.of("Four", "Five", "Six", "Seven")
                .map(String::toUpperCase);

        Stream.concat(secondStream, firstStream)
                .forEach(s-> System.out.println(s));
    }
}
