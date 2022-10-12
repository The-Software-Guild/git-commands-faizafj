/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;


public class SpaceRustlers {

    public static void main(String[] args) {

        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){ //If there's more aliens than spaceships then it prints the following:
            System.out.println("Vrroom, vroom! Let's get going!");
        } else{ //If there's less aliens than spaceships then it prints the following:
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){ //if there are the same amount of cows and spaceships then it prints the following:
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){ //if there are more cows than spaceships then it prints the following:
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } else { //If there are more ships than cows then it prints the following:
            System.out.println("Too many ships! Not enough cows.");
        }
        
        
        if (cows > aliens){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if (cows >= aliens){
           System.out.println("Oh no! The herds got restless and took over! Looks like we're hamburger now!!");
        }
        
    }
}