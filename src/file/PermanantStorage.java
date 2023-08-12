package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PermanantStorage {

	public static void main(String[] args) throws Exception {
		Product p=new Product();
		System.out.println( p );
		Scanner sc=new Scanner(System.in);
		System.out.println("enter prod name");
		p.name=sc.next();
		System.out.println("enter prod price");
		p.price=sc.next();
		System.out.println(p);
		
		FileOutputStream fos=new FileOutputStream("d:/Tutorial/product.obj");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(p); 
		// serialization
		/// loading a java object from java memory into disk space 
		os.close();
		
	}

}
