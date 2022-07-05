package StoreFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class FileRunner {
	 public void createFile() throws IOException
	 {
		 File file=new File("Storage.txt");
			file.createNewFile();
		 
	 }
	public void writeFile() throws IOException
	{

		   FileWriter fw=new FileWriter("Storage.txt");	
			fw.write("Stored Successfully");
			fw.close();	
		
		
	}
	public void readFile() throws IOException
	{
		
		Reader reader=new FileReader("Storage.txt");
		int d=reader.read();
		while(d!=-1)
		{
		System.out.print((char) d) ;	
		d=reader.read();
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException
	{
		FileRunner obj=new FileRunner();
		obj.createFile();
		obj.writeFile();
		obj.readFile();
		
	}

}
