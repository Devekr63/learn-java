package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        StringBuffer strBuffer = new StringBuffer("Devendra");
        System.out.println(strBuffer.capacity());
        System.out.println(strBuffer.length());
        
        String[] fullName = {" Kumar", " Rao"};
        strBuffer.append(String.join("", fullName));
        System.out.println(strBuffer);
    }
}