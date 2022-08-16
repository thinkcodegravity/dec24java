package threads;

public class ProgramE extends Thread{
	public void run(  ) {
		System.out.println("Program E entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program E counted "+i);
			if(i==50000000000l)
				break;
		}
	}
}
