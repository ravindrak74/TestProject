package com.apna;


import java.util.Scanner;

public class Main 
{
	
		
/*	public static void printJava () // function
	{
		System.out.println("Hello Java");
		
	}

	
	public static void printName(String name)
	{
		System.out.println(name);
	}
	
	public static void printSum(int x, int y)
	{
		int Sum = x + y;
		
		System.out.println(Sum);
		
	}*/

	
	public static void main(String args[]) {
	
	    Scanner scnew1 = new Scanner(System.in); 
		int a = scnew1.nextInt();
		int b = scnew1.nextInt();
		
		if (a==b) {
			System.out.println("a is equal to b");
		}
		else if (a>b) {
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("a is less than b");
		}
	
    }

}
	



		
		
	/*	Scanner scnew = new Scanner (System.in);
		int myNumber = (int)(Math.random()*100);
		int userNumber = 0;
		
		do {
			
			System.out.println("Guess my number: ");
			userNumber = scnew.nextInt();
			
			if (userNumber == myNumber){	
				System.out.println("WOOHOO......CORRECT NUMBER");
				break;
			}
			else if (userNumber > myNumber)
			{
				System.out.println("you number is too large");
				
			}
			else {
				System.out.println("you number is too small");
			}
			
		} while (userNumber >= 0);
		
		System.out.println("My number was");
		System.out.println(myNumber);
	
	
		
		
		
		
		printSum(3,4);
		
		
		printName("Aman");
		printName("Ravindra");
		
		
		
		printJava(); // calling function
		printJava();
		printJava();
		printJava();
		
		// our first program
		System.out.println("Hello Java");
		System.out.println("Hello World");
		// variables
		String name = "Aman";
		String neighbour = "Sawant";
		int age = 30;
		String friend = neighbour;
		// types
		// Primitive types - simple values
		// byte - 1[-128 to 127]
		// short - 2
		//int - 4 1,2,3,4
		//char - 2 a,b,c,d
		//long - 8
		// float -4 3.14
		// boolean - 1 true/false
		
		byte age1 = 30;
		int phone = 12334332;
		long phone2 = 121212122121L;
		float pi = 3.14F;
		char letter = '@';
		boolean isAdult = true;
		
	   // non Primitives types - complex values
		
	//	String name112 = new String("Ravindra");
	//	System.out.println(name112.length()); //non primitve types ka length function
		
		// concatenate
		
		String name1 = "Ravindra";
		String surname = "Kadam";
		String fullname = name1 + " " +surname;
		System.out.println(fullname);
		
		//charAt
		
		String name2 = "Ravindra";
		System.out.println(name2.charAt(0));
		
		//length
		String name3 = "Ravindra"; // immutable string
		System.out.println(name3.length());
		
		//replace
		
		System.out.println(name3.replace('a', 'b'));
		
		//substring
		
		String name5 = "Ravindra and Kadam";
		System.out.println(name5.substring(0,4));
		
		//Arrays
		
		int age11 = 50;
		//marks for students
		
		// boolean[] marks = new boolean[3]; // array to store 3 subjects marks
		
/*		int[] marks = new int[3]; 
	
		marks[0] = 97;
		marks[1] = 98;
		marks[2] = 95;
		
		System.out.println(marks.length);
		
		//sort
		System.out.println(marks[0]);
		Arrays.sort(marks);
		System.out.println(marks[0]);
		
		int[] marks1 = {97,98,95};
		
		int [][] finalmarks = {{97,98,95},{96,94,99}}; // 2d array
		System.out.println(finalmarks[1][1]+ finalmarks[0][1]);
		
		// casting
		
		double price = 100.00;
		double finalprice1 = price + 18; // implicit casting
		
		int p = 100;
		int fp = p + (int)99.99;   // explicit casting
		System.out.println(fp);
		
		// constants
		
		int age12 = 30;
		
		// operators Arithmetic, Assignment, logical, comparison
		
		
		*/
		// Arithmetic operators
		
/*		int a = 1;
		int b = 2;
		int c = 3;
		
		int diff = a-b;
		
		int multiply = a*b;
		
		int div = a/b;
		
		System.out.println(diff);
		System.out.println(multiply);
		System.out.println(div);
		
		
		double a1 = 5;
		double b1 = 3;
				double modulo = a1 % b1; */
	//	System.out.println(modulo);
		
