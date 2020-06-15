package java101;

public class OperatorsInJava {
	
	/* Four types of operators in java
	 * 
	 * 1. Arithmetic Operators +,-,/,*,%
	 * 2. Bitwise Operators
	 * 3. Relational Operators
	 * 4. Logical Operators
	 * */

	public static void main(String [] args) {
		
		// Arithmetic Operations in Java
		
		int a=6, b=3;
		
		int c1 = a+b;
		int c2 = a-b;
		int c3 = a*b;
		int c4 = a/b; // note division operators only return quotient value
		
		// to get the full value of int divisions, we have to cast the result to double
		
		//this
		double c5 = a/b; 
		// or this
		double c6 = (double) a/b;
		
		
		double c7 = c6++; // this is used to increase the value of c6 by 1
	
		double c8 = c6--; // this is used to decrease the value of c6 by 
		
		
		System.out.println(c1); 
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		
		
		
		// pre & post increment/decrement
		
				int x = 5;
				int y =6;

		// In pre increment the value is first incremented before assigned
		// ++y;
		
		//In post increment the value is first assigned before incremented
		// y++;
		
		//1. pre increment
				
		// uncomment the below to make it work and comment out again  to run the post increment
				
				//	 x = ++y;
				
				// System.out.println("pre "+ x); // this would print out 7 because y is first incremented before printed

		//2. post increment
				x = y++;
				System.out.println("post "+x); // this would print out 6 because y is first assigned before incremented 
		
		
				// note the pre and post increment also applies to subtraction --
				// --y or y--
	}
}
