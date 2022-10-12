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
public class TriviaNight {
    public static void main(String[] args) {
       
        
        System.out.println ("Question Time!") ;
        Scanner userInput = new Scanner (System.in);
        //init question 1 and it's possible answers
        System.out.println();
        
        
        System.out.println ("Question One") ;
        String questionOne = "What is the colour of the sky?" ;
        String questionOneAnswer1 = "Green"; 
        String questionOneAnswer2 = "Orange";
        String questionOneAnswer3 = "Blue"; //correct answer
        String questionOneAnswer4 = "Yellow";
        
        //print the question and possible answers
        System.out.println(questionOne);
        System.out.println(questionOneAnswer1);    
        System.out.println(questionOneAnswer2);
        System.out.println(questionOneAnswer3);
        System.out.println(questionOneAnswer4);
        
        String answer1 = userInput.nextLine(); //asks for the user input
        
        if (answer1.contains ("Blue")){
            System.out.println ("Correct!");
        } else {
            System.out.println ("Wrong! The correct answer was: " + questionOneAnswer3 + "!");
        }
        
        System.out.println();
        
        // Question Two
        System.out.println ("Question Two") ;
        String questionTwo = "What is 3*9?";
        String questionTwoAnswer1 = "20"; 
        String questionTwoAnswer2 = "27";
        String questionTwoAnswer3 = "23";
        String questionTwoAnswer4 = "39";
               
        System.out.println(questionTwo);
        System.out.println(questionTwoAnswer1);    
        System.out.println(questionTwoAnswer2);
        System.out.println(questionTwoAnswer3);
        System.out.println(questionTwoAnswer4);
        
        System.out.println("Please type in your answer ");
        String answer2 = userInput.nextLine();
        if (answer2.contains ("27")){
            System.out.println ("Correct!");
        } else {
            System.out.println ("Wrong! The correct answer was: " + questionTwoAnswer2 + "!");
        }
        
        
        System.out.println();
        
        // Question Three 
        System.out.println ("Question Three") ;
        String questionThree = "What is the name of a baby cow?" ;
        String questionThreeAnswer1 = "Calf"; 
        String questionThreeAnswer2 = "Kid";
        String questionThreeAnswer3 = "Puppy";
        String questionThreeAnswer4 = "Kitten";
        
        
        System.out.println(questionThree);
        System.out.println(questionThreeAnswer1);    
        System.out.println(questionThreeAnswer2);
        System.out.println(questionThreeAnswer3);
        System.out.println(questionThreeAnswer4);
        
        System.out.println("Please type in your answer ");
        String answer3 = userInput.nextLine();
        if (answer3.contains ("Calf")){
            System.out.println ("Correct!");
        } else {
            System.out.println ("Wrong! The correct answer was: " + questionThreeAnswer1 + "!");
        }
    }
    
}
