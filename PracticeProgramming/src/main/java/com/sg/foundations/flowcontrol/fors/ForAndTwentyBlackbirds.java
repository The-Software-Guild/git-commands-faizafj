/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

public class ForAndTwentyBlackbirds {

    public static void main(String[] args) {
        int birdsInPie = 1;
        for (int i = 1; i < 24; i++) { 
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
    }
}

//change the incrementation to get it from 1 to 24 and the value of i to 1