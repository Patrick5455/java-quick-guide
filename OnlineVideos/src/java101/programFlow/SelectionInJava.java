package java101.programFlow;

public class SelectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// To determine the flow of programs in java, we can use selection statements
		
		// we have three types of selection statements we can use for this in java
		
		/*1. if - double selection statement
		 *2. ternary selection - triple selection statement
		 *3. switch - multiple selection statement
		 * */
		
		// if/else selection statement example
		
		int n=7;
		
		if(n%2==0) {
			System.out.println("Even");	
		}
		
		if(n%2!=0) {
			System.out.println("Odd");
		}
		
		// The above is not good enough a better way to this is below
		
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		
		// we could use else if for multiple selections in out if  else statement
		
		n = 2;
		
		if(n%2==0) {
			System.out.println("Even");
		}
		
		else if(n%2!=0) {
			
			System.out.println("Odd");
		}
		
		else {
			System.out.println("Nothing");
		}
		


	
	// Ternary Operators
	
	// Ternary operators is used to chose between two possible options (result if true or result if false )  
	// depending on the evaluation of the condition
	
	// Example
	
	/*Syntax of ternary operator
	 * 
	 *  condition ? result if true : result if false
	 * 
	 * */
	
	int a =4, b=6, c=3;
	
	int terResult = a%2==0 ? b : c;
	
	System.out.println("Ternary Result : " + terResult); 
	
	
	// Switch 
	
	// it is used to choose from more than one possible cases (options) depending on which case condition is 
	// and if no case's condition is satisfied, the default case would be selected.
	
	int condition = 1;
	
	// this is a switch block
	switch(condition) {
	
	case 1 : 
		System.out.println("Matched case One");
		break; 
		// The break statement is used to stop the flow where the condition is initially satisfied
		// If the break statement is not specified, when a particular case condition is satisfied, 
		//the cases that follows the satisfied case would also be executed, 
	case 2:
		System.out.println("Matched case Two");
		break;
	case 3:
		System.out.println("Matched case Three");
		break;
	case 4:
		System.out.println("Matched case Four");
		break;
	default:
		System.out.println("Matched no case - default case was selected");
	}
	 
	/* Note: switch statements allow only the following data types:
	 * 
	 * int
	 * char
	* strings - *this is only possible from java 1.7 and higher
	* 
	*/
	 
	}
	
}



