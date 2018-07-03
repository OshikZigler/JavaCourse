package com.java.oshik;

/**
 * Created by oshikzigler on 15/07/2017.
 */
public class Exception {

    public static void main(String[] args) {

        //1.
        int [] numbers = {0 , 12};

        try {
            System.out.println(numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array has no such element");
        }

        //1.a
        try{
            int a = numbers[1]/numbers[0];
            System.out.println(a);
        }
        catch (ArithmeticException ae) {
            System.out.println("You can't divide by 0");
        }
        finally {
            System.out.println("Finally will always execute");
        }




    }
}
