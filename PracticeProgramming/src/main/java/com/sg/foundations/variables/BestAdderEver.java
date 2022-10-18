/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.variables;
import java.util.Scanner;

public class BestAdderEver {
    public static void main (String [] args){
        
        Scanner userInput = new Scanner (System.in); //define scanner 
        int totalValue; //define totalValue variable
         
        System.out.println("Please enter your first number");
        int number1 = Integer.parseInt(userInput.nextLine()); //define number1 as input from scanner
        
        System.out.println("Please enter your second number"); //define number2 as second input from scanner
        int number2 = Integer.parseInt(userInput.nextLine());    
        
        System.out.println("Please enter your third number"); //define number3 as third input from scanner
        int number3 = Integer.parseInt(userInput.nextLine());
        
        System.out.println("Calculating...");
        
        System.out.print("The total is: ");
        
        totalValue = number1 + number2 + number3;
        
        System.out.print(totalValue);
        
    }
}