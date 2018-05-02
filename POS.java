/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekB1_scope;

import java.util.Scanner;
        

/**
 *
 * @author cameronheiry
 */
public class POS {
    static Scanner keyboardScanner = new Scanner(System.in);

    private static double priceOfCone = 1.99;
    private static double numberOfCone;
    private static double coneTotal;

    private static double priceOfCup = 1.75;
    private static double numberOfCup;
    private static double cupTotal;

    private static double priceOfShake = 2.50;
    private static double numberOfShake;
    private static double shakeTotal;

    

    public static boolean mainLoop = true;

    public static void main(String[] args) {

        //Had to look up how to loop a menu 
        //https://stackoverflow.com/questions/34928182/how-to-make-a-java-main-menu-loop-after-using-a-case?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
        int menu;
        System.out.println("Welcome to A Scoop of Yum!");
        while (mainLoop) {

            System.out.println("Please select what items you want to purchase");
            System.out.println("1: Cone");
            System.out.println("2: Cup");
            System.out.println("3: Shake");
            System.out.println("4: CheckOut");

            menu = keyboardScanner.nextInt();

            switch (menu) {

                case 1:
                    cone();
                    break;
                case 2:
                    cup();
                    break;
                case 3:
                    shake();
                    break;
                case 4:
                    checkout();
                    break;
                
                default:
                    System.out.println("You did not enter a valid number, please select a valid number");
                    break;

            }//close switch
        }//close whileLoop        
    }//close main

    public static void cone() {
        System.out.println("How many cones would you like to purchase?");
        numberOfCone = keyboardScanner.nextInt();
        coneTotal = numberOfCone * priceOfCone;
        System.out.println(numberOfCone + " added to your shopping cart!");

    }//close cone

    public static void cup() {
        System.out.println("How many cups would you like to purchase?");
        numberOfCup = keyboardScanner.nextInt();
        cupTotal = numberOfCup * priceOfCup;
        System.out.println(numberOfCup + " added to your shopping cart!");
    }//close cup

    public static void shake() {
        System.out.println("How many shakes would you like to purchase?");
        numberOfShake = keyboardScanner.nextInt();
        shakeTotal = numberOfShake * priceOfShake;
        System.out.println(numberOfShake + " added to your shopping cart!");

    }//close shake

    //gives a list of items you have in your shopping cart
    public static void shoppingCart() {
        System.out.println("Shopping cart");
        if (numberOfCone > 0) {
            System.out.println("Number of Cones: " + numberOfCone + "Cone Price: " + coneTotal);
        }//close if
        if (numberOfCup > 0) {
            System.out.println("Number of Cups:" + numberOfCup + "Cup Price: " + cupTotal);
        }//close if
        if (numberOfShake > 0) {
            System.out.println("Number of Shakes:" + numberOfShake + "Shake Price: " + shakeTotal);
        }// close if

    }// close shopping cart

    public static void checkout() {
        System.out.println("CheckOut");    
        if (numberOfCone > 0) {
            System.out.println("Number of Cones: " + numberOfCone + "Cone Price: " + coneTotal);
        }//close if
        if (numberOfCup > 0) {
            System.out.println("Number of Cups:" + numberOfCup + "Cup Price: " + cupTotal);
        }//close if
        if (numberOfShake > 0) {
            System.out.println("Number of Shakes:" + numberOfShake + "Shake Price: " + shakeTotal);
            System.out.println("Total:" + (coneTotal + cupTotal + shakeTotal));

        }
        System.out.println("Total with tax:" + (coneTotal + cupTotal + shakeTotal) * 1.07);
        mainLoop = false;
    }//close checkout

}//close class

    
