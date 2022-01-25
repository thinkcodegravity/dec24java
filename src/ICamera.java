
public interface ICamera {
	public void takePicture();
	public void takeVideo();
	default void makeMovie() {
		System.out.println("use my camera");
	}
	default void creatememories() {
		System.out.println("collage");
	}
}
