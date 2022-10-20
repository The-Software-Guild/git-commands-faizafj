/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.summative.assessments;

public class SummativeSums {

    public static void main(String[] args) {

        //Defining the arrays:
        int[] arrayOne = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] arrayTwo = {999, -60, -77, 14, 160, 301};
        int[] arrayThree = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        //running the method and adding in the list as an arguement.
        System.out.println("#1 Array Sum: " + summativeSumsRun(arrayOne));
        System.out.println("#2 Array Sum: " + summativeSumsRun(arrayTwo));
        System.out.println("#2 Array Sum: " + summativeSumsRun(arrayThree));
    }

    //defining the method
    public static int summativeSumsRun(int[] array) {

        int totalSum = 0; //initalising the totalSum

        for (int i = 0; i < array.length; i++) { //for i in the range between 1 and the length of the array
            totalSum += array[i]; //add the number in pos i to the total sum
        }

        return (totalSum); //return total sum.
    }
}
