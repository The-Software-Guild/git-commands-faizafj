package com.sg.foundations.flowcontrol.ifs;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faiza
 */

import java.util.Scanner;

public class YourLifeInMovies {
    public static void main(String[] args) {
         
         Scanner userInput = new Scanner (System.in);
         System.out.println("What is your name? ");
         String usersName = userInput.nextLine();        
         
         System.out.println("What year were you born? ");
         String usersAge = userInput.nextLine();
         
 
         System.out.println("Well " + usersName + " based on your age, did you know: ");
         
         int userAgeConverted = Integer.parseInt(usersAge); //turns it from a string to a number
         
         if (userAgeConverted <= 2005){
             System.out.println("Pixar's 'Up' came out over a decade ago.");
         }
         if (userAgeConverted <= 1995){
             System.out.println("And The first Harry Potter came out over 15 years ago.");
         }
         if (userAgeConverted <= 1985){ //less than 1980 and more than 1975
             System.out.println("Also, Space Jam came out not last decade, but the one before THAT.");
         }
         if (userAgeConverted <= 1975){
             System.out.println("And also, The original Jurassic Park release is closer to the first lunar landing than it is to today.");
         }
         if (userAgeConverted <= 1965){
             System.out.println("And finally, The MASH TV series has been around for almost half a century!");
         } 
     }
}
