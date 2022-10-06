package inheritance;

public class TestInheritnace {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println( c.x );
		System.out.println( c.a );
		System.out.println( c.p );
		int sb=c.sub(20, 5);
		int su=c.add(20, 5);
		int mu=c.mul(10, 4);
		
		
	}

}
