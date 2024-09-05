package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(true);
        printer.addToner(50);
        System.out.println(printer.printPages(10));
        System.out.println(printer.printPages(20));
        System.out.println(printer.addToner(70));
    }
}