package inheritance;
/*
 * 100% complete/concrete program
 Nissan has contract with ICar program
 Nissan will implement/write code
 for all abstract/incomplete methods
 in ICar
 */
public abstract class Nissan implements ICar,IMusic{
	// inherited 5 incomplete methods 
	//	from 2 parents
	public void on() {
		System.out.println("starting car and starting music");
	}
	public void off() {
		System.out.println("stopping car");
	}
	public void drive() {
		System.out.println("driving car");
	}
	public void test() {
		System.out.println("testing something else");
	}
	// 3 complete + 2 incomplete 
	
}
