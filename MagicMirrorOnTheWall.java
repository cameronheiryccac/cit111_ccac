/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author cameronheiry
 */
public class MagicMirrorOnTheWall {
    public static void main(String[] args) {
        // add scanner
        Scanner userInput = new Scanner(System.in);
        
        int bacheloretteSelection;
        
        System.out.println("What bachelorette will you pick?");
        
        // create mirros
        
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":**-1-**:    :**-2-**:    :**-3-**:");  
        System.out.println(":*******:    :*******:    :*******:");     
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":*******:    :*******:    :*******:");
        System.out.println(":*******:    :*******:    :*******:");
        
        // ask user for int type for what bachelorette
        System.out.println("Enter your door number...");
        bacheloretteSelection = userInput.nextInt();
        
        // input switch
        switch(bacheloretteSelection){
            case 1:
                printCinderella();
                break;
            
            case 2:
                printSnowWhite();
                break;
                
            case 3:
                printFiona();
                break;
                
            default: 
                System.out.println("Good Luck!");
                
        } // close switch
} // close main method
    
    // enter three methods
    
    public static void printCinderella(){
        System.out.println("Sorry, she was taken by Prince Charming!");
        System.out.println("Pick a different bachelorette, my Lord.");
    
    } // close printCinderella
    
    public static void printSnowWhite(){
        System.out.println("She is a bad apple!");
        System.out.println("The Huntsman is already on his way to save her.");
        System.out.println("Pick a different bachelorette, my Lord.");
                
    } // close printSnowWhite
    
    public static void printFiona(){
        System.out.println("She turns into something magical!");
        System.out.println("She is the only one not taken yet, hurry up and find her!");
    } // close printFiona
    
    } // close main method
