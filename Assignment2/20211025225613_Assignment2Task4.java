/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.task4;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Assignment2Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    
        
    System.out.print("Please enter your score: ");
    double digitScore = input.nextDouble();
    char letterScore = toLetterScore(digitScore);
    
    
    printMessage1(letterScore);
    
    
    printMessage2(letterScore);
    }
    
    
    public static char toLetterScore(double digitScore){
    
        
    if (digitScore>=90 & digitScore<=100)
    return 'A';
    else if (0 <= digitScore && digitScore <90)
    return 'B';
    else if (70 <= digitScore && digitScore <80)
    return 'C';
    else if(60 <= digitScore && digitScore <70)
    return 'D';
    else if(0 <= digitScore && digitScore <60)
    return 'F';
        return 0;
    }
    
    
    public static void printMessage1(char letterScore){
    
        
    System.out.print("Message with version 1:");
        switch (letterScore) {
            case 'A':
            case 'a':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'b':
            case 'C':
            case 'c': 
                System.out.println("Well done");
                break;
            case 'D':
            case 'd':
                System.out.println("Passed");
                break;
            case 'F':
            case 'f':
                System.out.println("Better try again");
                break;
            default:
                break;
        }
    }  
    
    
    public static void printMessage2(char letterScore){
    
        
    System.out.print("Message with version 2:");
    switch (letterScore){
        case 'A': System.out.println("Excellent");break;
        case 'B': System.out.println("Well done");break;
        case 'C': System.out.println("Well done");break;
        case 'D': System.out.println("Passed");break;
        case 'F': System.out.println("Better try again");break; 
    }
    }
    
}
