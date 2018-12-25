package com.DevJds;

public class Main {

    public static void main(String[] args) {
//        width of int - 32 (4 bytes)
        int myINtValue = 5 / 3;
//       Width of float = 32 (bytes)
        float myFloatValue = 5f / 3f;
//       width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue =  " + myINtValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
//        Challenge
//   1. Create a variable to store the number of pounds
//   2. Calculate the number of kilograms for the number above and store in a variable .
//   3. Print out the result.
//   Notes: 1 Pounds is equal to 0.45359237 kilograms

        double numberOfPounds = 200;
        double conversion = 0.45359237d * numberOfPounds;
        System.out.println("Conversion = " + conversion);

    }
}
