package String3;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public String findPalindrome(String s)
	{
		
		String m="";
		String word="";
		String output="";
		s=s+" ";
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)!=' ')
     {
    	 word=word+s.charAt(i);
    	 //System.out.println(word);
     }
	
    	 else
    	 {
    		 System.out.println(word);
    		boolean value=checkPalindrome(word);
    		//System.out.println(value);
    		if(!value)
    		{
    		 output+=word+" ";	
    		}
    		word="";
    		
    	 }
     }
    
    	 return output;
    	 
	
	
	
	
}
     public boolean checkPalindrome(String word)
		{
		
		int j=word.length()-1;	
			
			for(int i=0;i<j;i++)
			{
			 if( word.charAt(i)!=word.charAt(j--))
			    return false;
			 
			}
		
		return true;
}
public static void main(String[] args)
{


	String s="Nair speaks malayalam" ;
	
	Palindrome obj=new Palindrome();
	System.out.println(obj.findPalindrome(s));
	
}

}