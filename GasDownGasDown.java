/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject;

import java.util.Scanner;

/**
 *
 * @author CameronHeiry
 */
public class GasDownGasDown {
    public static void main(String[] args){
        
        // create header
        System.out.println("***Will I make it***");
        
        //make double variable list
        double mpg;
        double gasRemaining;
        double milesRemaining;
        
        // make a new scanner
        Scanner userInputScanner = new Scanner(System.in);
        
        // Prompt user for how much gas in in the tank
        System.out.println("How much gas is left? ");
        
        // input how much gas is left in the tank
        gasRemaining = userInputScanner.nextDouble();
        
        // prompt user for how mnay miles until next gas station
        System.out.println("How many miles left until we reach the gas station? ");
        
        // input how many miles are left until gas sation
        milesRemaining = userInputScanner.nextDouble();
        
        // calculating if there is enough gas in the tank to reach the gas station
        if(gasRemaining*28>=milesRemaining){
            System.out.println("Congrats! You are going to make it to the gas station!");
            
        } else {
            System.out.println("Dang it! Looks like you need a ride!");
        } // close if/else block
                    
    } // close main
    
} // close class
