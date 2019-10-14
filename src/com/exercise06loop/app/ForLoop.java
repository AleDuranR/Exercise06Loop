package com.exercise06loop.app;

public class ForLoop {
	public static void main(String[] args) {
		// Constant declaration
		
		// Variables declaration
		
		// Object construction
		
		// Input
		// From 1 to 100
		for(int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		// From 100 to 1
		for(int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		// Display even numbers
		System.out.println("Display EVEN numbers from 100 to 200");
		for(int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}
		System.out.println("Display odd numbers from 100 to 200");
		for(int i = 100; i <= 200; i ++) {
			if(i % 2 == 0) {
				// Breaks the loops and continue the evaluation 'S K I P'
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Display just the half od the sequence 100 to 200");
		for(int i = 100; i < 200; i ++) {
			if(i == 150) {
				// Breaks the structure of the for loop 'S T O P' 
				break;
			}
			System.out.println(i);
		}
	}
}
