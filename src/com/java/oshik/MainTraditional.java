package com.java.oshik;

/**
 * Created by oshikzigler on 15/07/2017.
 */
public class MainTraditional {

    public static void main(String[] args) {
    Israel israeli = new Israel();
    China chinese = new China();
    USA american = new USA();

        System.out.println("Traditional food for israelis: " + israeli.myTraditionalFood());
        System.out.println("Traditional food for chinese: " + chinese.myTraditionalFood());
        System.out.println("Traditional food for americans: " + american.myTraditionalFood());
        System.out.println();
        System.out.println("Traditional vacation for israelis: " + israeli.myTraditionaVacation());
        System.out.println("Traditional vacation for chinese: " + chinese.myTraditionaVacation());
        System.out.println("Traditional vacation for israelis: " + american.myTraditionaVacation());
        System.out.println();
        System.out.println("Traditional language for israelis: " + israeli.myTraditionaLanguage());
        System.out.println("Traditional language for chinese: " + chinese.myTraditionaLanguage());
        System.out.println("Traditional language for israelis: " + american.myTraditionaLanguage());




    }



}
