package polymorphism;

public class PolyTest {

	public static void main(String[] args) {
		Addition a=new Addition();
// conflict in method name
// conflict is resolved during compile time
		a.add(10,20);
	}

}
