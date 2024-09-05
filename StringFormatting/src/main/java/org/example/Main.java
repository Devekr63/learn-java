package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int age = 35;

        String buttelIt = "Print a Bulleted List\n"+
                "\u2022 First Point\n"+
                "\u2023 Second Point\n"+
                "\u2024 Third Point";

        System.out.println(buttelIt);

        String textBlock = """
        Print a Bulleted List:
            \u2022 First Point
                \u2022 Second Point         
        """;
        System.out.println(textBlock);

        for(int i=1; i<=100000; i*=10){
            System.out.printf("%7d %n",i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}