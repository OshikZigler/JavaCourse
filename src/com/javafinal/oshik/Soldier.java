package com.javafinal.oshik;

public class Soldier extends Citizen {

    int soldierId;
    String weapon;


    @Override
    public void verifyAge(){

        if (age < 18 || age > 21)
            System.out.println("Soldier age is out of range");
    }

    public void verifySoldierId(){

        char[] soldierIdString = Integer.toString(soldierId).toCharArray();
        int count = 0;

        for (char charId : soldierIdString) {

            if (charId =='9')
                count++;
        }
        if (count >= 3)
        System.out.println("Soldier ID number contains " + count + " times digit 9");
    }

}
