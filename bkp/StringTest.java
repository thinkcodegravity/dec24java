
public class StringTest {

	public static void main(String[] args) {
		String s1="john";
		String s2="john";
		String s3=new String("john");
		s3=s3.intern();
		if(s1==s2) {
			System.out.println("s1 and s2 are same");
		}
		if(s1==s3) {
			System.out.println("s1 and s3 are same");
		}
		
	}

}
