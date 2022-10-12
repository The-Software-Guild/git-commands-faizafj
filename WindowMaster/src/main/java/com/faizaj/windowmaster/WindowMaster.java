/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.faizaj.windowmaster;

import java.util.Scanner;

/**
 *
 * @author faiza
 */
public class WindowMaster {

    public static void main(String[] args) {

        float height;
        float width;
        
        String inputHeight;
        String inputWidth;
        
        float windowArea;
        float windowPerimeter; 
        
        float glassPrice = 3.50f;
        float windowPrice = 2.25f;
        
        float cost;
        
        
    
        Scanner userInput = new Scanner (System.in);
        
        System.out.println("Enter window height ");
        inputHeight = userInput.nextLine();
        
        System.out.println("Enter window width ");   
        inputWidth = userInput.nextLine();
        
        
        height = Float.parseFloat(inputHeight);
        width = Float.parseFloat(inputWidth);

        
        //area of the window calculations:
        
        windowArea = height * width;
        windowPerimeter = 2 * (width + height);
        
        
        cost = ((glassPrice * windowArea) + (windowPrice * windowPerimeter));
        
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + windowArea);
        System.out.println("Window perimeter = " + windowPerimeter);
        System.out.println("Total cost = £" + cost);
        
        
            
        
        
        
        
        
        
        
        
                
                
        
    }
}
