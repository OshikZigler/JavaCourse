package com.java.oshik;

/**
 * Created by oshikzigler on 15/07/2017.
 */
public class DataTypePrimitive {

    public static void main(String[] args) {

        // primitive data type deceleration

        int Age = 31;
        char NameFirstLetter = 'O';
        double Grade = 89.48;
        boolean Sex = true;

        //printing primitive data type

        System.out.println("My age is " + Age);
        System.out.println("First letter of my name is " + "'"+  NameFirstLetter +"'");
        System.out.println("My avarage grade is " + Grade);
        System.out.println("I am a male = " + Sex);


        //casting from double to int

        int newGrade = (int) Grade;
        System.out.println("My new avarage grade is " + newGrade);



    }
}
