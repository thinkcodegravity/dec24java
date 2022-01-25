// implements = Iphone taking responsibility
// to complete or implement or write code
// for everything that is missing in ISmartPhone
// abstract
// inherited total 5 incomplet/abstrct methods
public abstract class Iphone 
implements ISmartPhone,ICamera{
	public void makeMovie() {
		System.out.println("movie studio");
	}

	public void text() {
		System.out.println("sending text");
	}
	public void call() {
		System.out.println("making phone calls");
	}
// 3 abstract , 2 concrete method	
}
