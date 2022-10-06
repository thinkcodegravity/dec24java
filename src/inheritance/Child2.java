package inheritance;

public class Child2 extends Parent2{
	int z=30;
	
	// in a constcutor u cannt have a call to
	// this() constructor amnd super() constrcutor at the same time
	public Child2() {
		super("john");
		System.out.println("child is born");
		System.out.println("child is walking");
		System.out.println("child is talking");
	}
}
// super.x = Need parent program's x variable
// super.add(10,20) = Need parent's program add method
// super(); = need parent's constructor