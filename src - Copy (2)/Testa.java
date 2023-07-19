
public class Testa {
	// global scope/level... only declation and iniitzliton allowed
	int a;
	int b=10;
	
	// reassignment can only be done inside a block
	{// initialization block
		a=30;
	}
	public void method() {
		// method block
		a=20;
		b=30;
	}
	
}
