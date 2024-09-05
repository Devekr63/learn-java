package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    static ArrayList<String> names = new ArrayList<>(
            List.of("Devendra", "Aman", "Deepak")
    );

    static ArrayList<String> moreNames = new ArrayList<>(
            List.of("Ajay","Sanjay","Suman","Abhijeet")
    );

    public static void main(String[] args){
        System.out.println(names);
        names.addAll(moreNames);
        System.out.println(names);

        names.removeIf(name -> name.startsWith("S"));
        System.out.println(names);

        names.retainAll(List.of("Devendra", "Deepak","Aman"));
        System.out.println(names);

        names.addAll(Arrays.asList("Devendra", "Aman", "Deepak","Ajay","Sanjay","Suman","Abhijeet"));
        names.sort(Comparator.naturalOrder());
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        var namesArray = names.toArray(new String[names.size()]);
        System.out.println(Arrays.toString(namesArray));

        String[] arr = {"1", "2", "3","4","5"};
        System.out.println(Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);

        list.set(1, "9");
//        list.add(1,"2");

        System.out.println(list);
        System.out.println(Arrays.toString(arr));

//        List<String> newList = Arrays.asList("1","2","3");
//        newList.add("4");

        List<String> newList = List.of("1","2","3");
        System.out.println(newList);
        newList.add(0,"4");
    }
}
