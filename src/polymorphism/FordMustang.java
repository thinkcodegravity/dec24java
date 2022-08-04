package polymorphism;
// public > protected > ....  > private
// if parent has protected
// child can have protected or any access on its left
public class FordMustang extends Ford{
	  public void drive() {
		System.out.println("driving faster. 100 M/HR");
		
	}
}
