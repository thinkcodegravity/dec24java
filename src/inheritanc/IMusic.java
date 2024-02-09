package inheritanc;
// abstract - incomplete 100%
public interface IMusic {
	public void music() ;
	
	
	public default void play() {
		System.out.println("play music");
	}
}
