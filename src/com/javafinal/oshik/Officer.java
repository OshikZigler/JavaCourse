package com.javafinal.oshik;

public class Officer extends Soldier {

    private double bonus;
    String [] intelegence = {"8200" , "3036" , "Yahalom"};
    String [] land = {"Golani" , "Nahal" , "Givaty"};
    String [] elite = {"669" , "Matkal" , "Hovlim"};

    @Override
    public void verifyAge(){

        if (age < 21 || age > 57) {
            System.out.println("Officer's age is out of range");
            throw new RuntimeException();
        }

        }


    public Officer (String unit){

        for (String intelegenceUnit : intelegence)
        {
            if (intelegenceUnit.equalsIgnoreCase(unit))
                bonus = 2000;
        }

        for (String landUnit : land)
        {
            if (landUnit.equalsIgnoreCase(unit))
                bonus = 5000;
        }

        for (String eliteUnit : elite)
        {
            if (eliteUnit.equalsIgnoreCase(unit))
                bonus = 8000;
        }
    }

    public double updatedSalary(){
          salary += bonus;
            return salary;
    }

}
