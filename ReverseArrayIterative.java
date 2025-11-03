/**
 * Program Name : ReverseArrayIterative
 * Package      : com.array.codes
 * Description  : This program reverses the elements of an integer array using 
 *                an iterative approach (for loop). It takes user input for array 
 *                size and elements, then displays the array in reverse order.
 *                The program continues running until the user enters '0' as the size.
 * 
 * Example:
 * Input:
 *   Enter the size of an Array (or type '0' to stop): 5
 *   Enter 5 Elements: 
 *   10 20 30 40 50
 * Output:
 *   Reverse Array is : 
 *   50 40 30 20 10
 * 
 * Author  : Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class ReverseArrayIterative {

    public static void main(String[] args) {

        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Run program repeatedly until user chooses to stop
        while (true) {
            // Ask user for size of the array
            System.out.print("Enter the size of an Array (or type '0' to stop): ");
            int size = sc.nextInt();

            // If user enters 0, stop execution
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close Scanner to prevent resource leak
                break;
            }

            // Declare and initialize array
            int[] ar = new int[size];

            // Take array elements as input
            System.out.println("Enter " + size + " Elements:");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Display array elements in reverse order
            System.out.println("Reverse Array is:");
            for (int i = ar.length - 1; i >= 0; i--) {
                System.out.print(ar[i] + " ");
            }
            System.out.println("\n"); // Blank line for readability
        }
    }
}
