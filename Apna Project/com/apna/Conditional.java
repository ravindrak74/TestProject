package com.apna;

import java.util.Scanner;

public class Conditional 
{

	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int button = sc.nextInt();
		
		//int a = sc.nextInt();
		//int b = sc.nextInt();
		
		if (button ==1 ) {
			System.out.println("Hello");
		}
		else if (button == 2) {
			System.out.println("Namaste");
		}
		else if (button == 3){
			System.out.println("Bonjor");
			
		}
		else {
			System.out.println("Invalid button");
		}
	}
	}
	
	

