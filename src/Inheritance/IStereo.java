package Inheritance;

public interface IStereo {
	public void playMusic();
	public void adjustVolumne();
	public void on();
	public default void off() {
		System.out.println("turning off music");
	}
}
