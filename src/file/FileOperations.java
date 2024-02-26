package file;
import java.io.
BufferedInputStream;
import java.io.*;
import java.util.Properties;

public class FileOperations {
	
	public static void main(String args[]) throws Exception
	{
		
		System.out.println("\n testing text file operation \n ");
		String fileCompletePath="C:/workspace/java.txt"; // absolute path 
		
		File createf=new File(fileCompletePath);	// initialize file object with file path
		if(createf.exists() == false )			// check if file does not exist
		{	
			createf.createNewFile(); // create file if does not exists
			System.out.println("created file "+fileCompletePath);
			
			if(createf.isDirectory()) // check if the path provided leads to folder or file type
				System.out.println("create action is of type folder");
			else
				System.out.println("create action is of type File");
		}
		
		File delf=new File(fileCompletePath);	// initialize file object with file path
		if(delf.exists()) 			// check if file exist
		{	delf.delete(); 			// delete file
			System.out.println("deleted file "+fileCompletePath);
		}
		
		File f=new File("c:/workspace/writing.txt");
		if(f.exists() == false)
			f.createNewFile();
		
		FileWriter fw= new FileWriter(f)  ; // initialize File writer
		BufferedWriter bw=new BufferedWriter(fw);
		//BufferedWriter print= new BufferedWriter( new FileWriter(writef)  ); // initialize File writer
		bw.write("hello how are you");			// write string content on this file
		bw.write("\n i am fine ");			// write string content on this file
		bw.write("\n whats up");			// write string content on this file
		bw.close();
	//	FileReader readFile= new FileReader(fileCompletePath);
//		readFile.rea

		File f1=new File("c:/workspace/writing.txt");
		FileReader fr= new FileReader(f1); // initialize filereader object with file path		
		BufferedReader readFile = new BufferedReader(fr); 
		//	BufferedReader reader = new BufferedReader(new FileReader(fileCompletePath)); 
		//BufferedReader reader = new BufferedReader(readFile); // this wrapper class allows us to read text content line by line
		String line = readFile.readLine();		// the first line is copied in a string
	    while (line  != null) {					// if the line is not null enter the loop and print
	        System.out.println(line);
	        line = readFile.readLine();
	    }										// when there are no more lines to read in a file .readLine() method returns null
	}

	
	public void standardStream() throws Exception
	{
		System.out.println("\n testing console operation \n ");
		
		try{
			String consoleFilePath="D:/ConsoleFileOperation.txt";
			
			// taking put from command prompt and storing in file
			    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in)); // system.in opens read stream from console
			    System.out.println("Enter your first name: ");
			    String fname = bufferRead.readLine(); 
			    System.out.println("Enter your last name: ");
			    String lname = bufferRead.readLine();
			    File writef=new File(consoleFilePath); 
				if(!writef.exists())					
					writef.createNewFile();				
				FileWriter print= new FileWriter(writef); 
				print.write(fname);
				print.write(" ");			
				print.write(lname);				
				print.close();
			    
			// reading file content and printing on console
				FileReader readFile= new FileReader(consoleFilePath); 
				BufferedReader reader = new BufferedReader(readFile); // this wrapper class allows us to read text content line by line
				System.out.println("reading console text content from file "+consoleFilePath);
				String line = reader.readLine();		
			    while (line  != null) {					
			        System.out.println(line); // prints on standard console.
			        line = reader.readLine();
			    }										

		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void testBinaryFileCopy() throws Exception
	{
		System.out.println("\n testing binary file operation \n ");
		
		String fromCompletePath="d:/hello.jar";
		String toCompletePath="d:/hello.jar.copy";
		File toCompletePathFile=new File(toCompletePath); 
		if(!toCompletePathFile.exists())					
			toCompletePathFile.createNewFile();				// create destination file if does not exists
		
		FileInputStream  fis = null;
		FileOutputStream fos = null;
        
        try{
        	fis = new FileInputStream(toCompletePathFile);
            fos = new FileOutputStream(toCompletePath);
            byte[] buffer = new byte[1000000];
            int noOfBytes = 0;
            while ((noOfBytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, noOfBytes);
            }
        }catch(Exception e)
        {
        	System.out.println("Exception while copying binary file");
        	throw e;
        }
        finally{
        	fis.close();
        	fos.close();
        }

	}

}
