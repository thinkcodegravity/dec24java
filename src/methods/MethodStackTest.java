package methods;

public class MethodStackTest {

	public static void main(String[] args) {
		MethodStack ms=new MethodStack();
		Person p=new Person(); //Person@35f983a6 ( name = john)
		p=ms.method1(p);// p=ms.method1( 
		System.out.println( p.name );
	}

}
