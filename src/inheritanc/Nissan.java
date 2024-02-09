package inheritanc;
// abstract - partial incomplete
// inherited - 3 incomplete methods
public abstract class Nissan implements ICar,IMusic{
// 2 completed method . 1 incomplete/ab methods	
	public void drive() {
		System.out.println("driving nissan");
	}	 
	public void music() {
		System.out.println("play song");
	}
	public void play() {
		System.out.println( "play something else");
	}
}
