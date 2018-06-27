package com.java.oshik;

/**
 * Created by oshikzigler on 15/07/2017.
 */

    public class MobileDevice {
        //OOP1 excercise 1
        String model;
        char OS;
        int OSVersion;
        boolean hasFlash;
        double price;
        //OOP1 excercise 2
        //OOP2 excercise 3 (adding "private")
        private int screenWidth;
        private int screenHeight;

    public void PrintParameters(){

        System.out.println("Device model: " + model);
        System.out.println("Device OS: " + OS);
        System.out.println("Device version number: " + OSVersion);
        System.out.println("Device has flash: " + hasFlash);
        System.out.println("Device price: " + price);

    }
    //OOP1 excercise 2
    public int CalculateArea(){

        return screenWidth * screenHeight;
    }

    public void PictureQuality()
    {
        if (hasFlash) {
            System.out.println("Picture quality is GOOD");
        }
        else
            System.out.println("Picture quality is BAD");
    }

    //OOP2 excercise 3
    public void SetArea(int width , int height){

        if (width > 0 && width <= 10 )
            screenWidth = width;
        if (height > 0 && height <= 20)
            screenHeight = height;
        else {
            screenWidth = 0;
            screenHeight = 0;
        }
    }

    //OOP2 excercise 4

    public MobileDevice(int width , int height)
    {
        if(width > 0 && width <= 10)
            screenWidth = width;
        if(height > 0 && height <= 20)
            screenHeight = height;
        else
        {
            screenWidth = 0;
            screenHeight = 0;
        }
    }

}

