package methodCall;

public class TestReferenceMethod {

	public static void main(String[] args) {
			 ReferenceMethods rm=new ReferenceMethods();
			 int a=10;
			 Person p=new Person();
			 rm.method1(a,p);
			 System.out.println(p.name);
			 System.out.println(p.age);
				
	}

}
