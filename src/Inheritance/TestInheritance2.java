package Inheritance;

public class TestInheritance2 {

	public static void main(String[] args) {
		// RHS should have implementing class
		// of the LHS interface
		Nissan n=new NissanZ();
		// nissan has 6 methods
		// nissanZ has 7 methods
		n.adjustVolumne();
		n.drive();
		n.off();
		n.on();
		n.playMusic();
		n.takeTurn();
		// typecast allows us to unlock
		// the hidden methods from RHS
		// class
		((NissanZ)n).driveFast();// hidden (locked)
	}

}
