package variableScope;

public class VariableScopeTest {

	public static void main(String[] args) {
		
		Person p=new Person();
		System.out.println(  p.abc );
		System.out.println( p.age  );
		System.out.println( p.speices );
		System.out.println( p.abc );
	//	System.out.println( p.xyz );
	}

}
