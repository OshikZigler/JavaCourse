package com.java.oshik;

public class MainMobileDevice {

    public static void main(String[] args) {

        //OOP1 excercise 1

        MobileDevice MyDevice = new MobileDevice(4 , 6);
        MyDevice.model = "Nexus";
        MyDevice.OS = 'A';
        MyDevice.OSVersion = 7;
        MyDevice.hasFlash = true;
        MyDevice.price = 499.99;
        MyDevice.PrintParameters();

        //OOP1 excercise 2

        //MyDevice.screenWidth = 4;
        //MyDevice.screenHeight = 7;
        //MyDevice.CalculateArea();
        MyDevice.PictureQuality();

        //OOP2 excercise 3
        MyDevice.SetArea(11 , 6);
        MyDevice.CalculateArea();
        System.out.println("Device size is: " + MyDevice.CalculateArea());
        MyDevice.PictureQuality();


    }

}
