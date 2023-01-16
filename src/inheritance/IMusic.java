package inheritance;

public interface IMusic {
	public void playMusic();
	public void slowDown();
	default void reverse() {
		System.out.println("play music in reverse");
	}
}
