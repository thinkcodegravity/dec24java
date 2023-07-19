package inheritance;

public class TestInheritanceEqual {
	public static void main(String areg[]) {
		Iphone3 i3=new Iphone3();
		Iphone4 i4=new Iphone4();
		i3=i4; // Iphone3=Iphone4.. parent=child
		//i5=i4; // Iphone5=Iphone4.. child=parent
		
		
		// iphone4 = call and text
		// iphone5 = call,text,browse
		Iphone4 i44=new Iphone5();
		i44.call();
		i44.text();
		//i44.browse();
		// data type .. cast/conversion
		// typecasting..
		// in next line cast/convert
		// i44 into iphone5
		//((Iphone5)i44)
		// i44 is iphone4 datatype
		// converting into iphone5
		// class cast exception
		if(i44 instanceof Iphone5)
			((Iphone5)i44).browse();
		
	}
}
