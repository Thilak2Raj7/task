package stringtask;

import java.util.Arrays;

public class CrossPattern {
public static void main(String[] args)
{
	
	 String s1 = "ab";
	 String s2 = "eidbaooo";
	    
	        char[] ch=s1.toCharArray();
	        Arrays.sort(ch);
	        char[]ch1=s2.toCharArray();
	        Arrays.sort(ch1);
	        String t1="";
	        String t2="";
	      
	          for(int i=0;i<s2.length();i++)
	        {
	         t2+=ch1[i];
	        
	        }
	          for(int i=0;i<s1.length();i++)
	        {
	       t1+=ch[i];
	        
	        }
	       
	     
	          if(t2.contains(t1) )
	             {
	        	  System.out.println("true"); 
	             }   
	              
	          else
	          {
	          System.out.println("false");  
	    }
}
	}