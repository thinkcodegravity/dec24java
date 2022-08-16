package threads;


public class ProgramB  extends Thread {
	boolean jobDone=false;
	
	public void run() {
		System.out.println("Program B entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
			{
				System.out.println("program B counted a "+i);
				jobDone=true;
			}
			if(i==3000000000l)
				break;
		}
	}
}
