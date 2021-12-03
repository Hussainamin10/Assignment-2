/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.task1;

import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Assignment2Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
    
        
    System.out.print("Please enter a month between 1 and 12: ");
    int month = input.nextInt();
    
    
    System.out.print("Enter a full year (e.g., 2001): ");
    int year = input.nextInt(); 
    
    
    System.out.print("Number of days in that month (with version 1): ");
    System.out.println(calDays1(month,year));
    
    
    System.out.print("Number of days in that month (with version 2): ");
    System.out.println(calDays2(month,year));
}
   
    public static int calDays1(int month, int year){
        
        
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year)?29:28;
            default:
                break;
        }
    return 0;
    }
    public static int calDays2(int month, int year){
    
        
    switch (month){
        case 1: return 31; 
        case 2: return isLeapYear(year)?29:28;
        case 3: return 31;
        case 4: return 30;
        case 5: return 31;
        case 6: return 30;
        case 7: return 31;
        case 8: return 31;
        case 9: return 30;
        case 10:return 31; 
        case 11:return 30;
        case 12:return 31;
        }
        return 0;
        }
    public static boolean isLeapYear(int year){
    return (year%400==0||(year%4==0&year%100!=0));
        
    }
    
}
