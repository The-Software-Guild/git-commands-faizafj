/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.summative.assessments;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        int userWins = 0;
        int computerWins = 0;
        int drawWins = 0;
        
        //using imports and defining them
        Random computersInput = new Random();
        Scanner userInput = new Scanner (System.in);
        
        //Asking user to enter number of rounds
        System.out.println("How many rounds would you like to play (HINT: Between 1 and 10!) ");
        String rounds = userInput.nextLine();
        int numberOfRounds = Integer.parseInt(rounds);
        
        //ensuring that number of rounds is more than 1 and less than 10
        if (numberOfRounds > 10 || numberOfRounds < 1){
            System.out.println("Error! You have chosen an invalid number");
            //exit();   
        } else {
            System.out.println("Amazing let's start!");
        }
        
        //setting true flag
        boolean stillPlaying = true;
        
        while (stillPlaying){
 
        // Users turn:    
            System.out.println("Do you choose Rock, Paper Or Scissors? ");
            String usersChoice = userInput.nextLine();
            int usersTurn = 0; //user Input converted to Int 

            if (usersChoice == "rock" || usersChoice == "Rock"){ //Based on number chosen a specific item is assigned
                usersTurn = 1;
            } 
            if (usersChoice == "Paper" || usersChoice == "paper"){
                usersTurn = 2;                    
            } 
            if (usersChoice == "Scissors" || usersChoice == "scissors"){
                usersTurn = 3;
            }            
            
            
            //Computers Turn:
            int computersTurn = computersInput.nextInt(1,4);
            System.out.print("Computers turn.... ");
            
            if (computersTurn == 1){ //Based on number chosen a specific item is assigned
                System.out.println("Computer choose: Rock!");
            } else if (computersTurn == 2){
                System.out.println("Computer choose: Paper!");                    
            } else {
                System.out.println("Computer choose: Scissors!");
            }
            
            //calculate the winner 
            if (computersTurn == usersTurn ){ //if draw
                drawWins += 1;
                System.out.println("This round was a draw!");
                numberOfRounds -= 1;

            } else if (computersTurn == 1 && usersTurn == 2){ //if rock beat paper
                userWins += 1;
                System.out.println("You won this round!");
                numberOfRounds -= 1;

            } else if (computersTurn == 2 && usersTurn == 1){ //if paper is beaten by rock
                computerWins += 1;
                System.out.println("Computer won this round!");
                numberOfRounds -= 1;
                
            } else if (computersTurn == 1 && usersTurn == 3){ //if rock beat scissors
                computerWins += 1;
                System.out.println("Computer won this round!");
                numberOfRounds -= 1;
                
            } else if (computersTurn == 3 && usersTurn == 1){ //if scissors beaten by rock
                userWins += 1;
                System.out.println("You won this round!");
                numberOfRounds -= 1;
                
            } else if (computersTurn == 3 && usersTurn == 2){ //if scissors beat paper
                computerWins += 1;
                System.out.println("Computer won this round!");
                numberOfRounds -= 1;
                
            } else { //else (if) paper is beaten by rock
                userWins += 1;
                System.out.println("You won this round!");
                numberOfRounds -= 1; 
            }
            
            if (numberOfRounds == 0){
                
                if (computerWins > userWins){
                System.out.println("Computer won overall! Computer won " + computerWins + " time/s and had " + drawWins + " draw/s." );
                } else if (computerWins < userWins){
                System.out.println("You won overall! You won " + userWins + " time/s and had " + drawWins + " draw/s." );
                }else {
                System.out.println("You both won! This was a draw!");  
                }
                System.out.println("Would you like to play again?");
                String playAgain = userInput.nextLine();
                
                if (playAgain == "yes" || playAgain == "Yes"){
                    stillPlaying = true;
                } else {
                    stillPlaying = false;
                    break;
                }
                
                
                
            }
 
        }
    }
}
