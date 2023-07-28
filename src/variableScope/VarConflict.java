package variableScope;

public class VarConflict {
	
	int age =20;
	public void test() {
		int age=10;
		System.out.println(this.age);
		
	}
}
