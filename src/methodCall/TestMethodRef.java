package methodCall;

public class TestMethodRef {

	public static void main(String[] args) {
		MethodRef mr=new MethodRef();
		Person p=new Person();
		mr.method1(p);
		System.out.println( p.name );
	}

}
