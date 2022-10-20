package com.sg.foundations.summative.assessments;

import java.util.Random;

public class DogGenetics {
    public static void main(String[] args) {
        Random randomPercentage = new Random (); //initialising the randomPercentage variable and using the random module.
        String [] dogList = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman" }; //A list with all the dog types
        int dogListLength = dogList.length;
        int totalPercentage = 100; 
        
        for (int i = 0; i < dogListLength; i++) { //for every 'number' from 0 to the length of the list;
            System.out.println(dogList[i]); //print out the dog name in index position i.

            if (totalPercentage <= 100) {

                if (i == dogListLength - 1) { //if it's the last element
                    totalPercentage = 100 - totalPercentage; //the percentage will be 100 - total percentage
                    System.out.println(totalPercentage);
                } else {
                    int percentage = randomPercentage.nextInt(totalPercentage);  //select a random number between 1 and the total percentages.
                    totalPercentage = totalPercentage - percentage;
                    System.out.println(totalPercentage);
                }
            } else {
                System.out.println("0%");
            }
            

        }
    }
}

