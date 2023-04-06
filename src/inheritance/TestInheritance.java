package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		GrandParent gp=new GrandParent();
		gp.test1();
		gp.test2();
		gp.test3();
		
		Parent p=new Parent();
		p.test1();
		p.test2();
		p.test3();
		
		Child c=new Child ();
		c.test1();
		c.test2();
		c.test3();
		
	}

}
