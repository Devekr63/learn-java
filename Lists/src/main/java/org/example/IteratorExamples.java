package org.example;

import java.util.LinkedList;
import java.util.List;

public class IteratorExamples {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>(List.of("Goa", "Malaysia", "Melbourne", "Paris", "L.A.", "Thailand", "New York"));
//        testIterators(list);
        testListIterator(list);
    }

    static void testIterators(LinkedList<String> list){
        var itr = list.iterator();
        while (itr.hasNext()){
            String place = itr.next();
            if (place.startsWith("M")){
                System.out.println(" My best place to visit :"+place);
            }else {
                System.out.println(" --> "+place);
            }
        }
    }
    static void testListIterator(LinkedList<String> list){
        var itr = list.listIterator(list.size());
        itr.add("Canada");
        while(itr.hasPrevious()){
            System.out.println(" --> "+itr.previous());
            list.remove();
        }
    }
}
