/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class KnockKnock {

    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();

        if(nameGuess.equals ("Marty McFly")){ //Dosnt work with == as its a string which cannot be equated.
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
    }
}

//using the wrong capitilisation means that the answer will be shown as incorrect. Can be fixed by using converting the input to a lowercase/uppercase and then comparing the input against a lowercase version. 
