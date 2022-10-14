package com.sg.foundations.flowcontrol.excersizes;

import java.util.Scanner;

public class Factorizer {
    
    
    public static void main(String[] args) {
        
        //init variables first
        Scanner userInput = new Scanner(System.in);
        boolean isprimeNumber = true; //used to work out what to print
        int countOfFactors = 0;
        
        //asks for user input
        System.out.println("Enter a number ");
        String userNumber = userInput.nextLine();
        int userValue = Integer.parseInt(userNumber); //uservalue turned into an int
        int isPerfect = 0;
        
        for (int i = 1; i < userValue; i++){
            
            if (userValue % i == 0){
                countOfFactors ++;
                isPerfect += i;
                System.out.println(i + " ");
            }
        }
        
        if (2 <= countOfFactors){
            System.out.println(userValue + " is not Prime Number");
        } else if (userValue == 1){
            System.out.println(userValue + " is a Prime Number");
        }else {
            System.out.println(userValue + " is a Prime Number");    
        }
        
        if (isPerfect == userValue){
            System.out.println(userValue + " is also a perfect number!");
        }         
        if (isPerfect != userValue){
            System.out.println(userValue + " is not a perfect number!");
        }

        
        System.out.println(userNumber + " has " + countOfFactors + " factors");
        
        
       
    }
}
