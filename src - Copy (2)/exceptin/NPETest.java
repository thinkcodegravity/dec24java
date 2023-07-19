package exceptin;

public class NPETest {
	static Person p1=new Person();
	static Person p2=new Person(); // null
	
	public static void main(String[] args) {
		System.out.println(p1.name);
		System.out.println(p2.name);
	}

}
