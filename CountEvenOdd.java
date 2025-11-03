/**
 * Program Name : CountEvenOdd
 * Description  : This program counts how many even and odd numbers 
 *                are present in a user-defined integer array.
 *                The program continues until the user enters '0' to stop.
 *
 * Author : Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String []args) {

		// Create a Scanner object to take user input
		Scanner sc=new Scanner(System.in);

		// Continue running until the user types '0'
		while(true) {
			System.out.print("Enter the size of an Array (or type '0' to stop ) : ");
			int size=sc.nextInt();
			
			// If user enters 0, end the program
			if(size==0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}
			
			// Declare array of given size
			int[] ar=new int[size];
			
			// Variables to count even and odd numbers
			int even=0; 
			int odd=0;
			
			System.out.println("Enter " +size+ " Elements : ");
			
			// Take array input and count even/odd
			for(int i=0;i<size;i++) {
				ar[i]=sc.nextInt();
				
				if(ar[i]%2==0) {
					even++;
				}else {
					odd++;
				}
			}
			
			// Display the results
			System.out.println("Count of Even Numbers are : "+even);
			System.out.print("Count of Odd Numbers are : "+odd);
			
			System.out.println("\n"); // Blank line for readability
		}
	}
}
