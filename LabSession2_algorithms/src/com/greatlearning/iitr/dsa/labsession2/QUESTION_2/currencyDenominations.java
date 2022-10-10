package com.greatlearning.iitr.dsa.labsession2.QUESTION_2;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class currencyDenominations {

	
	public static void main(String argc[]){
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of currency denominations");
		int size = s.nextInt();
		Integer arr[] = new Integer[size];
		//int arr[] = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++)
				arr[i] = s.nextInt();
				
		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println("enter the amount you want to pay");
		int amount = s.nextInt();
		notesCounter(arr,amount);
		
	}

	private static void notesCounter(Integer[] arr, int amount) {
		// TODO Auto-generated method stub
		int[] noteCounter = new int[arr.length];	
		for (int i = 0; i < arr.length; i++) {
			if (amount >= arr[i]) {
				noteCounter[i] = amount / arr[i];
				amount = amount % arr[i];
			}
		}
			
		System.out.println("Your payment approach in order to give min no of notes will be");
		for (int i = 0; i <arr.length ; i++) {
			if (noteCounter[i] != 0) {
				System.out.println(arr[i] + " : "
					+ noteCounter[i]);
			}
		}
	}
		
	}

		



