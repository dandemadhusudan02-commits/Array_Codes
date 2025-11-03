/**
 * Program Name: ReverseArray(Recursive)
 * Description: This program reverses the elements of an integer array using recursion.
 *              The user can repeatedly input arrays, and the program will reverse
 *              each array until the user enters '0' to stop.
 * Author: Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class ReverseArrayRecursive {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Scanner for user input

        while (true) {
            // Ask user for the array size
            System.out.print("Enter the size of an Array (or type '0' to stop): ");
            int size = sc.nextInt();

            // Exit condition
            if (size == 0) {
                System.out.println("Program Ended");
                sc.close();
                break;
            }

            // Declare and initialize array
            int[] ar = new int[size];

            // Input array elements from user
            System.out.println("Enter " + size + " Elements: ");
            for (int i = 0; i < size; i++) {
                ar[i] = sc.nextInt();
            }

            // Display original array
            System.out.print("Original Array: ");
            for (int num : ar) {
                System.out.print(num + " ");
            }
            System.out.println();

            // Call recursive function to reverse the array
            reverseArray(ar, 0, size - 1);

            // Display reversed array
            System.out.print("Reversed Array: ");
            for (int rev : ar) {
                System.out.print(rev + " ");
            }
            System.out.println("\n"); // Line break for better readability
        }
    }

    /**
     * Recursive method to reverse an array.
     *
     * @param ar    The array to be reversed
     * @param left  The current left index
     * @param right The current right index
     *
     * Steps:
     * 1. Check base condition — stop recursion when left index >= right index.
     * 2. Swap elements at positions 'left' and 'right'.
     * 3. Recursively call the same method with next inner indices.
     */
    public static void reverseArray(int[] ar, int left, int right) {
        // Base condition: stop recursion when left crosses right
        if (left >= right) {
            return;
        }

        // Swap elements
        int temp = ar[left];
        ar[left] = ar[right];
        ar[right] = temp;

        // Recursive call to reverse remaining sub-array
        reverseArray(ar, left + 1, right - 1);
    }
}
