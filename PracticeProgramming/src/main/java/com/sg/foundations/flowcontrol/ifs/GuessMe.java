/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author faiza
 */
public class GuessMe {
     public static void main(String[] args) {
         
         int myNumber = 90;
         Scanner userInput = new Scanner (System.in);
         
         System.out.println("Enter a number ");
         String usersNumber = userInput.nextLine();
         
         int userNumberConverted = Integer.parseInt(usersNumber);
         
         if (userNumberConverted == myNumber){
             System.out.println("Wow, nice guess! That was it!");
         } else if (userNumberConverted < myNumber){
             System.out.println("Ha, nice try - too low! I chose # " + myNumber);
         } else {
             System.out.println ("Too bad, way too high. I chose #." + myNumber); 
         }

     }
}
