package inheritance;

public interface IMusic {
	public void on();
	public void volume();	
	default void test() {
		System.out.println("testing music");
	}
}
