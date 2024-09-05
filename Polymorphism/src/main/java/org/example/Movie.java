package org.example;

public class Movie {
    String name;
    public Movie(String name){
        this.name = name;
    }
    public void watchMovie(){
        System.out.printf("Now playing your favorite movie %s%n", name);
    }

    //factory method
    public static Movie getMovie(String type, String name){
        return switch (type.toUpperCase().charAt(0)){
            case 'A' -> new Adventure(name);
            case 'C' -> new Comedy(name);
            default -> new Movie(name);
        };
    }
}

class Adventure extends Movie{

    public Adventure(String name) {
        super(name);
    }

    @Override
    public void watchMovie() {
        System.out.printf("Now playing your favorite adventure movie %s%n", name);
    }
}

class Comedy extends Movie{
    public Comedy(String name){
        super(name);
    }

    @Override
    public void watchMovie() {
        System.out.printf("Now playing your favorite comedy movie %s%n", name);
    }

    public void printName(){
        System.out.println("Title of the comedy movie is "+name);
    }
}
