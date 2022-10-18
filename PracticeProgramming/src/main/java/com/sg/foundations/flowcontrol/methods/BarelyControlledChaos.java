/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;
import java.util.Random;

public class BarelyControlledChaos {

    public static void main(String[] args) {

        String color = color(); // call color method here
        String animal = animal(); // call animal method again here
        String colorAgain = color(); // call color method again here
        double weight = numberMethod(5, 200); // call number method,
            // with a range between 5 - 200
        double distance = numberMethod(10, 20); // call number method,
            // with a range between 10 - 20
        int number = numberMethod(10000, 20000); // call number method,
            // with a range between 10000 - 20000
        double time = numberMethod(2, 6); // call number method,
            // with a range between 2 - 6            

        System.out.println("Once, when I was very small...");

        System.out.println("I was chased by a " + color + ", "
            + weight + "lb " + " miniature " + animal
            + " for over " + distance + " miles!!");

        System.out.println("I had to hide in a field of over "
            + number + " " + colorAgain + " poppies for nearly "
            + time + " hours until it left me alone!");

        System.out.println("\nIt was QUITE the experience, "
            + "let me tell you!");
    }

    
        public static String color(){
            Random randomPicker = new Random();
            String [] colorSelection = new String[]{ 
                "red" , "yellow", "pink", "green", "orange" //A list of all the colours. 
            };
            int randomIndex = randomPicker.nextInt( colorSelection.length ); //gets a random number from the length of the list
            String colorSelected = colorSelection[randomIndex]; //selects the value chosen by the random index
            
            return colorSelected;
        }
    // ??? Method 2 ???
        
        public static String animal(){
            Random randomPicker = new Random();
            String [] animalSelection = new String[]{ 
                "Zebra" , "Lion", "Tiger", "Elephant", "Monkey" //A list of all the animals. 
            };
            int randomIndex = randomPicker.nextInt( animalSelection.length ); //gets a random number from the length of the list
            String animalSelected = animalSelection[randomIndex]; //selects the value chosen by the random index
            
            return animalSelected;
        }
    // ??? Method 3 ???
        
            public static int numberMethod (int a, int b){
            Random randomPicker = new Random();
            int numberSelected = randomPicker.nextInt(a , b);   
            return numberSelected;
        }
}