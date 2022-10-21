package com.sg.foundations.summative.assessments;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

    public static void main(String[] args) {
        Random randomPercentage = new Random(); //initialising the randomPercentage variable and using the random module.
        String[] dogList = {"St. Bernard", "Chihuahua", "Dramatic RedNosed Asian Pug", "Common Cur", "King Doberman"}; //A list with all the dog types
        int dogListLength = dogList.length;
        int totalPercentage = 100; //set max percentage to 100
        
        Scanner userInput = new Scanner(System.in); //uses the Scanner and defines it as userInput
        System.out.print("What is your dog's name?  ");
        String dogName = userInput.nextLine(); // Allows user to input age
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");


        for (int i = 0; i < dogListLength; i++) { //for every 'number' from 0 to the length of the list;

            if (totalPercentage <= 100 && totalPercentage != 0) {
                int percentage = randomPercentage.nextInt(totalPercentage) + 1;  //select a random number between 1 and the total percentages starts at 100.
                System.out.println(percentage + "% " + dogList[i]);
                totalPercentage = totalPercentage - percentage;
            } else if (i == dogListLength) { //if it's the last element
                totalPercentage = 100 - totalPercentage; //the percentage will be 100 - total percentage
                System.out.print (totalPercentage + "% " + dogList[i]);
            } else {
                System.out.println("0% " + dogList[i]);
            }
        }
            System.out.println("Wow, that's QUITE the dog!");
    }
}
