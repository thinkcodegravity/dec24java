package accessPrivi.group1; // is-A Parent
public class Other1 {
	public void test() {
		Parent par=new Parent();
		System.out.println( par.a );
		System.out.println( par.b );
		System.out.println( par.c );
		System.out.println(par.d);
		par.add(10,2);
	}
}
