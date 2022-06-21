package BookingCenter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketBooking {
List<Seat> listObj=new ArrayList<Seat>();
String storage="";	
int [] array=new int[3]	;
public void createFolder(String fileName) throws IOException
{
File myFile=new File(fileName);
if(myFile.mkdir())
{
	System.out.println("Folder created");
}
else
{
	System.out.println("Folder Already exists");
}
	
}

public void writeFile(String fileName,String flightDetails)throws IOException
{
try(BufferedWriter bw=new BufferedWriter(new FileWriter(fileName)))
{
bw.write(flightDetails);
bw.close();

}	
catch(IOException e)
{
System.out.println(e.getMessage());			
}
}

public void writeSeatArrangement(String fileName,int[] array,String text,int rows) throws IOException
{
	
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(fileName,true)))
	{
		bw.write(text+":"+Arrays.toString(array)+"," +rows);
	    bw.close();	
	}
	catch(IOException e)
	{
	System.out.println(e.getMessage());			
	}	
}
///home/thilak-inc1491/Development/FlightBooking/Flight-A112-Chennai-Mumbai.txt
public void  readFile(String fileName) throws FileNotFoundException, IOException
{
	try(BufferedReader br=new BufferedReader(new FileReader(fileName)))
	{
	String line="";
	while((line=br.readLine())!=null)
	{
	storage+=line+'\n';
	
	}
	}
	
	System.out.println(storage);
	int index=storage.indexOf('[');
	System.out.println(index);
	int index1=storage.indexOf(']');
	System.out.println(index1);
	int index3=storage.indexOf('E');
	String input=storage.substring(index+1,index1);
	String input1=storage.substring(index1+1,index3);
	input1=input1.replace(",", "");
	System.out.println("input1 -"+input1);
	input1=input1.trim();
System.out.println("input1"+input1.length());
	int rows=Integer.parseInt(input1);
	System.out.println("row-"+rows);
	System.out.println(input);
    //List<Integer> listObj=new ArrayList<Integer>();
    int count=0;
   
	for(int i=0;i<input.length();i++)
	{
		
		if(input.charAt(i)>='1' && input.charAt(i)<='9')
		{
			int value=Integer.parseInt(input.charAt(i)+"");
			System.out.println("get"+input.charAt(i));
	//		array[i]=Character.getNumericValue(input.charAt(i));
			array[count++]=value;
		}
		
	}
	System.out.println(Arrays.toString(array))	;
}

public void seatArrangement(int row){
	int count=0;
	int count1=65;
	
for(int i=0;i<2;i++)
{
	
for(int j=0;j<row;j++)
{
	count++;
	count1=65;
	for(int k=0;k<array[0];k++)
	{
		Seat seatObj=new Seat();
		if(k==0 )
		{
		seatObj.setClassType("Business");
		char seat=(char)count1;
		
		seatObj.setSeatType("Window");
	    System.out.println(String.valueOf(count));
	    System.out.println(String.valueOf(seat));
		seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
		count1++;
		listObj.add(seatObj);
		}
		if(k==1)
		{
			seatObj.setClassType("Business");
			char seat=(char)count1;
			
			seatObj.setSeatType("Aisle");
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			listObj.add(seatObj);
		}
		}
	
	for(int h=0;h<array[1];h++)
	{
		Seat seatObj=new Seat();
		if(h==0 || h==array[1]-1)
		{
			seatObj.setClassType("Business");
			char seat=(char)count1;
			seatObj.setSeatType("Aisile");
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			listObj.add(seatObj);
		}
		else
		{
			seatObj.setClassType("Business");
			char seat=(char)count1;
			seatObj.setSeatType("Middle");
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			listObj.add(seatObj);
		}
			
	}
	for(int s=0;s<array[2];s++)
	{
		Seat seatObj=new Seat();
		if(s==0)
		{
			seatObj.setClassType("Business");
			char seat=(char)count1;
			seatObj.setSeatType("Aisile");
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			listObj.add(seatObj);
		}
		if(s==array[2]-1)
		{
			seatObj.setClassType("Business");
			char seat=(char)count1;
			seatObj.setSeatType("Window");
			seatObj.setSeatName(String.valueOf(count)+""+String.valueOf(seat));
			count1++;
			listObj.add(seatObj);
		}
		
		
	}
	System.out.println();
}
}	
	
for(int t=0;t<listObj.size();t++)
{
System.out.println(listObj.get(t));
}
}
}


