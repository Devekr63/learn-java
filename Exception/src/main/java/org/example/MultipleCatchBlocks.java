package org.example;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int i=5;
        int j=0;
        int[] arr = new int[5];
        String str = null;

        try{
            j = 10/i;
            System.out.println("value at index  5 : "+arr[5]);
            System.out.println("Length of the string: "+str.length());
        }catch(ArithmeticException are){
            System.out.println("You are trying to divide by zero.");
        }catch (ArrayIndexOutOfBoundsException arrIndE){
            System.out.println("Size of array is: "+arr.length+", you cannot access index more than "+(arr.length-1));
        }
    }
}
