package exceptin;

public class Testing {

	static Person p1=new Person(); // point to address #abc
	static Person p2; // point to null/nothing
	
	public static void main(String[] args) {
		System.out.println( p1.name );
		System.out.println( p2.name );
	}

}
