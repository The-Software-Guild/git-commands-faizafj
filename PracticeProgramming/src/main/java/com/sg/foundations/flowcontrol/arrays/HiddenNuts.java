/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;

public class HiddenNuts {

    public static void main(String[] args) {

        String[] hidingSpots = new String[100];//creates a string called hidingSpots
        Random squirrel = new Random(); //creates a random variable
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut"; //using the random Num in the length adding Nut in that pos
        System.out.println("The nut has been hidden ...");

        // Nut finding code should go here! 

        for(int i = 0; i < hidingSpots.length; i++){
            if (hidingSpots[i]!= null) {
                System.out.println("The nut is in position: " + i);
            } 
        }
    }
}
