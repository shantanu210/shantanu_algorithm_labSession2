package com.greatlearning.iitr.dsa.labsession2.service;

public class NotesCount {

	public void notesCounter(int arr[],int amount) {
		
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
