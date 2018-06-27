package com.java.oshik;


import java.io.IOException;

/**
 * Created by oshikzigler on 15/07/2017.
 */
public class Statements {

    public static void main(String[] args) throws IOException {

        //1.a
        String [] country = {"Austria" , "Germany" , "Canada" , "Peru" , "Israel"};
        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);
        }
        System.out.println(); //BLANK SPACE

        //1.b
        for (int i = 0; i < country.length; i++) {
            if (country[i].equals("Israel") ) {
                System.out.println("Israel is in the array");
            }
        }
        System.out.println();//BLANK SPACE

        //1.c
        String thirdCountry = country[2];
        if (thirdCountry.equals("China")) {
            System.out.println("Yes, it is there");
        }
        else
            System.out.println("No, sorry..");

        System.out.println();//BLANK SPACE


        //1.d
        System.out.println("First country is " + country[0] + " and it has " + country[0].length() + " characters");

        System.out.println();//BLANK SPACE

        //2.a
        int[] numbers = {15 , 2 , 36 , 72 , 7};
        if (numbers[0] > numbers[1]) {
            System.out.println("First number is bigger");
        }
        else
            System.out.println("Second number is bigger");

        //2.b
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Array sum is: " + sum);

        System.out.println(); ////BLANK SPACE


        //2.c
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number is " + max);


        //I'M NOT SURE WHAT IS THIS EXERCISE

        /*File txtFile = new File("C:/Users/Oshik/Documents/QA/Automation/Test_Text_Files/Statements_Excercise3.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(txtFile))){
            String line = null;

            while ((line = br.readLine()) != null){
                System.out.println(line);

                String name = "Oshik";
                if(line.contains(name)){
                    System.out.println("The word " + name + " is found in file: " + txtFile.getName());
                }
            }
        }*/

        System.out.println(); //BLANK SPACE


        //3.

        int age = 32;

        if (age > 0 && age < 6) {
            System.out.println("Go to kindergarten");
        }
        else if (age >= 6 && age <= 18) {
            System.out.println("Go to school");
        }
        else if (age > 19 && age < 67) {
            System.out.println("Go to work");
        }
        else if (age >= 67 && age <= 120) {
            System.out.println("Collecting pension");
        }
        else
            System.out.println("You are too old :)");

        //5.

        String occupation = "Teacher";
        int salary = 0;

        switch (occupation){
            case "Teacher":
                salary = 5000;
                break;

            case "Bank Teller":
                salary = 10000;
                break;

            case "QA":
                salary = 15000;
                break;

            case "Avarage salary":
                salary = 9100;
                break;

            default:
                break;
        }
        System.out.println("Your salary is " + salary);

        System.out.println(); //BLANK SPACE

        //6.

        String twoDimArray[][] = new String[2][3];
        twoDimArray[0][0] = "Moshe";
        twoDimArray[0][1] = "22";
        twoDimArray[0][2] = "Jerusalem";
        twoDimArray[1][0] = "Joseph";
        twoDimArray[1][1] = "45";
        twoDimArray[1][2] = "London";

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j <= twoDimArray.length; j++) {
                System.out.println(twoDimArray[i][j]);
            }
        }

        System.out.println();  //SPACE

        //7.
        int [] newNumber = new int [30];

        for (int i = 1; i < newNumber.length; i++) {
            if (i % 2 ==0) {
                System.out.print(i + ",");

            }
        }

        System.out.println(); //BLANK SPACE


        //8.
        String letters [] = {"o","l","l","e","H"};
        int i = letters.length -1;

        do {
            System.out.print(letters[i]);
            i--;
        } while (i>=0);

    }




}
