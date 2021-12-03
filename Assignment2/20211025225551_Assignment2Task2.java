/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.task2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Hussain Amin
 */
public class Assignment2Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
    
        
    System.out.print("Please enter the number of score you want to generate: ");
    int num = input.nextInt();
    
    
    System.out.println("The average of the score is: " +calcAverageScore(num));
    }
    
    
    public static double calcAverageScore(int num){
    Random rand =new Random();
    int result =0;
    int numbers=0;
    
    
    System.out.print("The scores are: ");
    for(int i=0; i<num; i++){
    int a = 100;
    int random_number = rand.nextInt(a);
    
    
    System.out.print(random_number + " ");
    
    
    if (random_number>40){
            result+=random_number;
    numbers++;
    }
    }
    
    
    if(numbers==0){
    System.out.println(" ");
    double average=0;
    return average;
    }
    else {
    System.out.println(" ");
    double average = result/numbers;
    return average;
    } 
    }
    
}
