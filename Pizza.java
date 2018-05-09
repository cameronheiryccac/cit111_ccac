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
public class Pizza {
    
    // member variables
    private int percRemaining = 100;
    public String name;
    public boolean vegetarian;
    
    // method: takes in an integer respersnting the size of bite
    // beiing taken of this donut. returns nothing
    public void eatPizza(int percentEaten){
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    } // close method
    
    // method: takes no imput parameters andn returns percRemaining
    public int getPercPizzaRemaining(){
        // very simple guts: just send back the value of one of the object's
        // member variable to the calling method. This is called a "getter"
        return percRemaining;
    } // close method
    
    public void containsMeat(){
        if (vegetarian){
            vegetarian = true;
        } else {
            vegetarian = false;
        } // close if/else
    } //close method    
    
    
} // close class
    
