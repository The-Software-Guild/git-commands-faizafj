package com.sg.foundations.flowcontrol.whiles;

public class WaitAWhile {

    public static void main(String[] args) {

        int timeNow = 5; //changing this to a higher number means the loop doesnt run as its condition is not met and goes straight to the rest of the code
        int bedTime = 10;  //changing the bedtime to 11 means that the loop runs one more time (6 times

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes The loop next breaks out as the time doesn't change.
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    }
}