//		int num = 2;
	//	System.out.println(num++); // will print original value 2 going to change afterwards- urinary operator
	//	System.out.println(num); // after change increment by 1
	//	System.out.println(++num); // already changed
		
		
	//	System.out.println(num); // 
	//	System.out.println(num--); // original value 2 - urinary operator
	//	System.out.println(num); // 1
	//	System.out.println(--num);// 1
	//	System.out.println(num); //1

				
		// Math Class
		
	//	System.out.println(Math.min(5, 6));
	//	System.out.println(Math.max(5, 6));
		
	/*	Scanner sc = new Scanner (System.in);
		System.out.println("Input your age: ");
		int age123 = sc.nextInt();
		System.out.println(age123);*/
		
		// comparison operators
		
	
/*		int age4 = 30;
		
		age4 = 31;
		age4 = 32;
		
		final float PI = 3.14F; */
		
		//float PI = 3.23;
		
		// OPERATORS
		
		
		// conditional statements

/*		boolean isSunUp = false;
		
		if (isSunUp == true)
			System.out.println("Day");
		else
			System.out.println("Night");
		
		int age123 = 12;
		if (age123 > 18)
			System.out.println("Can Vote");
		else
			System.out.println("cannot vote");
		
		// logical operators
		
		//&&
		
		int a5 = 40;
		int b5 = 30;
		
		if (a5 < 50 && b5 < 40)
			System.out.println("both less than 50");
		else 
			System.out.println("Not matching");
				
		// logical OR
		// ||
		
		if (a5 < 50 | b5 < 40)
			System.out.println("atlease one less than 50");
		else 
			System.out.println("Not matching");
		
		boolean isAdult1 = false;
		
		if (!isAdult1)
			System.out.println("Person is Adult");
		else 
			System.out.println("Not Adult");
	  
	*/	// conditional statements
		
		
		
		// pen = 10 and notebook = 40
		
	/*	Scanner sc1 = new Scanner(System.in);
		System.out.println("Input what you want to buy:");
		int cash = sc1.nextInt();
		
		if (cash < 10) 
		{
			System.out.println("cannot buy anything");
			System.out.println("get more cash");
			
				
		}
		
		else if (cash > 10 && cash < 50)
		{
			System.out.println("can get 1 thing");
			
			
		}
		
		else {
			System.out.println("can buy both");
		}
		
		*/
		// switch statements
		
		//int day = 1; // 1- Monday etc
		
	/*	Scanner sc4 = new Scanner (System.in);
		System.out.println("Input your Day:");
		int day = sc4.nextInt();
		
		switch (day) {
		
		case 1 : 
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed - Sunday");
		
		}*/
		// Loops
		
		//1-100
		
/*				for (int i1 = 1; i1<= 100; i1++) {
					System.out.println(i1);
				} 
		
		//100- 1
		
		for (int i1 = 100; i1>= 1; i1--) {
			System.out.println(i1);
		} 
		
		// while loop
		
		int j = 100;
		while (j>=1) {
			System.out.println(j);
			j = j-1;
		}
		
		// do while loop
		
		int k = 100;
		
		do 
		{
			System.out.println(k);
			k = k-1;
			
		}
		while (k>=1);
	*/	
		
/*		Scanner sc = new Scanner (System.in);
		
		int number = 0;
		do {
			System.out.println("Input your number");
			number = sc.nextInt();
			System.out.println("here is your number");
			System.out.println(number);
		} while (number >=0 );
		System.out.println("Process Ends");*/
		
		
/*		int i = 0;
		while(true) {
			
			if (i ==3) {
				i = i +1;
				continue;
			}
			
		System.out.println(i);
			i = i + 1;
			if (i > 5)
		{
			break;
		}
		}*/
		
		// exception handling
		// TRY - CATCH exception handling
		
	/*	int [] marks = {97,98,99};
		
		try {
			System.out.println(marks[5]);	
		}
		catch(Exception exception) {
			
		}
				
		System.out.println("These marks are of Aman");
		
	}*/


	
	
	


		

	

