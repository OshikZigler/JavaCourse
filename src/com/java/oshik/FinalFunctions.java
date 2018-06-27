package com.java.oshik;

import java.util.Random;

public class FinalFunctions {

    //Excercise 1

    public void evenNumbers(int[] numbers) {

        System.out.println("Even numbers are:");
        int[] newEvenNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                if (numbers[i] % 4 == 0) {
                    newEvenNumbers[i] = numbers[i];
                    System.out.println(newEvenNumbers[i]);
                }

            }
        }
    }

    //Excercise 2
    public void primeNumbers(int[] numbers) {
        System.out.println("Prime Numbers are:");
        for (int number : numbers) {
            boolean isPrime = true;
            for (int i = 2; i < number / 2; i++) {
                if ((number % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(number);
        }
    }

//    //Excercise 3
//    public void sortedNumbers (int [] numbers) {
//        System.out.println("Sorted numbers are:");
//
//    }

    //Excercise 4

    public void lyrics(String song) {
        System.out.println("Random Sorted Lyrics:");
        int rand;
        Random ran = new Random();
        String[] lyric = song.split(" ");
        for(int i = 1; i < lyric.length ; i++)
        {
            rand = ran.nextInt(lyric.length);
            System.out.print(lyric[rand] + " ");
        }
        System.out.println();
    }

    //Excercise 5.A



    public String longestString (String[] words){
        System.out.print("Longest String is ");
        int max = 1;
        String longestString = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max){
            max = words[i].length();
            longestString = words[i];
            }
        }
        return longestString;
    }

    //Excercise 5.B
    public String[] arayContainString (String[] words , String string) {
        System.out.println("Strings that contains search string: ");
        String[] resultList = new String[words.length];
        int i = 0;
        for (String tmp : words)
        {
            if (tmp.contains(string)){
                resultList[i] = tmp;
                i++;
            }
        }

        return resultList;
    }


}
