package inheritanc;

public class TestInheritnace {

	public static void main(String[] args) {
		
		Parent pare=new Parent();
		pare.method1();
		pare.methodX();
		
		
		
	// inheritance goes from parent to child
	// not child to parent...
	//	p.method2();
		Child chi=new Child();
		chi.methodX();
		chi.method1();// method1 inherited from paernt
		chi.method2();
		
		// child program can inherit 
	// global variable as well
		System.out.println( chi.b);
		System.out.println( chi.a);
		
	}

}
