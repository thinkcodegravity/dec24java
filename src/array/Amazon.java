package array;

public class Amazon {

	public static void main(String[] args) {
		
		
		int[] scores= {12,56,100,150,200};
		int[] scores2=new int[3];
		System.arraycopy(scores, 1, scores2, 1, 2);

		for(int i:scores2)
			System.out.println(i);
		
		
		int [] numbers=new int[5];
		//for-each / enhnaced loop
		// 0 1 2 3 4
		//for(int i=0;i<allAmzonCust.length;i++) {
		// init to 0 ; condition to loop until size-1; incr 1 index at a time
		// numbers = group of int variables
		// singleNum = single int variable in that group
		for(int singleNum:numbers) {
			System.out.println(singleNum);
		}
		for(int i=0;i<numbers.length;i++) {
			int singleNum=numbers[i];
			System.out.println(singleNum);
		}
		
		// allAmzonCust = array/group of 5 AmazonCustomer items
		AmazonCustomer[] allAmzonCust=new AmazonCustomer[5];// array size setup
		for(AmazonCustomer singleAmCust:allAmzonCust) {
			singleAmCust=new AmazonCustomer();
		}
		
		for(int i=0;i<allAmzonCust.length;i++) {
			allAmzonCust[i]=new AmazonCustomer();
		}
		
		// new [] = defining size of the array/group
		// new () = instanting individual/object... memory allocated
		System.out.println(allAmzonCust[0]); // [0] is first item in allAmzonCust array
		System.out.println(allAmzonCust[1]);
		System.out.println(allAmzonCust[2]);
		System.out.println(allAmzonCust[3]);
		System.out.println(allAmzonCust[4]);// last index always size-1
		System.out.println(allAmzonCust[5]);// index out of bound/range
		
	}	

}
