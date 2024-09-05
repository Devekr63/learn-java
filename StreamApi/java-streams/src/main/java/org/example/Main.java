package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

//       list.forEach(num -> System.out.println(num));
//       list.forEach(System.out::println);
//       list.forEach(Main::print);

        // using Consumer
        Consumer<Integer> con = new Consumer<Integer>() {
            @Override
            public void accept(Integer num) {
                System.out.println(num);
            }
        };

        Consumer<Integer> con2 = (num) -> System.out.println(num);
        list.forEach(con2);

    }

    public static void print(Integer num){
        System.out.println(num);
    }
}