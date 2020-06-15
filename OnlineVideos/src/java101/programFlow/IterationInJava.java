package java101.programFlow;

public class IterationInJava {

	public static void main(String[] args) {
		
		// Iterations are used to achieve repetition of tasks without repeating the codes
		
		// To achieve this we use either for loop (counter controlled) and while loop (sentinel loop)
		
		// we also have do-while loop and enhanced for loop
		
		/*NB: 
		* A loop must have a control. 
		* The control could be a sentinel value or a control 
		* when a loop never stops, it is known as an infinite loop
		*/
		
		//for loop
		// for loop is used to repeat a task while a condition remains true.
		// It uses the counter control
		// E.g:
		
		for(int i =1; i<=10; i++) {
			System.out.println("The For Loop statement is executed");
		}
		
		
		
		
		// while loop is used to repeat a task while the specified condition remains true
		// it uses the sentinel control
		
		// E.g:
		
		int a =5;
		while(a< 8) {
			
			System.out.println("While Loop");
			a++; // using a-- makes the loop continue infinitely 
				//because its condition never evaluates to false hence it never stops 
		}
		System.out.println("Conditon evaluated to false - Loop ended");
		
	
	
	/* do - while loop:
	* do while loop also works like loop 
	*only that it ensures at least a condition is evaluated once.
	* What this means is that even if the condition is evaluated as false from the beginning of the loop
	* at least he 'do statement' is evaluated
	*
	*/
	
	int doWhile = 16;
	
		do {		
		System.out.println("The do-while statment was evaluated @ least once");
		
		doWhile++;
	}
	while(doWhile < 10);
	
		
		
		
		/* When do you use a for loop and when do you use a while loop
		 * 
		 * You use a for loop when you know the number of times (start and end point) your condition would be evaluated
		 * But when you do not know the number of times the programs runs before the conditions is satisfied, 
		 * you use a while loop
		 * Example of when to use a while loop is when you are to collect an input from a user.
		 * You do not know when the use would return the input to evaluate the condition as a false. 
		 * Hence you use a while loop - This is what is referred to as a sentinel controlled loop.
		 * The loop is evaluated false until a required input is passed  
		 * */
		
	
		// for each loop:
		/*
		 * For each loop is best talked about after we have discussed arrays and collections
		 * */
		
	} // main braces

}



