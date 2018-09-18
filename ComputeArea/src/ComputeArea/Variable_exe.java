package ComputeArea;
/*
 * Ailsa
 * 9-18-18
 */

public class Variable_exe {

	public static void main(String[] args) {
		//datatype variableName;
		int  num1; 	//int declares whole numbers, +or-, can't contain a decimal, 32 bits
		double num2; //double declares fractional numbers, +or-, 64 fits
		char char1; //a single character, must be surrounded in single quotes, 8 bits
		boolean bool1; //true or false, 64 bits
		
		byte x1;// (-128 to 127) 8bits
		nextByte()
		short x2; // -32768 to 32767 16 bits
		nextShort()
		int num1;//whole number +or- (-2147483648 to 2147483647 32 bits
		nextInt()
		long x3; // (-9223372036854775808 to 9223372026854775807) 64 bits
		nextLong()
		
		//real numbers
		double num2; //64 bits -1.7976931348623157E +308 to -409e-324
		nextDouble()
		float x4; //Negative range: -3.4028235E + 38 to -1.4E - 45 32 bits
		nextFloat()
		
		String x5; //64 bits, not a data type
		next()
		nextline()
		
		
		num1 = 10;
		num2 = 3.754; 
		char1 = 'f';
		bool1 = true; 
		
		num1 = num1+num1;
		num1 = (6*5)*9*(5+4); 
		int x,y,j,k;
		x = y = j = k = 5; 
		
		int z = 50; 
		System.out.print(x=7);
		
		int count; 
		count = 1;
		
		++// increase by one; increment 
		--//decrease by one; decrement
		count++;
		count--;
		--count;
		++count;
		
		x=count++;
		System.out.print(x);
		x=++count;
		System.out.print(x);
		
		
		

	}

}
