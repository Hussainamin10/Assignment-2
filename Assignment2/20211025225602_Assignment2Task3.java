/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.task3;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Assignment2Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("Please enter your initial salary: $");
        double currentSalary = input.nextDouble();
        
        
        System.out.print("Please enter the number of years you will work: ");
        int year = input.nextInt();
        
        
        System.out.print("Your salary in " + year + " years will be: $");
        System.out.println(calcFutureSalary(currentSalary, year));
    }
    
    
    public static double calcFutureSalary(double currentSalary, int year) {
        
        
        int i;
        double salary;
        for (i = 1; i <= year; i++) {
            if (i < 3) {
                currentSalary = currentSalary * 0.03 + currentSalary;
            } else if (i >= 3 && i < 10) {
                currentSalary = currentSalary * 0.05 + currentSalary;
            } else if (i >= 10) {
                currentSalary = currentSalary * 0.08 + currentSalary;
            }
        }
        return currentSalary; 
    }
    
}
