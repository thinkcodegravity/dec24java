package accessPrivi.group2; // is-A Parent
import accessPrivi.group1.Parent;
public class Other2 {
	public void test() {
		Parent par = new Parent();
		System.out.println(par.a);
		System.out.println(par.b);
		System.out.println(par.c);
		System.out.println(par.d);
		par.add(10,2);
	}
}
