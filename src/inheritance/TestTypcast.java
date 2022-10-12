package inheritance;

public class TestTypcast {

	public static void main(String[] args) {
		// auto type casting
		char a=12;
		int x=10;
		long y=x;
		
		IphoneX ix=new IphoneX();
// can access only LHS features
		ix.call();
		ix.text();
		ix.facialRecog();
		
		
		Iphone3 ipho=new IphoneX();
		ipho.call();
		ipho.text();
// typecasting - to convert
// a variable into another data type
// in order to unlock the hidden features
		((IphoneX)ipho).facialRecog();
		
	}

}
