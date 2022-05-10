package String3;

import java.util.Scanner;

public class Rotation {

//	public boolean rotateString(String str1,String str2)
//	{
//           if(str1.length()!=str2.length())
//	       {
//	        return false;   
//	       }
//
//            str1=str1+str1;
//          int index =str1.indexOf(str2);
//
//            if(str1.indexOf(str2)!=-1)
//            {
//            	return true;
//            }
//            	
//	        
//
//return false;
////		
//		
	
	//}
	
	
	public int palindrome(int i,int num,int count)
	{
		
		if(count==num)
		{
			return i-1;
		}
		
		if(checkPalindrome(i))
		{
			count++;
		}
		
		return palindrome(++i,num,count);
	}
	
	
	public boolean checkPalindrome(int num)
	{
		StringBuilder sb=new StringBuilder(String.valueOf(num));
		sb.reverse();
		if(num==Integer.parseInt(String.valueOf(sb)))
		{
			return true;
		}
		return false;	
}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		Rotation objRotation=new Rotation();
		//String s="Hello from here";
		//String t="erHello from he";
		int count=0;
		int i=10;
		int num=1;
		System.out.println(objRotation.palindrome(i,num,count));
	}
}
