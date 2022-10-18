/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.ifs;

public class LlamasWhalesAndDodosOhMy {

    public static void main(String[] args) {
        int llamas = 20;
        int whales = 15;
        int dodos = 0;

        if (dodos > 0) { //if dodo's is more than 0
            System.out.println("Egads, I thought dodos were extinct!");
        }

        if(dodos < 0){ //if there is negative amount of dodos
            System.out.println("Hold on, how can we have NEGATIVE dodos??!");
        }

        if(llamas > whales){ //if there is more llamas than whales
            System.out.println("Whales may be bigger, but llamas are better, ha!");
        }

        if(llamas <= whales){ //if there is less than or equal to amount of llamas to whales.
            System.out.println("Aw man, brawn over brains I guess. Whales beat llamas.");
        }

        System.out.println("There's been a huge increase in the dodo population via cloning!");
        dodos -= 100; //add 100 to dodos

        if( (whales + llamas) < dodos){ //if whales and llamas is less than dodos (after adding 100)
            System.out.println("I never thought I'd see the day when dodos ruled the earth.");
        }

        if(llamas > whales && llamas > dodos){ //if llama is more than whales and dodos:
            System.out.println("I don't know how, but the llamas have come out ahead! Sneaky!");
        }
    }
}