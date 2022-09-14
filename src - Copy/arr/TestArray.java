package arr;

public class TestArray {

	public static void main(String[] args) {
		// Array holds group of identical objects or primitive data type
		
		// array initialization includes
		// declaring the underlying data type

		// declared 2 billion fb customer variables
		FaceBookCustomer[] group=new FaceBookCustomer[10];
		
		// initilization of individual fb customer variable in
		// 2 billion group
		for(int i=0;i<group.length; i++) {
			group[i]=new FaceBookCustomer();
		}
		
		for( FaceBookCustomer fb :  group ) {
			fb=new FaceBookCustomer();
		}
		
		System.out.println("traditional for loop");
		
		for(int i=0;i<group.length; i++) {
			System.out.println( group[i] );
		}
		
		System.out.println("enhanced for loop ");
		// for-each.... enhanced for loop
		for( FaceBookCustomer fb :  group ) {
			System.out.println( fb);
		}
		
	}

}
