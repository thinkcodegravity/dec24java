package reference;

public class TestReferences {

	public static void main(String[] args) {
		FacebookCustomer fc1=new FacebookCustomer();
		FacebookCustomer fc2=new FacebookCustomer();
		FacebookCustomer fc3=new FacebookCustomer();

		fc3.name="jane";	
		fc3.age=fc2.age;
		fc1.age=20;	
		fc2.name=fc1.name;	
		fc1.name="john";	
		fc1.age=fc2.age;	
		
		System.out.println(fc1.name);	
		System.out.println(fc1.age);	
		System.out.println(fc2.name);	
		System.out.println(fc2.age);	
		System.out.println(fc3.name);	
		System.out.println(fc3.age);	


		
	}

}
