package Inheritance;
//implements = write code, program
// Nissan program will write code
// for ICar and IStereo
// Inheritance
// extends , implements
// extends = child program inherits
// 		readymade methods parent
// implements = child program inherits
// 		incomplete methods parent
// inherited 3 incomplete from ICAR
// inherited 2 incomplete from IStereo
// nissan 4 out of 5 incomplete methods
public abstract class Nissan implements ICar,IStereo{
	 
	public void takeTurn() {
		System.out.println("nissan taking turn");
	}
	public void playMusic() {
		System.out.println("playing music");
	}
	public void adjustVolumne() {
		System.out.println("adjusting volume");
	}
	public void on() {
		System.out.println("turning on");
	}
	public void off() {
		System.out.println("turning off car and music");
	}
	public void drive() {
		System.out.println("driving nissan");
	}
}
