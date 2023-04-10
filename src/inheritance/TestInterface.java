package inheritance;

public class TestInterface {

	public static void main(String[] args) {
		
		// nissan = start, drive, take turn, 
				// stop - incomplete inheritance
		// advanNiss = start, drive, take turn,stop
		Nissan n=new AdvancedNissan();
		n.start();
		n.drive();
		n.takeTurn();
		n.stop();
		n.reverse();
		
		
		// new operator can only be used on
		// concrete / complete program
		AdvancedNissan an=new AdvancedNissan();
		ICar ic=new ICar();
		// new = create
		// create car, that doesnt stop ?
		Nissan n=new Nissan();
		//LHS parent = RHS child
		// new cannot be used on incomplete
		ICar ic1=new ICar();
		
		// LHS parent = RHS child
		// new can be used on complete
		ICar ic2=new AdvancedNissan();
		Nissan n2=new AdvancedNissan();
		// interface and abstract program can be
		// initialized by using concreted child
		// on RHS
		
	}

}
