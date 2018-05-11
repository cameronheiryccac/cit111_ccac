/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object2_creatures;

/**
 *
 * @author cameronheiry
 */
public class SizedDonut {
    
    // member variables
    public String name;
    public int sizeInmm;
    
    private int percRemaining = 100;
    
    public void simulateEating(int percentEaten){
        System.out.println("SizedDonut.simulatingEating | eating passed in SizedDonut");
        // subtract the percentEaten at this moment from existing
        // amount of the SizedDonut
        percRemaining = percRemaining - percentEaten;
        System.out.println("SizedDonut.simulating | Perc Rem: " + percRemaining);
    } // close method
    
    public int getPercRemaining(){
        return percRemaining;
    } // close method
         
} // close class
