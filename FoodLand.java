/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author cameronheiry
 */
public class FoodLand {
    
     final static int nibble = 5;
    final static int megaBite = 45;
    
    public static void main(String[] args){
        Burger firstBurger;
        firstBurger = new Burger ();
        firstBurger.name = "BigMac";
        firstBurger.vegetarian = false;
        printObjectDataBurger(firstBurger);
        System.out.println();
        
        Burger secondBurger;
        secondBurger = new Burger();
        secondBurger.name = "Veggie Burger";
        secondBurger.vegetarian = true;
        printObjectDataBurger(secondBurger);
        System.out.println();
        
        System.out.println("Eating " + firstBurger.name);
        System.out.println("Nibble...");
        firstBurger.eatBurger(nibble);
        printObjectDataBurger(firstBurger);
        System.out.println();
        
        System.out.println("Eating " + secondBurger.name);
        System.out.println("Nibble...");
        secondBurger.eatBurger(megaBite);
        printObjectDataBurger(secondBurger);
        System.out.println();
        
        Pizza firstPizza = new Pizza();
        firstPizza.name = "Meat Lover";
        firstPizza.vegetarian = false;
        printObjectDataPizza(firstPizza);
        System.out.println();
        
        Pizza secondPizza = new Pizza();
        secondPizza.name = "White Pizza";
        secondPizza.vegetarian = true;
        printObjectDataPizza(secondPizza);
        System.out.println();
        
        System.out.println("Eating " + firstPizza.name);
        System.out.println("MegaBite...");
        firstPizza.eatPizza(megaBite);
        printObjectDataPizza(firstPizza);
        System.out.println();
        
        System.out.println("Eating " + secondPizza.name);
        System.out.println("Nibble...");
        secondPizza.eatPizza(nibble);
        printObjectDataPizza(secondPizza);
        System.out.println();
        
        Donut firstDonut;
        firstDonut = new Donut();
        firstDonut.name = "Jelly Filled";
        printObjectDataDonut(firstDonut);
        System.out.println();
    
        Donut secondDonut;
        secondDonut = new Donut();
        secondDonut.name = "Chocolate";
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Gobble......");
        firstDonut.eatDonut(megaBite);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Eating " + secondDonut.name);
        System.out.println("Nibble...");
        secondDonut.eatDonut(nibble);
        printObjectDataDonut(secondDonut);
        System.out.println();
        
        System.out.println("Eating more " + firstDonut.name);
        System.out.println("MegaBite...");
        firstDonut.eatDonut(megaBite);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Just one more bite " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.eatDonut(nibble);
        printObjectDataDonut(firstDonut);
        System.out.println();
        
        System.out.println("Might as well finish " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.eatDonut(nibble);
        printObjectDataDonut(firstDonut);
        
    } // close main method
    
    private static void printObjectDataBurger(Burger inputBurger){
        System.out.println("|----------BURGER STATS----------|");
        System.out.println(" Name of Burger: " + inputBurger.name);
        System.out.println(" Percent Remaining: " + inputBurger.getPercBurgerRemaining());
        System.out.println(" Is this burger vegetarian: " + inputBurger.vegetarian);
        System.out.println("|--------------------------------|");
    } // close printObjectDataBurger method
    
    private static void printObjectDataPizza(Pizza inputPizza){
        System.out.println("|----------PIZZA STATS-----------|");
        System.out.println(" Name of Pizza: " + inputPizza.name);
        System.out.println(" Percent Remaining: " + inputPizza.getPercPizzaRemaining());
        System.out.println(" Is this pizza vegetarian: " + inputPizza.vegetarian);
        System.out.println("|--------------------------------|");
    } // close printObjectDataPizza
    
    private static void printObjectDataDonut(Donut inputDonut) {
        System.out.println("|-----------DONUT STAT-----------|");
        System.out.println(" Name of Donut: " + inputDonut.name);
        System.out.println(" Percent Remaining: " + inputDonut.getPercDonutRemaining());
        System.out.println("|--------------------------------|");
    } // close printObjectDataDonut
    
} // close class FoodLand
    

