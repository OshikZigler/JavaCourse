package com.java.oshik;

public class MainFinalFunctions {

    public static void main(String[] args) {

        FinalFunctions finalFunc = new FinalFunctions();
        int[] nums = {17, 11 , 26,  903, 204, 39, 8, 20, 65, 12};
        String[] words = {"Oshik","Zigler","Houzz","Automation at Houzz","NewWayToDesignYourHome","Test Houzz app","Java","intelliJ"};
        String string = "Houzz";

            finalFunc.evenNumbers(nums);
            finalFunc.primeNumbers(nums);
            finalFunc.lyrics("Don't it always seem to go that you don't know what you've got till it's gone");
            System.out.println(finalFunc.longestString(words));
            finalFunc.arayContainString(words , "Houzz");
            for (String tmpString : finalFunc.arayContainString(words , "Houzz"))
                if (tmpString != null)
                    System.out.println(tmpString);



    }
}