package com.java.oshik;

/**
 * Created by oshikzigler on 15/07/2017.
 */
public class DataTypeNonPrimitive {

    public static void main (String args[]){

        String firstName = "oshik";
        String lastName = "zigler";
        int age = 31;

        //1.A
        String ageToString = Integer.toString(age);
        System.out.println("My age by String is " + age);

        //B
        String fullName = firstName.concat(lastName);
        System.out.println("My full name is " + fullName);

        //C
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("My full name in upper case is " + upperCaseFullName);

        //D
        System.out.println("Length of my full name is " + fullName.length() + " characters");

        //E
        boolean ageCompare =  ageToString.equals(fullName);
        System.out.println("Does my name equales to my age? " + ageCompare);

        //2
        String sentence [] = {"Java", "is", "a", "general", "purpose", "computer", "programming", "language"};
        System.out.println("Last 3 words are: " + sentence[5]+ "," + sentence[6] + "," + sentence[7]);

        //2_forLoop
        for (int i = 5; i < sentence.length; i++) {
            System.out.print(sentence[i]+",");
        }
        System.out.println();

        //3
        String twoDimArray[][] = new String[2][3];
        twoDimArray[0][0] = "Moshe";
        twoDimArray[0][1] = "22";
        twoDimArray[0][2] = "Jerusalem";
        twoDimArray[1][0] = "Joseph";
        twoDimArray[1][1] = "45";
        twoDimArray[1][2] = "London";

        System.out.println(twoDimArray[0][2]);


    }

}
