package org.example;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Student std1 = new Student("Devendra", "28");

        System.out.println(std1);

        //Access private fields and changing the value of those fields
        Field[] fields = std1.getClass().getDeclaredFields();

        for(Field field : fields){
            if(field.getName().equals("name")){
                System.out.println(field.getModifiers());
                field.setAccessible(true);
                field.set(std1, "Devendra Kumar");
            }
        }
        System.out.println(std1);

        Method[] methods = std1.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(method.getName().equals("itIsFunny")){
                method.setAccessible(true);
                method.invoke(std1);
            }
            //invoking a private static method
            if(method.getName().equals("lowEnergy")){
                method.setAccessible(true);
                method.invoke(null);
            }
        }
    }
}

class Student {
    private String name;
    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    private void itIsFunny(){
        System.out.println("Ha ha aha ha");
    }

    private static void lowEnergy(){
        System.out.println("I am feeling low.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}