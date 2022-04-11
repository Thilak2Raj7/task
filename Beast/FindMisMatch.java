package Beast;

import java.util.ArrayList;
import java.util.List;

public class FindMisMatch {

	public static void main(String[] args)
	{
		String[] arr1= {"a","b","c","d","e" ,"f","g","h", "i"};
               
	    String [] arr2= {"a","b","d","e","e","g","g","i", "i"} ;
	String temp1="";
	String temp2="";
	String f="";
	//int n=arr1.length/2;
	  for(int i=0;i<arr1.length;i++)
	{
		  if(arr1[i].equals(arr2[i])){
				if(!temp1.equals("")) {
					if(i!=arr1.length-1)
					{
					System.out.print(temp1+","+temp2+",");
					//f+=temp1+","+temp2+",";
					
					temp1="";
					temp2="";
					}
					else
					{
						//System.out.print(temp1+","+temp2+".");
						f+=temp1+","+temp2;
					}
				}
			}
			else {
				temp1=temp1+arr1[i];
				temp2=temp2+arr2[i];
			}
		
		
		
	}
	  System.out.println(f);
	}
}
