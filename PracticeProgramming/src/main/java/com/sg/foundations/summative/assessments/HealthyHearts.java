/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.summative.assessments;

import java.util.Scanner;

/**
 *
 * @author faiza
 */
public class HealthyHearts {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in); //uses the Scanner and defines it as userInput
        System.out.print("Enter your age: "); 
        int age = Integer.parseInt((userInput.nextLine())); // Allows user to input age
        
        
        double maxHeartRange = 220 - age; //maxHeartRange
        double heartRateZoneFifty = maxHeartRange / 2;  //heartRateZone target minimum
        double heartRateZoneEighty = (maxHeartRange * 85) / 100; //heartRateZone target maximum
        
        System.out.println("Your maximum heart rate should be " + Math.round(maxHeartRange) +  " beats per minute"); //rounds out the number to the nearest 5 and prints
        System.out.println("Your target HR Zone is " + Math.round(heartRateZoneFifty) + " - "  + Math.round(heartRateZoneEighty) +  " beats per minute");

    }
}
