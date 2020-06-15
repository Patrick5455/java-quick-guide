package java101;

public class VariablesAndDataTypes {
	
	public static void main(String... args) {
		
		// Writing Your First Java Programs
		System.out.println("Hello World");
		
		int a = 5;
		
		// only $ and  _  are special characters allowed to start and end variable names in java course
		
		// numbers are not allowed to start variable names in java
		
		
		int $abc$ = 6; // takes 4 bytes to 32 bytes of memory
		
		int _abc_ = 45;
		
		// int is a primitive data type
		
		// range of values for int data type : -2,147,483,648 - 2,147,483,647
		
		int rangeOfIntegers = 50_000_000;
		
		System.out.println(rangeOfIntegers);
		
		
		//double is a primtive data type
		
		float fType = 5.5f; // 4 bytes
		
		double dType = 5.5; // 8 bytes 
		
		short sType = 5; // 2 bytes to 16 bits 
		
		//range of short values: -32768 to  32767
		
		byte bType = 5; // 1 byte
		
		// range of bytes -128 to 127
		
		long lDtype = 5l; // 8bytes 
		
		long lDtype2 = 5000000000l;
		
		char c = 'A';
		
		// integer values can be assigned to a character
		
		c = 100; // This would print out the ASCII value of 30 which is d;
		
		System.out.println(c); 
		
		// implicit conversion
		
		double d1 = 5; // this would get stored as 5.0 because double values can contain integer values
		
		// below is not possible
		
	//	int impossible = 5.5;
		
	// to have a decimal value in an integer variable, we have to do casting;
		
		int cast = (int) 5.5; // this is called type casting
	
		
	
		
		
		
		
		
	}

}
