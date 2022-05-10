package matrix;

import java.security.PublicKey;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class LookAndSay {
	
	public static String look(int n)
	{
 
  if(n==1) {
	return "1";
	 
  }
  if(n==2)
  {
	  return "11";
  }
  String str="11";
  String c= "";
  int count=1;
  
  for(int i=3;i<=n;i++)
	 {
	 str+="$";
	  char[] arr=str.toCharArray();
	   c="";
	  for(int j=1;j<str.length();j++)
	  {
		  if(arr[j]!=arr[j-1])
		  {
			  c+=count;
			  c+=arr[j-1];
			  count=1;
		  }
		  else {
			count++;
		}
		 
	  }
	  str=c;
	 }
	 return str;
	  
  }
  

			
public  static void main(String[] args)
{
	int n=4;
	System.out.print(look(5));
	}


}
