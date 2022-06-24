package Machine;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class AtmOperation {
ATM atmObj=new ATM();
public void calculateAmount(String fileName,int note1,int note2,int note3) throws IOException
{

	int count1=atmObj.getCount1();
	int count2=atmObj.getCount2();
	int count3=atmObj.getCount3();
	atmObj.setCount1(count1+note1);
	atmObj.setCount2(count2+note2);
	atmObj.setCount3(count3+note3);
	int amount1=atmObj.getAmount1();
	int amount2=atmObj.getAmount2();
	int amount3=atmObj.getAmount3();
	writeFile();
	
	}



public void createFile(String fileName) throws IOException
{

	File myFile=new File(fileName);
	myFile.createNewFile();
	System.out.println("File created");
	
}

public void writeFile() throws IOException
{
	
try(BufferedWriter bw=new BufferedWriter(new FileWriter("Atm.txt")))
	{
	 bw.write("Denomination"+"t\t"+"Number"+"\t\t"+"Value"+'\n');
	 bw.write("2000"+"\t\t"+atmObj.getCount1()+"\t\t"+atmObj.getAmount1()+'\n');
	 bw.write("500"+"\t\t"+atmObj.getCount2()+"\t\t"+atmObj.getAmount2()+'\n');
	 bw.write("100"+"\t\t"+atmObj.getCount3()+"\t\t"+atmObj.getAmount3()+'\n');
	 bw.close();	
	}
}
public void readFile() throws IOException
{
	//StringBuilder sb=new StringBuilder();
	String t="";
	
	try(BufferedReader bw=new BufferedReader(new FileReader("Atm.txt")))
	{
		 
		String line="";
		int count=0;
		while((line=bw.readLine())!=null)
		{
			t=line;
			t=t.trim();
		if(count>0)
		{
		String[] array=t.split("\t");
	     System.out.println(Arrays.toString(array));
	     if(count==1)
	     {
	     atmObj.setCount1(Integer.parseInt(array[2]));
		}
	     if(count==2)
	     {
	    	 atmObj.setCount2(Integer.parseInt(array[2]));
	     }
	     if(count==3)
	     {
	     atmObj.setCount3(Integer.parseInt(array[2]));
	     }
		}
	     count++;
	
		}
	
	
}
}
}

