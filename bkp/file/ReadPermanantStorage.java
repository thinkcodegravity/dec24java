package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ReadPermanantStorage {

	public static void main(String[] args) throws Exception {
		FileInputStream fos=new FileInputStream("d:/Tutorial/product.obj");
		ObjectInputStream os=new ObjectInputStream(fos);
		Product p=(Product)os.readObject();
		// deseralization
		/// loading a file from disk space into java memory
		System.out.println(p);
	}

}
