package references;

public class TestRef2 {

	public static void main(String[] args) {
			
		int x=10;
		int y=30;
		Facebook fb1=new Facebook();
		Facebook fb2=new Facebook();

		x=fb1.age;
		fb2.age=fb1.age;   
		System.out.println(  fb1.age );
		fb1=fb2;
		System.out.println(  fb1.age );
	}

}
