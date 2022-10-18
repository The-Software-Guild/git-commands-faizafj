/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main (String [] args){
        Scanner userInput = new Scanner (System.in);
        System.out.println("I need a noun: ");
        String noun1 = userInput.nextLine(); //1
        
        System.out.println("I need a adjective: ");
        String adjective1 = userInput.nextLine(); //2
        
        System.out.println("I need another noun: ");
        String noun2 = userInput.nextLine(); //3
        
        System.out.println("I need a number: ");
        int number1 = Integer.parseInt(userInput.nextLine()); //4
        
        System.out.println("I need a adjective: ");
        String adjective2 = userInput.nextLine(); //5
        
        System.out.println("I need a plural noun: ");
        String pluralNoun1 = userInput.nextLine();//6
        
        System.out.println("I need another plural noun: ");
        String pluralNoun2 = userInput.nextLine();//7
        
        System.out.println("I need another plural noun: ");
        String pluralNoun3 = userInput.nextLine();//8
        
        System.out.println("I need another verb: ");
        String verb1 = userInput.nextLine();//9
        
        System.out.println("Same verb (past particple): ");
        String verb2 = userInput.nextLine();//10
        

        
        System.out.println (noun1 + ": the " + adjective1 + " frontier. These are the voyages of the starship " + noun2 + ".");
        System.out.println("Its " + number1 + "-year mission: to explore strange"); 
        System.out.println (adjective2 + " " +  pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2 + " and" + " " + adjective2 + " " +  pluralNoun3 + ",");
        System.out.println("to boldly " + verb1 + " where no one has " + verb2 + " before.");
        


        
        
        
    }
}
