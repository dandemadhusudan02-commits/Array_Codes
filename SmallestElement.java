/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: SmallestElement
 * Description: This program finds the smallest element in an integer array entered by the user.
 *              The program continues to take input until the user enters '0' as the array size.
 * 
 * Author: Madhusudan Dande
 */
public class SmallestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        while (true) {
            // Prompt user to enter array size or stop the program
            System.out.println("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();

            // Exit condition — if size is 0, stop the program
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release resources
                break;
            }

            // Declare array of given size
            int[] ar = new int[size];

            // Take array elements input from user
            System.out.println("Enter " + size + " Elements ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Initialize smallest with the first element
            int smallest = ar[0];

            // Compare each element to find the smallest
            for (int i = 0; i < ar.length; i++) {
                if (smallest > ar[i]) {
                    smallest = ar[i];
                }
            }

            // Display the smallest element in the array
            System.out.println("Smallest Element is >> " + smallest);
        }
    }
}
