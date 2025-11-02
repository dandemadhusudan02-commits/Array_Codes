/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: LargestElement
 * Description: This program finds the largest element in an integer array entered by the user.
 * The program continues to run until the user enters '0' as the array size.
 * 
 * Author: Madhusudan Dande
 */
public class LargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        
        while (true) {
            // Ask the user for array size or exit command
            System.out.print("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();
            
            // Exit condition
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close the Scanner
                break;
            }

            // Declare array
            int[] ar = new int[size];
            
            // Take array input from user
            System.out.println("Enter " + size + " Elements >> ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Initialize 'largest' with first element of array
            int largest = ar[0];

            // Find the largest element in array
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] > largest) {
                    largest = ar[i];
                }
            }

            // Display the largest element
            System.out.println("Largest Element is >> " + largest);
        }
    }
}
