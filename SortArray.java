/**
 * 
 */
package com.array.codes;

import java.util.Scanner;

/**
 * Program Name: SortArray
 * Description: This program takes an integer array input from the user and sorts the elements 
 *              in ascending order using a simple comparison-based sorting technique.
 *              The program continues to run until the user enters '0' as the array size.
 * 
 * Author: Madhusudan Dande
 */
public class SortArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        
        while (true) {
            // Ask the user to enter the array size or 0 to stop
            System.out.print("Enter the size of an Array (or type '0' to stop) : ");
            int size = sc.nextInt();
            
            // Exit condition for stopping the program
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close(); // Close scanner to release system resources
                break;
            }
            
            // Declare an integer array with given size
            int[] ar = new int[size];
            
            // Take array elements as input from the user
            System.out.println("Enter " + size + " Elements : ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }
            
            // Sorting logic: Simple nested loop comparison (like selection sort)
            System.out.println("Sorting the Elements of the Integer Array in Ascending Order: ");
            for (int i = 0; i < ar.length; i++) {
                for (int j = i + 1; j < ar.length; j++) {
                    // If current element is greater than next element, swap them
                    if (ar[i] > ar[j]) {
                        int temp = ar[i];
                        ar[i] = ar[j];
                        ar[j] = temp;
                    }
                }
                // Print each element after sorting
                System.out.println(ar[i] + " ");
            }
        }
    }
}
