package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Notepad {
public static void main(String args[]) throws Exception
{
	// read the live text input/stream
	System.out.println("end the file content with - THE END");
	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in)); // system.in opens read stream from console
    String filecontent="";
    String line="";
    do
    {
    	if(line!="")
    		filecontent+=line+"\n";
    	line=bufferRead.readLine();
    }while(!line.equalsIgnoreCase("THE END"));
	
	// write the content into a static file
	File f=new File("D:/Tutorial/MyNotepad.txt");
	if(!f.exists())
		f.createNewFile();
	FileWriter print= new FileWriter(f); 
	print.write(filecontent);
	print.close();
}
}
