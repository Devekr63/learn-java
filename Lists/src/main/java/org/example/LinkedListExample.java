package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListExample {
    public static void main(String[] args){
        var placesToVisit = new LinkedList<String>();

        placesToVisit.add("Delhi");
        placesToVisit.add(0,"Lucknow");
        addValues(placesToVisit);
        System.out.println(placesToVisit);

        removeElements(placesToVisit);

        String town = placesToVisit.peek();

        System.out.println("Trip Starts at : "+town);
        ListIterator<String> itr = placesToVisit.listIterator(1);
        while(itr.hasNext()){
            System.out.print("--> From: "+town);
            town = itr.next();
            System.out.println(" to "+town);
        }
    }

    public static void addValues(LinkedList<String> list){
        list.addFirst("Varanasi");
        list.addLast("Gorakhpur");

        //Queue
        list.offer("Bangalore");
        list.offerFirst("Masouriee");
        list.offerLast("Hyderabad");

        //Stack
        list.push("Ladhak");
    }

    public static void removeElements(LinkedList<String> list){
        list.remove();
        list.remove("Gorakhpur");
        list.removeFirst();
        list.remove(3);
        list.removeLast();

        //Queue/Deque
        list.poll();
        list.pollFirst();
        list.pollLast();

        list.addAll(List.of("Goa", "Malaysia", "Melbourne", "Paris", "L.A."));

        //Stack
        System.out.println(list.pop());
        System.out.println(list);
    }
}
