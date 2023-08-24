package file;

public class TestStatic {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.test();
		
		p1.name="john";
		Person p2=new Person();
		p2.name="jane";
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.planet);
		System.out.println(p2.planet);
		p2.name="jan";
		System.out.println("********");
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.planet);
		System.out.println(p2.planet);
		p2.planet="mars";
		System.out.println("********");
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p1.planet);
		System.out.println(p2.planet);
		
	}

}
