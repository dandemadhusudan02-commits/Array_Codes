/**
 * Program Name : AverageOfArray
 * Description  : This program calculates the average of elements 
 *                in a user-defined integer array. 
 *                The program continues until the user enters '0' to stop.
 *
 * Author : Madhusudan Dande
 */

package com.array.codes;

import java.util.Scanner;

public class AverageOfArray {

	public static void main(String []args) {
		
		// Create Scanner object for user input
		Scanner sc=new Scanner(System.in);
		
		// Loop runs continuously until the user types '0'
		while(true) {
			System.out.print("Enter the size of an Array (or type '0' to stop) :  ");
			int size=sc.nextInt();
			
			// If user enters 0, exit the program
			if(size==0) {
				System.out.println("Program Ended");
				sc.close();
				break;
			}
			
			// Declare array with given size
			int[] ar=new int[size];
			
			// Variable to store the sum of all elements
			int sum=0;
			
			System.out.println("Enter " +size+ " Elements : ");
			
			// Take array input and calculate sum
			for(int i=0;i<size;i++) {
				ar[i]=sc.nextInt();
				sum+=ar[i];
			}
			
			// Calculate average of array elements
			double average=sum/size;
			
			// Display the result
			System.out.println("Average of Array Elements is : " +average);
		}
	}
}
