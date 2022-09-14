package access.pck2;
import access.pck1.Main;
public class ChildB extends Main {
	public ChildB() {
		super();
	}
	public void methodCB() {
		System.out.println( a );
		System.out.println( b );
		System.out.println( c );
		System.out.println( d );
		test();
	}
}
