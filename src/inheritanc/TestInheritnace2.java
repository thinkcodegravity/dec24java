package inheritanc;

public class TestInheritnace2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.occupation();
		
		Child2 c2=new Child2();
		c2.test1();
		c2.test2();
		c2.test3();
		
		GrandParent gp=new GrandParent();
		gp.test1();
		 
		
	}

}
