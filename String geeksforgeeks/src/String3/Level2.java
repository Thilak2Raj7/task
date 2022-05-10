package String3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import javax.imageio.ImageTypeSpecifier;
import javax.print.attribute.standard.OutputDeviceAssigned;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import javax.xml.validation.Validator;

public class Level2 {

	public void numberToWords(String s) {
		String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] afterTen = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "ninteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninty" };
		String[] thousands = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String d = "";
		int z = 0;
		String storeString = "";
		StringBuilder str = new StringBuilder(s);
		String t = str.reverse().toString();
		System.out.println(s);

		int k = Integer.parseInt(t);

		for (int i = 0; i < t.length(); i++) {
			if (i == 0) {
				String ch = String.valueOf(t.charAt(i));
				int j = Integer.parseInt(ch);
				z = j;
				d += array[j];
			}
			if (i == 1) {
				String ch = String.valueOf(t.charAt(i));
				int j = Integer.parseInt(ch);
				if (j == 1) {
					int m = z;
					if (m != 0) {

						d = afterTen[m];
					}
					
				}
				else if(j>1 && z==0)
				{
					d = tens[j];
				}
				else {

					d = tens[j] + " " + array[z];
				}
				storeString = d;
			}
			if (i == 2) {

				String ch = String.valueOf(t.charAt(i));
				int j = Integer.parseInt(ch);
				if (j != 0) {
					d = thousands[j] + " " + "hundred" + " " + "and" + " " + storeString;
					storeString = d;
				}
			}
			if (i == 3) {
				String ch = String.valueOf(t.charAt(i));
				int j = Integer.parseInt(ch);
				if (j != 0) {
					d = thousands[j] + " " + "thousand" + " " + storeString + ".";
				}
			}
		}
		System.out.println(d);

	}

	public String alphabets(String s) {
		
		String mString="";
		
		String str="";
		if(s.contains("(") ||s.contains(")"))
		{	
			int index=s.lastIndexOf('(');
			int last=s.indexOf(')',index);
			int num=Integer.parseInt(String.valueOf(s.charAt(index-1)));
			String fString=s.substring(index+1,last);
			String m="";
			for(int e=0;e<num;e++)
			{
				m+=fString;
			}
			str=s.substring(0,index-1)+m+s.substring(last+1);
			
			return alphabets(str);
		}
		else 
		{
			
			String tString = "";
			
			String j ="";	
			
 		for(int i=0;i<s.length();i++)
 		{
 		    char value=s.charAt(i);
 			
 			if(Character.isDigit(value))
 			{
 				
 				j+=value;
 				int v=Integer.parseInt(j);
 			 // j=Integer.parseInt(String.valueOf(s.charAt(i)));
 			
 				String sample=String.valueOf(s.charAt(i+1));
 			 
 			 while(v>1) 
 			 {
 				tString+=sample; 
 				v--;
 			 }
 			 
 			 j="";
 			 
 			 
 			}
		
 			else 
 			{
 				 tString+=s.charAt(i);
 			}
 		}
		
		
		System.out.println("tString" + tString);
		return tString;
		}
	}
	
	public void removeFragment(String s,String t,String u)
	{
		String word="";
		String ot="";
	    String[] arr=new String[s.length()];
	         int j=0;
	         int count=0;
	         String d="";
	         int k=0;
	       for(int i=0;i<s.length();i++)
	       {
	    	
			  if (s.charAt(i)!=' ')
			  {
			d+=String.valueOf(s.charAt(j));
			
			count++;
		  }
			  
			  else {
				   if(s.charAt(i)==' ')
				   {
				  String f=d;
				   }
				
				d="";
				i=count+1;
				k=k+1;
				
			
			  }
	       }
	       
	       System.out.println(Arrays.toString(arr));
	  }
  public String  findBalancedWord(String s){
	  int sum=0;
	  int sum1=0;
	  String jString="";
	  String kString="";
	  String output="";
	  for(int i=1;i<=s.length()-2;i++)
	  {
		   jString=s.substring(0,i);
		 kString=s.substring(i+1,s.length());
		  
		  int length=jString.length();
		  int kLength=kString.length();
		  int n=0;
		  while(length>0)
		  {
			 sum+= length*(jString.charAt(i-length) -'A'+1);
			 length--;
		  }
		  
		  int k=0;
		  while(n<kLength)
		  {
			  sum1+= (n+1)*(kString.charAt(n)-'A'+1) ;
			  n++;
		  }
	 
		  if(sum1==sum)
		  {
			  
		 output= s.charAt(i)+ "balanced word" ;
		  }
	  }
	  if(output=="")
	  {
		  return "not balanced word";
	  }
	  return output;
		  
	  }
 public void permute(String s,String o,List<String> listObj)
 {
	 if(o != "" || s.length()==0)
	 {
		listObj.add(o); 
	 }
	 for(int i= 0;i < s.length();i++)
	 {
		 char ch=s.charAt(i);
		 permute(s.substring(0,i)+s.substring(i+1), o+ch, listObj);
	 }
	
 }
 
