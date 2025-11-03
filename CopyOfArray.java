/**
 * Program Name : CopyOfArray
 * Description  : This program copies elements from one array (original) 
 *                to another array (copy). The user inputs the size and 
 *                elements of the array. The program displays both 
 *                the original and copied arrays. 
 *                The program continues until the user enters '0' to stop.
 *
 * Author : Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class CopyOfArray {

	public static void main(String []args) {
		
		// Create Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		// Loop to allow multiple test runs until user enters '0'
		while(true) {
			System.out.print("Enter the size of an Array (or type '0' to stop) :  ");
			int size=sc.nextInt();
			
			// If user enters 0, exit the program
			if(size==0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}
			
			// Declare two arrays: one original and one copy
			int[] original=new int[size];
			int[] copy=new int[size];
			
			// Take array input from user
			System.out.println("Enter " +size+ " Elements : ");
			for(int i=0;i<size;i++) {
				original[i]=sc.nextInt();  // Store in original array
				copy[i]=original[i];       // Copy element to another array
			}
			
			// Display original array
			System.out.println("Original Array : ");
			for(int num:original) {
				System.out.print(num+ " ");
			}
			
			System.out.println();
			
			// Display copied array
			System.out.println("Copy of an Array : ");
			for(int num:copy) {
				System.out.print(num+ " ");
			}
			
			System.out.println("\n");
		}
	}
}
