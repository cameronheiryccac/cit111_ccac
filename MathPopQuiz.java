/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Scanner;

/**
 * The purpose of this program is to ask the user a math question
 * with only 3 tries for the user to get the correct answer
 * while receiving feedback from the program if wrong or right
 * @author cameronheiry
 */
public class MathPopQuiz {
    // open main method
    public static void main(String[] args) {
        // program and initialize final integers
        final int Correct_Answer = 18;
        final int TotalNumOfAttempts = 3;
        
        // program and intialize int variables
        int NumOfAttempts = 1;
        int Answer;
        
        // create a new Scanner
        Scanner quizScanner = new Scanner(System.in);
        
        System.out.println("***QuizChecker***");
        
        // declare a while() loop block that will check if the NumOfAttempts is
        // less than or equal to TotalNumOfAttempts
        
        while(NumOfAttempts < 3) {
            
            // prompt user the math question needed to be solved and 
            // store it as int Answer
            System.out.println("What is the answer to (100/2) - 40 + 8? ");
            Answer = quizScanner.nextInt();
            
            // compare Answer to Correct_Answer to see if the user got the question right
            if (Answer == Correct_Answer){
                
                // if true print Good job! You're as smart as me!
                System.out.println("Good job! You're as smart as me!");
                
                break;
            } else {
            
                // Print out message if false
                System.out.println("Wrong, try again.");
                
                // if false print increase NumOfAttempt by 1
                NumOfAttempts = NumOfAttempts + 1;
                
            } // close else
            
        } // close while
        
        if (NumOfAttempts == 3){
                 System.out.println("Sorry, you are the weakest link, goodbye!" + "The correct answer is: " + Correct_Answer);
                     
        } // close second if        
    } // close main 
    
} // close class
