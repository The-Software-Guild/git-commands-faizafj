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
public class BirthStones {
     public static void main(String[] args) {
         
        Scanner userInput = new Scanner (System.in);
        System.out.println("What is your birth month number: ");
        
        String userNumber = userInput.nextLine();
        
        int monthNumber = Integer.parseInt(userNumber);
        
        String [] months = new String [] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String [] birthStone = new String [] {"Garnet","Amethyst","Aquamarine", "Diamond","Emerald", "Pearl", "Ruby","Peridot", "Sapphire", "Opal", "Topaz", "Turquoise"};

        
        for (int i=0; i < (months.length); i++ ){
            
            if (i == monthNumber){
                System.out.println ("Your birth month is: " + months[i - 1]);
                System.out.println ("Your birth stone is: " + birthStone[i - 1]);
            }
        }    
   
     }
}












