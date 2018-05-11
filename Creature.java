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
public class Creature {
    
    // public member variables
    public String name;
    public String species;
    //private member variable
    private int biteSizeInPercent;
    public int donutSize;
    String setMinDonutSizeInmm;
    
    // Method to stimulate eating donut
    public void eatDonut(SizedDonut donutToEat){
            System.out.println("Creature.eatDonut | Eating " + biteSizeInPercent 
                    + "% of " + donutToEat.name);
            // call the simulateEating method in the
            // passed in SizedDonut Object
            donutToEat.simulateEating(biteSizeInPercent);
    }
    
    // "getter" method for biteSizeInPercent
    public int getBiteSizeInPercent(){
        return biteSizeInPercent;   
    }
    
    // setter method for biteSizeInPercent
    public void setBiteSizeInPercent(int sizeToSet){
        if(sizeToSet > 0){
            this.biteSizeInPercent = biteSizeInPercent;
        } else {
            System.out.println("SizedDonut.setBiteSizeInPercent | "
                    + "Ooops, negative values not allowed!");
        } // close if/else
    } // close method

    public void setMinDonutSizeInmm(int donutSizeToSet){
        if(donutSizeToSet > 100){
            this.donutSize = donutSizeToSet;
            System.out.println("Delicious!");
        } else {
            System.out.println("I want something bigger!");
        } // close if/else
    } // close method
    
    public void minBiteSizeInPercent(int donutSize){
       
        
    }

} // close class
