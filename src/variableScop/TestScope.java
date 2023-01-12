package variableScop;

public class TestScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		p1.name="jane";
		p2.name="andy";
		p3.name="mike";
		
		p1.planet="mars";
		p2.planet="venus";
		p3.planet="jupiter";
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);
		
		System.out.println(p1.planet);
		System.out.println(p1.planet);
		System.out.println(p1.planet);
		
	}

}
