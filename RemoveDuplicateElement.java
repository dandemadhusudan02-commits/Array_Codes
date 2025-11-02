/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: RemoveDuplicateElement
 * Description: This program removes duplicate elements from an integer array entered by the user.
 *              It prints only the unique elements and continues execution until the user enters '0' as the array size.
 * 
 * Author: Madhusudan Dande
 */
public class RemoveDuplicateElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        while (true) {
            // Ask the user for array size or stop signal
            System.out.println("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();
            
            // Exit condition
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close Scanner to release system resources
                break;
            }

            // Declare an integer array
            int[] ar = new int[size];

            // Take input elements from user
            System.out.println("Enter " + size + " Elements : ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Display unique elements (remove duplicates)
            System.out.println("After Removing Duplicate Elements >> ");
            for (int i = 0; i < ar.length; i++) {
                boolean removeDuplicate = true; // Flag to check if element is unique

                // Compare current element with all others
                for (int j = i + 1; j < ar.length; j++) {
                    if (i != j && ar[i] == ar[j]) {
                        removeDuplicate = false; // Mark as duplicate
                        break;
                    }
                }

                // Print element only if it's not a duplicate
                if (removeDuplicate) {
                    System.out.println(ar[i] + " ");
                }
            }
        }
    }
}
