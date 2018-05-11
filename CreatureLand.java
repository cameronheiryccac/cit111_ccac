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
public class CreatureLand {
    public static void main(String[] args) {
        
        Creature penguin;
        penguin = new Creature();
        penguin.name = "Escobar";
        penguin.species = "Emporor Penguin";
        penguin.setBiteSizeInPercent(20);
        penguin.minBiteSizeInPercent(5);
        penguin.setMinDonutSizeInmm(50);
        
        // display penguin stats
        displayCreatureStats(penguin);
        
        // create first sized Donut
        SizedDonut donutForPenguin = new SizedDonut();
        donutForPenguin.name = "Squirrel";
        donutForPenguin.sizeInmm = 45;
        
        // create second sized Donut
        SizedDonut donutMoose = new SizedDonut();
        donutMoose.name = "Moose";
        donutMoose.sizeInmm = 125;
        
        // display Donut Stats
        displaySizedDonutStats(donutForPenguin);
        displayMooseDonutStats(donutMoose);
        
        
        penguin.eatDonut(donutForPenguin);
        penguin.eatDonut(donutMoose);
        
        
    } // close main
    
    public static void displayCreatureStats(Creature penguin){
        System.out.println("----Creature Stats---");
        System.out.println("Creature Name: " + penguin.name);
        System.out.println("Species: " + penguin.species);
        System.out.println("Bite Size: " + penguin.getBiteSizeInPercent() + "% of a SizedDonut");
        System.out.println("Min SizedDonut size: " + penguin.setMinDonutSizeInmm + "mm");
        System.out.println("------------------------");
    } // close method
    
    public static void displaySizedDonutStats(SizedDonut donutForPenguin){
        System.out.println("----SizedDonut Stats----");
        System.out.println("Name: " + donutForPenguin.name);
        System.out.println("Size: " + donutForPenguin.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutForPenguin.getPercRemaining() + "%");
        System.out.println("------------------------");
    } // close method
    
    public static void displayMooseDonutStats(SizedDonut donutMoose){
        System.out.println("----SizedDonut Stats----");
        System.out.println("Name: " + donutMoose.name);
        System.out.println("Size: " + donutMoose.sizeInmm + "mm");
        System.out.println("Percent Remaining: " + donutMoose.getPercRemaining() + "%");
        System.out.println("------------------------");
    }
    
} // close class
