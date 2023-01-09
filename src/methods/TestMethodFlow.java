package methods;

public class TestMethodFlow {

	public static void main(String[] args) {
		System.out.println("main method start");
		MethodFlow mf=new MethodFlow();
		mf.method1();// external method call
		System.out.println("main method end");
	}

}
/*
 
 
TestMethodFLow line 8 
 
main start
method1 start
method1 end
main end

main start
method1 start
method2 start
method3 start
method4 start
method4 end
main end

main start
method1 start
method2 start
method3 start
method4 start
method4 end
method3 end
method2 end
method1 end
main end
*/