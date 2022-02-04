import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
	// order display in pizza restaurant
		LinkedList<String> customerOrder=new LinkedList<String>();
		customerOrder.add("john");
		customerOrder.add("john");
		customerOrder.add("jane");
		customerOrder.add("mike");
		customerOrder.add("andy");
		System.out.println(customerOrder);
		
		ArrayList<Car> showroom=new ArrayList<Car>();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		showroom.add(c1);
		showroom.add(c2);
		showroom.add(c3);
		//showroom.add("nissan");
		Student s=testing();
	}

	public static Student testing() {
		Student stud=new Student();
		return stud;
	}
}
