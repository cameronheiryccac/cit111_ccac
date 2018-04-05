/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8_methods2;

import java.util.Scanner;

/**
 *
 * @author cameronheiry
 */
public class SpeedConverter {
    public static void main(String[] args) {
    
    System.out.println("***Welcome to your Speed Converter***");
    
    // enter new Scanner
    Scanner scan = new Scanner(System.in);
    
    // input number of miles per hour you would like tp convert to knots
    System.out.println("Enter the number of Miles Per Hour you would like to convert to Knots: ");
    double userMph = scan.nextDouble();
    double convertKnots = mphToKnots (userMph);
    System.out.println("Your speed " + userMph + " MPH converted to knots is " + convertKnots + " knots");
    System.out.println("---------------");
    
    // input number of miles per hour you would like to convert to kmph
    System.out.println("Enter the number of Miles Per Hour you would like to convert to Kilometers Per Hour");
    userMph = scan.nextDouble();
    double convertKmh = mphToKmh (userMph);
    System.out.println("Your speed " + userMph + " MPH converted to km/h is " + convertKmh + " km/h");
    System.out.println("---------------");    
    
    // input number of mph you would like to convert to inches
    System.out.println("Enter the number of Miles per Hour you would like to convert to Inches per Hour");
    userMph = scan.nextDouble();
    double convertIncph = mphToInchph (userMph);
    System.out.println("Your speed " + userMph + "MPH converted to Inches per Hour is " + convertIncph + "Inches per Hour");
    System.out.println("---------------");
    
    } // close main
    
    // create method for conversion mph to knots
    public static double mphToKnots(double mphIn){
        double convertMph = mphIn * 0.868976;
        return convertMph;
    } // close method
    
    // create method for conversion of mph to kmh
    public static double mphToKmh(double mphIn){
        double convertMph = mphIn * 1.60934;
        return convertMph;
    } // close method
    
    // creat method for converion of mph to inches per hour
    public static double mphToInchph(double mphIn){
        double convertMph = mphIn * 63360.0;
        return convertMph;
    } // close method
    
} // close class
