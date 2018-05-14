/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaFinal;

/**
 *
 * @author cameronheiry
 */
public class OasisOfJava {
    public static void main(String[] args) {
        Ship firstShip = new Ship();
        
        firstShip.name = "Oasis of Java";
        firstShip.loadingPort = "Port Canaveral";
        firstShip.destinationOne = "Bahamas";
        firstShip.destinationTwo = "St. Thomas";
        firstShip.destinationThree = "St. Martin";
        firstShip.dockingPort = "Port Canaveral";
        firstShip.crew = 2000;
        firstShip.guest = 5000;
        
        int firstShipCapacity;
        firstShipCapacity = firstShip.crew + firstShip.guest;
        
        firstShip.knots = 30;
        firstShip.fuel = 1000000;
        firstShip.fuelRunOff = 3700;
        
        double firstShipEfficiency;
        firstShipEfficiency = firstShip.fuelRunOff / firstShip.fuel;
        
        firstShip.kmToDestinationOne = 492;
        firstShip.kmFromDestinationOneToTwo = 1671;
        firstShip.kmFromDestinationTwotoThree = 197;
        firstShip.kmFromDestinationThreeToDockingPort = 1953;
        
        System.out.println("Welcome aboard everyone! This is Captain Eric speaking.");
        System.out.println("There are " + firstShipCapacity + " passengers sailing with us, including all of the "
                + "crew and myself!");
        System.out.println("You will be vacationing with us on " + firstShip.name);
        System.out.println("We will be visiting 3 different locations in this order: " + firstShip.destinationOne
                + ", " + firstShip.destinationTwo + ", " + "and " + firstShip.destinationThree);
        System.out.println("We are departing from " + firstShip.dockingPort);
        System.out.println("The " + firstShip.name + " will travel at " + firstShipEfficiency + " kms per gallon");
        System.out.println("To reach the Bahamas we must travel " + firstShip.kmToDestinationOne + " km");
        System.out.println("The amount of gallons used to get to the Bahamas will be " 
                + firstShip.kmToDestinationOne / firstShipEfficiency);
        System.out.println("The Oasis of Java must travel " + firstShip.kmFromDestinationOneToTwo + "km to St.Thomas from the Bahamas");
        System.out.println("The amount of gallons used to get from the Bahamas to St. Thomas will be " 
                + firstShip.kmFromDestinationOneToTwo / firstShipEfficiency);
        System.out.println("To reach St. Martin from St. Thomas we must travel " + firstShip.kmFromDestinationTwotoThree + " km");
        System.out.println("The amount of gallons used to get from St. Thomas to St. Martin will be " 
                + firstShip.kmFromDestinationTwotoThree / firstShipEfficiency);
        System.out.println("In order to get back to Port Canaveral we must travel " + firstShip.kmFromDestinationThreeToDockingPort
                + " km");
        System.out.println("The amount of gallons used to get back to Port Canaveral will be " 
                + firstShip.kmFromDestinationThreeToDockingPort / firstShipEfficiency);
        
        double firstShipTotalKm = firstShip.kmToDestinationOne + firstShip.kmFromDestinationOneToTwo 
                + firstShip.kmFromDestinationTwotoThree + firstShip.kmFromDestinationThreeToDockingPort;
        
        System.out.println("The total distance to be traveled on this trip will be " + firstShipTotalKm + " km");
        System.out.println("Amount of fuel will be used on trip: " + firstShipTotalKm / firstShipEfficiency);
        
        double firstShipTotalFuelUsed;
        firstShipTotalFuelUsed = firstShipTotalKm / firstShipEfficiency;
        
        System.out.println("Will the ship need refuled during the vacation?");
            if(firstShipTotalFuelUsed < 1000000){
                System.out.println("You are good to stay on the waters!");
            } else  {
                System.out.println("Uh oh! We need to fuel up while you are visiting St. Thomas!");
                
            } // close if/else 
            
               
        
        
        
    } // close main
    
} // close class
