package java_1_8.interfac;

public interface InterfaceFeature {
   public void drive();
   public void start();
   public void stop();
   default void music() {
	   System.out.println("play music");
   }
   static void camera() {
	   System.out.println("rearview camera");
   }
}
