package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
//        try{
//            throw new Exception("Test Exception.");
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }finally {
//            System.out.println("Test is done.");
//        }

        List<Student> students = Arrays.asList(
                new Student(100),
                new Student(101),
                new Student(105),
                new Student(102),
                new Student(107)
        );

        students.stream()
                .filter(s1 -> s1.id%2==0)
                .sorted((s1,s2) -> s2.id.compareTo(s1.id))
                .forEach(System.out::println);
    }

}
