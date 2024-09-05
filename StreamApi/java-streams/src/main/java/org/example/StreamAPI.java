package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> s1 = list.stream();

        s1.filter(n -> n%2==0)
                .map(n -> n*n)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .forEach(System.out::println);
    }
}
