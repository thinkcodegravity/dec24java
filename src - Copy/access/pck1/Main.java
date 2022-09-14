package access.pck1;
public class Main {
	public int a;// ANY connected program can access
	int b;		//  ANY connected program in the SAME Package... can access
	protected int c; //  ANY connected program in the same Package
						// 		PLUS ANY program that is related by inheritance ... can access
	private int d; // NO ONE has access to this variable
	private void test() {
		
	}
	protected Main() {
		
	}
}
