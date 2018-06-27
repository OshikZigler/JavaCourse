package com.javafinal.oshik;

public class Main {

    public static void main (String[] args) {

        Citizen citizenOne = new Citizen();
        Soldier soldierOne = new Soldier();
        Officer officerOne = new Officer("golani");
        citizenOne.name = "Oshik Zigler";
        citizenOne.id = 123456789;
        citizenOne.age = 35;
        citizenOne.salary = 30000;
        citizenOne.verifyAge();
        citizenOne.verifyId();

        soldierOne.name = "Private Ryan";
        soldierOne.id = 123456789;
        soldierOne.soldierId = 127349569;
        soldierOne.weapon = "Tavor";
        soldierOne.age = 19;
        soldierOne.salary = 600;
        soldierOne.verifySoldierId();

        officerOne.name = "Beny Gantz";
        officerOne.id = 123456789;
        officerOne.soldierId = 94837509;
        officerOne.age = 54;
        officerOne.salary = 15000;
        officerOne.weapon = "Glock";
        officerOne.verifyAge();
        officerOne.verifyId();
        officerOne.verifySoldierId();
        System.out.println("Officer salary with bonus is: " + officerOne.updatedSalary() + " NIS");

    }
}
