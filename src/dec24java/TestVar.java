package dec24java;

public class TestVar {

	public static void main(String[] args) {
		//sasdasd=10;
		int a=10; // a:10
		int b=20; // a:10, b:20
		a=30;	// a:30, b:20
		int c=a;	// a:30, b:20, c:30
		int d=c;	// a:30, b:20, c:30 , d: 30
		d=a;		// a:30, b:20, c:30 , d: 30
		int e=b;	// a:30, b:20, c:30 , d: 30, e: 20
		b=c;		// a:30, b:30, c:30 , d: 30, e: 20
		// b=30
		int aman=10;
		System.out.println( a ) ; // 30
		System.out.println( b ) ; // 30
		System.out.println( c ) ; // 30
		System.out.println( d ) ; // 30
		System.out.println( e ) ; // 20
	}

}
