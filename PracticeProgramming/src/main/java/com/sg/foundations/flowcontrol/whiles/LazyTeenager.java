/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;
import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        Random randomizer = new Random();
        int percentageChance = 0;
        int numberOfTries = 0;
        
        
        while (numberOfTries < 7 && percentageChance <= 100) {
            System.out.println("Clean your room! x" + numberOfTries);
            numberOfTries += 1;
            percentageChance += (randomizer.nextInt(numberOfTries*10));
            
            if (percentageChance >=100){
                System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
            }
            
        }
            if (numberOfTries <= 7 && percentageChance < 100){
                System.out.println("That's it! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!! ");
            }
    }
}
