package methods;

public class Customer {

	public static void main(String[] args) {
		System.out.println("customer wants to file taxes");
		Accountant a=new Accountant();
/*
 1) number of input should match
 2) data type of input should match
 3) order of input should match
 
 4) output data type and return data type should match		
 */
		// pass by value
		int x=35;
		String y="jane";
		// passing letter x and y
		// passing value of x and y variable
		int result=a.add(x,20,y);
		System.out.println(result);
		
		
		a.doTaxes();//method call
		System.out.println("customer done filing taxes");
	}
/*
 	
 	Customer line 8
 */
}
