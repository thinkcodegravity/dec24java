package inheritanc;

public class TestInheritance3 {

	public static void main(String[] args) {
		
		ICar ic=new ICar();
		Nissan n=new Nissan();
		AdvancedNissan an=new AdvancedNissan();
// LHS (Parent) = RHS (Concrete Child)
		ICar ic2=new AdvancedNissan();
		String s="john";
		String s2=12;
		
	}

}
