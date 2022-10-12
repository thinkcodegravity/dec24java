package inheritance;

public class TestInheritance {
// RHS can be child of LHS AND is also concrete program
	public static void main(String[] args) {
		ICar ic=new ICar();
		Nissan n=new Nissan();
		AdvancedNissan an=new AdvancedNissan();
		ICar ic2=new Nissan();
		ICar ic3=new AdvancedNissan();
	}

}
