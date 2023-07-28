package variableScope;

public class TestVariableScope {

	public static void main(String[] args) {
		Person p=new Person();
		//System.out.println( p.name);
		//System.out.println( p.number1);
		
		VarConflict vc=new VarConflict();
		vc.test();
	}

}
