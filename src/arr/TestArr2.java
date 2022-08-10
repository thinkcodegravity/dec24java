package arr;

public class TestArr2 {

	public static void main(String[] args) {
		String [] names=new String[3];
		names[0]="john";
		names[1]="jane";
		names[2]="mike";
		
		String[] names2= {"john","jane","mike" };
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]); 
		 
		String [] arr1= { "john","jane","mike","andy"};
		String [] arr2= { "abc","pqr","xyz"};

		System.arraycopy(arr1, 1, arr2, 0, 2);
		
		for(String s:arr2)
			System.out.println( s);
		
	}

}
