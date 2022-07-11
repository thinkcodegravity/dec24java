// abstract program = incomplete program
// concrete program = complete program
// abstract = 100 %
public interface ISmartPhone {
	int a=20; // final/constant/unchangeable
	default void makeMovie() {
		System.out.println("use my phone");
	}
	public void text();
	public void call(); // abstract method
	void browseInternet();
	// 3 abstract methods
	default void appleMaps() {
		System.out.println(" geo maps");
	}
}
// program is abstract
// if it consist of atleast 1
// abstract/incomplete method

/*
	Interface = 100% incomplete product
	Abstract = partial product product
	concrete = 100% complete product
*/