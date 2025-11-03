/**
 * Program Name : SumOfArray
 * Package      : com.array.codes
 * Description  : This program calculates the sum of all elements in an integer array.
 *                It takes user input for array size and elements using Scanner.
 *                The program continues to execute until the user enters '0' as size.
 * 
 * Example:
 * Input:
 *   Enter the size of an Array (or type '0' to stop): 5
 *   Enter 5 Elements: 
 *   10 20 30 40 50
 * Output:
 *   Sum of Elements is : 150
 * 
 * Author : Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Infinite loop allows multiple test cases until user stops
        while (true) {

            // Prompt the user to enter array size
            System.out.print("Enter the size of an Array (or type '0' to stop): ");
            int size = sc.nextInt();

            // If user enters 0, program will stop
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close();  // Close scanner to prevent resource leak
                break;
            }

            // Declare an array with given size
            int[] ar = new int[size];
            int sum = 0;  // Variable to store sum of elements

            // Accept array elements from user
            System.out.println("Enter " + size + " Elements:");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();  // Input each element
                sum += ar[i];          // Add element to sum
            }

            // Display the total sum of array elements
            System.out.println("Sum of Elements is : " + sum);
            System.out.println(); // Blank line for readability
        }
    }
}
