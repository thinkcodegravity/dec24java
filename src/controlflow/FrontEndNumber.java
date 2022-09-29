package controlflow;

import java.util.Scanner;

public class FrontEndNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		ForNumber fn=new ForNumber();
		fn.print(num);
	}

}
