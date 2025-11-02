/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: MissingElement
 * Description: This program finds the missing number in a sequence of natural numbers.
 *              The user enters an array containing 'n-1' elements from 1 to 'n'.
 *              The program calculates and displays the missing element using
 *              the sum formula for the first 'n' natural numbers.
 *              
 * Formula used:
 *      Sum of first n natural numbers = n * (n + 1) / 2
 *      Missing Number = (Expected Sum) - (Actual Sum)
 * 
 * Author: Madhusudan Dande
 */
public class MissingElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        
        while (true) {
            // Ask user to enter array size or 0 to stop
            System.out.println("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();
            
            // Exit condition for ending the program
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release resources
                break;
            }
            
            // Declare an integer array with given size
            int[] ar = new int[size];
            
            // Take user input for array elements
            System.out.println("Enter " + size + " Elements : ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }
            
            // Ask for the total number of elements that should be in the full sequence
            System.out.println("Enter total Number of Elements >> ");
            int n = sc.nextInt();
            
            // Calculate the expected sum of first 'n' natural numbers
            int total = n * (n + 1) / 2;
            
            // Calculate the actual sum of elements provided in the array
            int sum = 0;
            for (int num : ar) {
                sum += num;
            }
            
            // Display the missing number
            System.out.println("Missing Number is >> " + (total - sum));
        }
    }
}
