package com.apna;

import java.util.Scanner;

public class Loops {

	public static void main ( String args[]) {
		
//		Scanner sc = new Scanner(System.in);
		int n = 5;
	
		// pattern 11
		
		for (int i = 0;i<=n; i++) {
			// spaces
			for (int j =0; j<=n-i;j++) {
				System.out.print(" ");
				
			}
			// stars
			
			for (int j = 0;j <=5 ;j ++) {
				System.out.print("*");
				
			}System.out.println();
		}
		
		
		/*
		 * // pattern 10 // upper half for (int i = 0; i<=n; i++) { // 1st part for (int
		 * j = 0; j<=i; j++) { System.out.print("*"); } // spaces int spaces = 2 *
		 * (n-i); for (int j = 0; j<=spaces; j++) { System.out.print(" ");
		 * 
		 * } // 2nd Part for (int j =0; j<=i; j ++) { System.out.print("*"); }
		 * System.out.println();
		 * 
		 * }
		 * 
		 * // lower half for (int i = n; i>=1; i--) { // 1st part for (int j = 0; j<=i;
		 * j++) { System.out.print("*"); } // spaces int spaces = 2 * (n-i); for (int j
		 * = 0; j<=spaces; j++) { System.out.print(" ");
		 * 
		 * } // 2nd Part for (int j =0; j<=i; j ++) { System.out.print("*"); }
		 * System.out.println();
		 * 
		 * }
		 */
		
		// pattern 8
		
		/*
		 * int number = 0;
		 * 
		 * for (int i = 0; i<=n; i++) {
		 * 
		 * for (int j=0; j<=i; j++) { System.out.print(number + " "); number ++;
		 * 
		 * } System.out.println(); }
		 */
		
		// pattern 7
		
		/*
		 * for (int i = 1; i<n;i++) { // inner loop for (int j=1; j<=n-i+1; j++) {
		 * System.out.print(j); }System.out.println(); }
		 */
		
		// pattern 6
		/*
		 * for (int i = 0; i <=n; i ++) {
		 * 
		 * for (int j = 1; j<=i; j++) { System.out.print( j + " ");
		 * }System.out.println(); }
		 */
		
	//	int m = sc.nextInt();
		
	/*// pattern 5
	 * 
	 * for (int i = 0; i<=n; i++) { // inner loop for space print for (int
	 * j=1;j<=n-i;j++) { System.out.print(); } // inner loop for * print
	 * 
	 * for (int j = 1; j<=i; j++) { System.out.print("*"); }
	 * System.out.println("*"); }
	 */	
		
		// pattern 4
		
		/*
		 * for (int i = 1; i<=n; i ++) {
		 * 
		 * 
		 * for (int j=1;j<=m; j++) { System.out.print("*"); } System.out.println("*"); }
		 */
		
		/*
		 * for (int i=1; i<=n; i++) {
		 * 
		 * for (int j=1; j<=m; j++) {
		 * 
		 * if (i==1 || j==1||i==n || j==m) { System.out.print("*"); } else {
		 * System.out.print(" "); } } System.out.println("*");
		 * 
		 * }
		 */		
		
	//for (int i =0;i<10; i++) {
		//System.out.println("Hello World");
	//	System.out.println(i);
	//}
		
	/*int i = 0;
	
	while (i<10) {
		
		System.out.println(i);
		i ++;
	}*/
	/*
	 * int i = 0; do { System.out.println(i); i = i +1; }while (i<11);
	 */
	
	/*
	 * Scanner sc = new Scanner(System.in); int n = sc.nextInt();
	 * 
	 * for (int i = 1; i<11; i ++) { System.out.println(i*n);
	 * 
	 * }
	 */		
		/*
		 * int sum = 0; for (int i = 0; i<=n; i++) {
		 * 
		 * sum = sum + i;
		 * 
		 * }
		 * 
		 * System.out.println(sum);
		 * 
		 */	}
	
}
