package inheritanc;

public class TestInheritance {

	public static void main(String[] args) {
		Iphone3 i3=new Iphone3();
		i3.call();
		i3.camera();
		i3.text();
		
		Iphone4 i4=new Iphone4();
		i4.call();
		i4.camera();
		i4.browse();
		i4.text();
		
	}

}
