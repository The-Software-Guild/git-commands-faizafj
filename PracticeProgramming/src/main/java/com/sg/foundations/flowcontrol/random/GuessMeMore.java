/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author faiza
 */
public class GuessMeMore {
     public static void main(String[] args) {
        Random randomizer = new Random();
        int myNumber = randomizer.nextInt(- 101, 100); //
        int numberOfTimes = 2;
       
        Scanner userInput = new Scanner (System.in);
        
         System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
         
         
        while (numberOfTimes > 0){ 
            System.out.println("Enter a number ");
            String usersNumber = userInput.nextLine();
            int userNumberConverted = Integer.parseInt(usersNumber);
            if (userNumberConverted == myNumber){
                System.out.println("Wow, nice guess! That was it!");
                numberOfTimes = 0;
            } else if (userNumberConverted < myNumber){
                System.out.println("Ha, nice try - too low");
                numberOfTimes = numberOfTimes- 1;
            } else {
                System.out.println ("Way too high"); 
                numberOfTimes = numberOfTimes- 1;
            }
        }
            System.out.println("My number was: " + myNumber);
    }
}

     

