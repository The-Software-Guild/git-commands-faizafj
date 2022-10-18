/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



package com.sg.foundations.flowcontrol.fors;
import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int count = 0;
        int userNumber = Integer.parseInt(userInput.nextLine());
        
        
        for (int i = 1; i < userNumber; i++){
            if (count!= userNumber){
                if  (i % 5 == 0 && i % 3 == 0){
                    System.out.println("FizzBuzz");
                    count += 1;
                } else if (i % 5 == 0){
                    System.out.println("Buzz");
                    count += 1;
                } else if (i % 3 == 0){
                    System.out.println("Fizz");
                    count += 1;
                } else{
                    System.out.println(i);
                }
            } else {
                System.out.println("TRADITION!!");
                break;
            }
        }
        
        
    }
}
