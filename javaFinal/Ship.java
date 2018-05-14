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
public class Ship {
    public String loadingPort;
    public String destinationOne;
    public String destinationTwo;
    public String destinationThree;
    public String dockingPort;
    public String name;
    public String organization;
    public int crew;
    public int guest;
    public int totalPassengers;
    public int knots;
    public double fuel;
    public double fuelRunOff;
    public double kmToDestinationOne;
    public double kmFromDestinationOneToTwo;
    public double kmFromDestinationTwotoThree;
    public double kmFromDestinationThreeToDockingPort;
    
    public int totalKmSailed = 0;
    
    public void sailShip(int totalKm){
        totalKmSailed = totalKm + totalKmSailed;
        
    } // close method
    
    public void displayTotalKmSailed(){
        System.out.println("Total kilometers sailed: " + this.totalKmSailed);
    } // close method
    
} // close class
