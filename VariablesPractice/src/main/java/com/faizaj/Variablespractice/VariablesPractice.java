/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.faizaj.variablespractice;

/**
 *
 * @author faiza
 */
public class VariablesPractice {

    public static void main(String[] args) {
/*        counter is defined as 7 */
        int counter = 7; 
/*        isDone is defined as false */        
        boolean isDone = false;
        
        
        
        int result = 0;
        int operand1 = 5;
        int operand2 = 7;
        int operand3 = operand2;
       
        result = 42 + 53; //adding two numbers (two individual values)
        result = operand1 + operand2; //result is now 12 (5+7)
        result = 1 + operand1;  //adding a var and a specfic value
        result = 1 + operand1 + operand2 + operand3; //adding a values
        result = 2; //setting a specific val
        result += 4; //this is the same as saying result(2) + 4 (which is 6)
        //System.out.println(result);
        result += operand1; //result and val from operand 1 (5) which now = 11
        
        result = 9 - 5; //now = 4
        result = operand1 - operand2; 
        result = 15 - operand1;
        result = 19 - operand1 - operand2 - operand3; //now == 0
        //System.out.println(result); 
        result = 2; 
        result -= 4; //result(2) - 4 = -2
        result -= operand1; //result == -7
        
        
        
        
        result = 2 * 3; //multiplication
        result = operand1 * operand2; 
        result = 2 * operand1; //result = 10
        result = 2 * operand1 * operand2 * operand3;
        
        result = 2; //reset result to two
        result *= 4;  //result (2) * 4 = 8
        result *= operand1; //result == 40 (5*8)
        
        
        result = 6 / 3; //result =2
        result = operand1 / operand2; 
        result = operand1 % operand2; //provides the remainder where result == 5
        //System.out.println(result); 
        
        
        result = 245 / operand1 / operand2 / operand3; //this = 1
        
        result = 40;
        result /= 4; //40 devided by 4 = 10
        result /= operand1; //as result was set to 10 previously,

    }
}
