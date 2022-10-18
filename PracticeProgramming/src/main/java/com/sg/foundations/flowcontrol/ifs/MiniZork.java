
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class MiniZork {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, walk further into the field, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { 
                
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You go to the house, and slowly open the front door");
            System.out.println("As you nervously step foot into the house, you realise there is a grand staircase");
            System.out.println("But besides it is a small (and very dusty) door with a bright green light coming from the seems");
            System.out.println("At that very moment, you hear a loud thud from somewhere near");
            System.out.println("Do you go upstairs or through the door?");
            action = userInput.nextLine();
            
            if (action.equals("go upstairs")){
                System.out.println("Trembling all the way, you arrive at the top of the stairs");
                System.out.println("You hear footsteps behind you, in front of you and all around ");
                System.out.println("Before you can react, a viscous creature, a grue, grabs you and eats you");
                System.out.println("Maybe you should have hidden...");
            }
            else if (action.equals("through the door")){
                System.out.println("Trembling, you open the door slowly and queitely, daring not to make a sound ");
                System.out.println("As you close the door, you feel a presence behind you");
                System.out.println("But as you close the door, it dissapears");
                System.out.println("Very lucky indeed...");
                System.out.println("As you walk through, you realise you are in what seems like a kitchen");
                System.out.println("Do you stay and look around, or walk back out?");
                action = userInput.nextLine();  
                
                if (action.equals ("stay and look around")){
                    System.out.println("As you walk around, you notice a couple things brewing on a stove");
                    System.out.println("The bright green light coming from a couldron bubbling away");
                    System.out.println("But before you can look for too long, you hear the noise from before");
                    System.out.println("As you try work out where it was coming from, you feel the presence of something again ");
                    System.out.println("And that is the last thing you feel, as you get eaten by a grue");
                    System.out.println("Maybe you shouldn't have stayed in one place for too long...");
                }
                else if (action.equals ("walk back out")){
                    System.out.println("Queitly, you walk back out of the door and make your way back to the front door");
                    System.out.println("As you walk back you see the shadow of a grue behind you");
                    System.out.println("You start running and are back in the field");
                    System.out.println("You walk back home, safe at last.");
                }
                
            }
            
            
        }
        
        else if (action.equals("walk further into the field")) {
            System.out.println("You walk further into the field and see your friend Wilson the Wizard");
            System.out.println("He tells you that you made a great choice to walk away, and warning you of grave danger");
            System.out.println("He asks you to follow him to safety");
            System.out.println("Do you go with him or stay where you are");
            action = userInput.nextLine();
            
            if (action.equals("go with him")){
                System.out.println("With a flick of his wand, you are both transported to his castle");
                System.out.println("Before you can say thank you, he dissapears leaving behind a small note on the floor. ");
                System.out.println("You read the note and it says to stay away from his room");
                System.out.println("But you're quite nosy, do you stay away or go to his room");
                action = userInput.nextLine();
                if (action.equals("to his room")){
                    System.out.println("You walk into this room, and see that there is a the biggest grue you have ever seen ");
                    System.out.println("He eats you before you can even run away");
                    System.out.println("Maybe you should have listened....");
                }
                else if (action.equals("stay")){
                    System.out.println("You stay as you are and moments later Wilson reappears ");
                    System.out.println("This was a test and you succseeded he says");
                    System.out.println("In a flash you realise you have been transported back home");
                    System.out.println("Safe and sound");
                }
            }
                
            else if (action.equals ("stay where you are")){
                    System.out.println("Decling his offer, he sadly disappears with a flash");
                    System.out.println("You suddenly feel you are no longer alone");
                    System.out.println("Winnie the Witch, appears out of nowhere, striking you with a spell");
                    System.out.println("You feel frozen to the spot and realise you have been turned into a grue");
                    System.out.println("You should have listened...");
                    
            }
                
            }
            
            
        }
    }
