package references;

public class TestReference2 {
	// global
	int abc=20;
	
	public static void main(String[] args) {
		// simple/primitive data type
		// local
		int x=20;	
		float y=12.2f;	
		boolean z=true;
		
		Person p=new Person();	
		Person q=new Person();	
		p.age=q.age;		// p.age=0;
		p.age=30;		
		q.name="jane";		
		q.name=p.name;		
		System.out.println(p.age);		
		System.out.println(q.age);		
		System.out.println(p.name);		
		System.out.println(q.name);		

		
	}
	// class or data type
	// class = complex data type
	// parameter
	public void method(Person p) {
		
	}

}
