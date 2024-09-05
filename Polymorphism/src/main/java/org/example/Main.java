package org.example;

import java.sql.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Iron Man");
        movie.watchMovie();

        Movie nextMovie = new Adventure("Star wars");
        nextMovie.watchMovie();

        Movie anotherMovie = Movie.getMovie("Comedy", "Wall E");
        anotherMovie.watchMovie();
        Comedy anotherMovie1 = (Comedy) anotherMovie;
        anotherMovie1.printName();

        var advMovie = new Adventure("Tomb raiders");
        advMovie.watchMovie();
        var Hulk = Movie.getMovie("Ad", "hulk");
        Hulk.watchMovie();

        //Runtime casting
//        Comedy comMovie = (Comedy) Movie.getMovie("Ad","Scary Movie");

        //Testing type of object
        Object testMovieObject=Movie.getMovie("M", "Avenger Infinity Wars");
        if(testMovieObject.getClass().getSimpleName() == "Comedy"){
            ((Comedy)testMovieObject).watchMovie();
        }else if(testMovieObject instanceof Adventure){
            ((Adventure)testMovieObject).watchMovie();
        } else if (testMovieObject instanceof Movie m) {
            m.watchMovie();
        }

        int[] arr = {1,2,3,4,5,6};
        printArray(arr); //array passed reference
        printArray(arr.clone()); //array passed by value
        arr[1]=7;
        printArray(arr);
        printTwodArray(arr, Arrays.stream(arr).map(t->t*t).toArray());

        System.out.println(Arrays.toString(arr));
        printThreeDArray(new int[][]{arr, arr}, new int[][]{arr,arr});
    }

    static void printArray(int[] arr){
        System.out.println("Elements in array: ");
        System.out.println(arr);
        for (int t:arr) {
            System.out.printf("%d%n",t);
        }
    }

    static void printTwodArray(int[]... arrays){
        System.out.println("Elements in 2d array: "+"\n"+Arrays.deepToString(arrays));

//        for(int[] a:arrays){
//            for(int t:a){
//                System.out.printf("%d%n",t);
//            }
//        }
    }

    static void printThreeDArray(int[][]... threeD){
        System.out.println(Arrays.deepToString(threeD));
    }
}