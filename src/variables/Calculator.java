package variables;

import restaurant.Addr;

public class Calculator {
	// class members - variable
	
	// simple or primitive data type
	int a; // numeric
	float b;// decimal
	boolean c; // yes/no
	char d; // single character
	
	// complex/object/referen data type
	String e;
	Addr f;
	
	
	// class members - method
	public int add(int num1,int num2) {
		int sum=num1+num2;
		return sum;
	}
}
