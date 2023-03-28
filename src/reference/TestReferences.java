package reference;

public class TestReferences {

	public static void main(String[] args) {
		/*
		MethodControl mc=new MethodControl();
		System.out.println("enter main method");
		mc.method1();//paused
		System.out.println("exit main method");
		
		/* method stack

			
			
			
		*/
		
		
		
		
		TestMethodReference tmr=new TestMethodReference();
		Person p=new Person();
		int a=10;
		System.out.println(a); // 10
		System.out.println(p.name);// john
		// p=#123
		tmr.method1(a,p);
		//tmr.method1( #123 );
		System.out.println(a);// 10
		System.out.println(p.name); // andy
		System.out.println(p);
	}

}
