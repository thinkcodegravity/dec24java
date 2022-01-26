package com.tutorial.group1;
public class Main {
	public int a; // anyone from anywhere can access this variable
	int b; // any programs in SAME PACKAGE can access this variable
	protected int c; // any programs in SAME PACKAGE or RELATED/INherit can access this variable	private int d;
	private int d; // NO ONE outside this program can access
	protected void testing() {
		
	}
	public Main() {
		
	}
	
}