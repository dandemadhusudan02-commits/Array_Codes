/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: SecondLargestElement
 * Description: This program finds the second largest element in an integer array entered by the user.
 *              The program continues to execute until the user enters '0' as the array size.
 * 
 * Author: Madhusudan Dande
 */
public class SecondLargestElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        while (true) {
            // Ask the user to input array size or stop the program
            System.out.print("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();

            // Exit condition
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close the Scanner object
                break;
            }

            // Declare an integer array
            int[] ar = new int[size];

            // Take array elements from the user
            System.out.println("Enter " + size + " Elements : ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Initialize variables to hold largest and second largest values
            int largest = ar[0];
            int secondLargest = ar[0];

            // Loop to find the largest and second largest elements
            for (int i = 0; i < ar.length; i++) {
                if (largest < ar[i]) {
                    // Update both largest and second largest
                    secondLargest = largest;
                    largest = ar[i];
                } 
                // If the current element is smaller than the largest but greater than secondLargest
                else if (secondLargest < ar[i] && ar[i] != largest) {
                    secondLargest = ar[i];
                }
            }

            // Display the second largest element
            System.out.println("Second Largest Element is >> " + secondLargest);
        }
    }
}
