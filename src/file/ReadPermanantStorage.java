package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ReadPermanantStorage {

	public static void main(String[] args) throws Exception {
		File f=new File("c:/workspace/prod.obj");
		// Transfer info FROM a file on hard disk
		FileInputStream fos=new FileInputStream(f);
		// Transfer object info FROM above file
		ObjectInputStream os=new ObjectInputStream(fos);
		// Read java object info FROM above file
		Product p=(Product)os.readObject();
		System.out.println( p.name );
		System.out.println( p.price );
		
		// deseralization
		/// loading a file from disk space into java memory
		System.out.println(p);
	}

}
