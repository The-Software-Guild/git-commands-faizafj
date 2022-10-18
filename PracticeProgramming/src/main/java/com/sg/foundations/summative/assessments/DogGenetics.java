package com.sg.foundations.summative.assessments;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        Random randomPercentage = new Random (); //initialising the randomPercentage variable and using the random module.
        int percentages = 0; 
        
        String [] dogList = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman" }; //A list with all the dog types
        
        int dogListLength = dogList.length;
        for (int i = 0; i < dogListLength; i++){
            System.out.println(dogList[i]);
            int percentage = randomPercentage.nextInt(1, 100); 
            percentages +=  percentage;
            
            System.out.println(percentage);
            
        }
    }
}