public List<String> findPermutation(String s){	
	    
		 List<String> listObj=new ArrayList<>();;
	 permute(s,"",listObj);
	
	  Collections.sort(listObj);
	  return listObj;
	}
public void digitMap(Map<Integer, String[]> mapObj,int n)
{
	int k1=0;
	int k2=0;
	int count=0;
	String[] ar1=new String[3];
	String[] ar2=new String[3];
	String[][] output=new String[3][3];
	String t=String.valueOf(n);
  for(Integer key:mapObj.keySet())	
  {
	  count++;
	  if(count==1)
	  {
	ar1=mapObj.get(key) ;
	 k1=key;
     }
	  else 
	  {
	  ar2=mapObj.get(key);
	  k2=key;
	  }
  }
	  String g=String.valueOf(k1)+String.valueOf(k2);
	  String d=String.valueOf(k2)+String.valueOf(k1);
	   if(t.equals(g))
	   {
		  
	    output=twoDimensional(output, ar1, ar2);
	   } //String outString=Arrays.toString(output);
	   else if(t.equals(d)) {
		output=twoDimensional(output, ar2, ar1);
	}
	
	   for(int i=0;i<output.length;i++)
	   {
		   int j=0;
	      while(j<ar2.length)
	      {
		   System.out.print(output[i][j]+",");
	      j++;
	   }
        }
	   }

public String[][] twoDimensional(String output[][],String[] ar1,String[] ar2)
{
	  
	   for(int i=0;i<ar1.length;i++)
	 {
		   int j=0;
		   
		   while(j<ar2.length)
		   {
			   
		output[i][j]=ar1[i]+ar2[j]+" ";
		j++;
	 }
	 }
	   return output;
}

public String validString(String s1,String s2){
  String[] array= {"z","y","x","v","u","t","s","r","q","p","o","n","m","l","k","j","i",
		  "h","g","f","e","d",
		  "c","b","a"};
 String j="";
	if(s1.length()==s2.length())
	{
		for(int i=0;i<s1.length();i++)
		{
		 j+=array[s1.charAt(i)-'a'];
		}
		if(j.equals(s2))
		{
			return "true";
		}
	    }
		else {
			return "s1 not equal To s2";
		}
	
		return "No such String";
	}

	
	
	
	

	public static void main(String[] args) {
		Level2 obj = new Level2();
		Scanner scanner = new Scanner(System.in);
		String t="";
		int number = 0;
		try {

			System.out.println("Enter the number");
			number = scanner.nextInt();
            scanner.nextLine();
		} catch (Exception e) {
			System.out.println("number should be a integer above 0 and below 20");
		}
		String input = "";
		switch (number) {

		case 1:
			String s = "1059";
            //System.out.println(obj.numberToWords(s));
			obj.numberToWords(s);
			break;

		case 2:

			input = "2aA";
			System.out.println(input);
			System.out.println(obj.alphabets(input));
			break;
		
		case 3:
			System.out.println("t");
			t=scanner.nextLine();
			System.out.println("input");
			input=scanner.nextLine();
			System.out.println("r");
			String r=scanner.nextLine();
			obj.removeFragment(input,t,r);
			break;
		case 4:
			System.out.println("s");
			
			input=scanner.nextLine();
			System.out.println(obj.findBalancedWord(input));
		case 5:
			System.out.println("Enter");
			input= "bac";
			System.out.println(obj.findPermutation(input));
		
		case 6:
			String[] array= {"a","b","c"};
			String[] secondArray= {"d","e","f"};
			Map<Integer,String[]>  mapObj=new HashMap<>();
			mapObj.put(2,array);
			mapObj.put(3,secondArray);
            int n=scanner.nextInt();
            obj.digitMap(mapObj,n);
		
		case 7:
		
		input=scanner.nextLine();
		String w=scanner.nextLine();
		System.out.println(obj.validString(input,w));
		
		}		
	}
}