package references;

public class Facebook {

	public static void main(String[] args) {
		FBCust f1=new FBCust();	
		FBCust f2=new FBCust();	
		FBCust f3=new FBCust();	
			
		f3=f1;
		f1.age=20;
		f2=f3;
		f3.age=25;
		f2=f3;
		f3.age=f2.age;
		f1=f3;
		
	
		System.out.println(f1.age);	
		System.out.println(f2.age);	
		System.out.println(f3.age);	

	}

}
