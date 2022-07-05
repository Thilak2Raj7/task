package StoreFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class F1{
  public  void createFile() throws IOException
  {
    File f1=new File("Str.txt");
    try {
		f1.createNewFile();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    FileWriter fw = null;
	try {
		fw = new FileWriter("Str.txt");
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    BufferedWriter bw=new BufferedWriter(fw);
    try {
		bw.write("String");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   bw.close();
    }
    
    public void readFile() throws IOException
    {
    
    FileReader fr = null;
	try {
		fr = new FileReader("Str.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    BufferedReader br=new BufferedReader(fr);
       String s1="";
          while(br.read()!=-1)
          {  
          System.out.println(s1);
          }
          br.close();
}
public static void main(String[] args)
{


F1 o1=new F1();
try {
	o1.createFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
try {
	o1.readFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

