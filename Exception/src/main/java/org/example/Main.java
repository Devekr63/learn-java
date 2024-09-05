package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("0200");
        int j = 0;
        str.reverse();
        while(j<str.length() && str.charAt(j) == '0'){
            j++;
        }

        StringBuffer s2 = new StringBuffer("Devendra");
        System.out.println(s2.isEmpty());

        s2.delete(s2.length()-2,s2.length());
        System.out.println(s2);

        System.out.println(str.substring(j, str.length()));
    }
}