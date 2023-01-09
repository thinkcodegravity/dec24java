package methods;

public class TestMethodReference {

	public static void main(String[] args) {
		MethodRef mr=new MethodRef();
		Person p=new Person();
		int x=0;
		mr.method1(p , x );//method call
		System.out.println( x );
		System.out.println( p.name );
		// same number of inputs
		// data type should match
		// order of input should match
	}

}
