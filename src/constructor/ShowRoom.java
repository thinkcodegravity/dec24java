package constructor;

public class ShowRoom {

	public static void main(String[] args) {
		// Car() = constructor call
		//Car customer1=new Car();
		//Car customer3=new Car();
		Car customer1=new Car(1111);
		Car customer2=new Car(2222,"black",4);
		System.out.println(customer1.vin);
		System.out.println(customer2.vin);
		
		System.out.println(customer1.color);
		System.out.println(customer2.color);
	}

}
