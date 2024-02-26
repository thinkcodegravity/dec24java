package java_1_8.interfac;

public class FunctionalInterfaceAndLambda {

	public static void main(String[] args) {
		FunctionInterface1 pt=new FunctionInterface1();
		Thread t1=new Thread();
		t1.start();
		
		Thread t=new Thread(
			() ->  System.out.println("printing functional Thread") 
		);
		t.start();
		
	}

}
