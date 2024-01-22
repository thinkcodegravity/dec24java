package references;

public class TestReference {

	
	public static void main(String[] args) {
		int x;	
		int y=20;	
		Facebook fb1=new Facebook();	
		Facebook fb2=new Facebook();
		Facebook fb3;
		
		System.out.println(fb1.age);
		System.out.println(fb2.age);
		fb2.age=y; // fb2.age=20;
		fb1.age=fb2.age;
		System.out.println(fb1.age);
		System.out.println(fb2.age);
		
		
		
		//System.out.println(fb3.name); 
		// fb3 is not constructed/initialized and is null/nothing
		// cannot read name out of nothing
		
		//System.out.println(fb1.asd); 
		// fb1 is Facebook profile.
		//as per Facebook blueprint there is no info called asd
		
		//fb2.age=fb1.name;
		// LHS is age (int / numeric data type) 
		// RHS is name (String / characters value)
		// int age="john";
	}

}
