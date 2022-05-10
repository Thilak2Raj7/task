package stringtask;

import java.util.ArrayList;
import java.util.Arrays;

import javax.management.monitor.StringMonitor;
public class ReverseString{

    
    
	
	   public static int longestUniqueSubsttr(String S){
	         String m="";
	         int num=0;
	         String s1="123";
	         int num1=Integer.parseInt(s1);
	         System.out.println(+num1);
	         System.out.println("substring"+S.substring(0,0));
	        int[] arr=new int[S.length()];
	        for(int i=0;i<S.length();i++)
	        {
	          if( !m.contains(String.valueOf(S.charAt(i)) ))   
	          {
	              m+=String.valueOf(S.charAt(i));
	              arr[i]=m.length();
	               num=Math.max(num,arr[i]);
	          }
	          else
	          {
	              m="";
	          }
	            
	            
	        }
	        
	        for(int i=0;i<m.length();i++)
	       {
	        
	       
	       }
	        return num;
	    }
	



    

	   
		
	       
	       
	    
	
public static void main(String []args)
{	
	
int num=longestUniqueSubsttr("abcdhcbayr");
	
}	
}