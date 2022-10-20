/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sg.foundations.flowcontrol.exercises;

import java.util.Random;
import java.util.Scanner;

public class LuckySevens {
    public static void main(String[] args) {
        Random numberGenerator = new Random(); 
        Scanner userInput = new Scanner (System.in);
        int dice1;
        int dice2;
        int rolls = 0;
        
        System.out.print("How many dollars do you have? ");
        int moneyToBet = Integer.parseInt(userInput.nextLine());
        int moneyTotal = moneyToBet; 
        int maxMoney = moneyToBet;
        int maxRolls = 0;
        
        while (moneyTotal > 0){
               dice1 = numberGenerator.nextInt(1,8);
               dice2 = numberGenerator.nextInt(1,8 );
               rolls = rolls + 1;
               
               if (dice1 + dice2 == 7){ //if the dice rolls 7
                   moneyTotal = moneyTotal + 4; //add $4
                   
                   if (moneyTotal > moneyToBet && maxMoney < moneyTotal){  //if moneyTotal is more than the max, replace the value
                       maxMoney = moneyTotal;
                       maxRolls = rolls;
                   } 
               } else {
                   moneyTotal = moneyTotal - 1;
               }
              
        }
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " +  maxRolls + " when you had $"  + maxMoney);
        

        
    }
}
