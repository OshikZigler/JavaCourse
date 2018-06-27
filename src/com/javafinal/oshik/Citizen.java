package com.javafinal.oshik;

public class Citizen {
    String name;
    int id;
    int age;
    double salary;

    public void verifyAge() {

        if (age <= 0 || age > 120)
            System.out.println("Citizen's age is out of range");
    }

    public void verifyId(){
        String idString = Integer.toString(id);
        if (idString.length() !=9)
            System.out.println("Citizen's ID is not 9 digits");
        if (id % 2 == 0)
            System.out.println("Citizen's ID number should not divide by 2");

    }
}