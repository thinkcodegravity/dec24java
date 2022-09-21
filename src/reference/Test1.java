package reference;

public class Test1 {
	public void method1() {
		Person p=new Person();
		method2(p); // method caller/ service consumer
					// pass input
		System.out.println(p.name);
	}
	
	// method declaration/ service provider
	// receive input
	public void method2(Person p) {
		p=new Person();
		p.name="jane";
	}
}
/*
  #abc = 	name:john
  p(method1) = #abc >>> name:john
  p(method1) = #abc >>> name:mike
  p(method2) = #abc
 
*/
