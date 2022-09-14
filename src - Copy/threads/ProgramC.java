package threads;

public class ProgramC extends Thread{
	public void run(  ) {
		System.out.println("Program C entered");
		long i=0;
		while(true) {
			i++;
			if(i%1000000000 ==0)
				System.out.println("program C counted a "+i);
			if(i==3000000000l)
				break;
		}
	}
}
