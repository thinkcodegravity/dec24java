package methods;

public class TestPassByValue {

	public static void main(String[] args) {
		PersonProcess pp=new PersonProcess ();
		// primitve
		int x=20;
		// reference
		Person p=new Person();
		System.out.println( p.name );
		
// if method1 makes any changes
// to p reference variable it will 
// be noticed here
// if method1 makes any changes to x
// primitive variable there will be no
// impact
		pp.method1(  p , x );
		
		System.out.println( p.name );
		
	}

}
