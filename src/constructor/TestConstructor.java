package constructor;

public class TestConstructor {

	public static void main(String[] args) {
		FacebookCustomer fb1=new FacebookCustomer( "jane" );
		FacebookCustomer fb2=new FacebookCustomer( "mike" );
		
		Car car1=new Car("Ferrari"); // 1 constr with string
		Car car2=new Car("toyota","red");
		Car car3=new Car("nissan","black",2);
		Car car4=new Car();
		
		Calculator c=new Calculator();
		int sum=c.add(2, 4);
		int diff=c.sub(2, 4); // no sub method with 2 int
		c.mul(); // no mul with 0 input
		
		Product p=new Product();
	}

}
