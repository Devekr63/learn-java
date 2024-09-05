package org.example.bingo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> bingoPool = new ArrayList<>();

        int start = 1;

        for(char c:"BINGO".toCharArray()){
            for(int i=start; i<start+15; i++){
                bingoPool.add(c+""+i);
            }
            start += 15;
        }

        System.out.println(bingoPool);
        System.out.println("_".repeat(50));

        Collections.shuffle(bingoPool);
        System.out.println(bingoPool.subList(0,15));

//        var first = bingoPool.subList(0,15);
        var first = new ArrayList<>(bingoPool.subList(0,15));

        first.sort(Comparator.naturalOrder());

        first.replaceAll(s -> {
            if(s.charAt(0) == 'G' || s.charAt(0) == 'O'){
                System.out.print(s.charAt(0)+"-"+s.substring(1)+" ");
                return s.charAt(0) + "-" + s.substring(1);
            }
            return s;
        });
        System.out.println("\n"+first);

        System.out.println("_".repeat(50));
        System.out.println(bingoPool.subList(0,15));

        System.out.println("_".repeat(50));

        bingoPool.stream()
                .limit(15)
                .filter(s -> s.indexOf('G') == 0 || s.indexOf('O') == 0)
                .map(s -> s.charAt(0) + "-" + s.substring(1))
                .sorted()
                .forEach(s -> System.out.print(s+" "));

        System.out.println();
        System.out.println("_".repeat(50));

        System.out.println(bingoPool.subList(0,15));

        System.out.println("_".repeat(50));
        var list = Stream.of("I", "am", "a", "stream")
                .collect(Collectors.toMap(
                        s -> s.toLowerCase(), // Key extractor
                        s -> s.length())      // Value extractor
                );
        System.out.println(list);


    }
}
