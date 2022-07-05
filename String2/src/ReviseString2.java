import java.util.List;
import java.util.ArrayList;

public class ReviseString2 {
	
	    public static boolean checkInclusion(String s1, String s2) {
	       if(s1.length() > s2.length())
	       {
	    	   return false;
	       }
	      int[] temp=new int[26];
	       int[] temp1=new int[26];
	       for(int i=0;i<s1.length();i++)
	       {
	    	   temp[s1.charAt(i)-'a']+=1;
	    	   temp1[s2.charAt(i)-'a']+=1;
	       }
	       int start=0;
	        int end=s1.length();
	       int k=1;
	    	while(end<s2.length() )  
	    	{
	    		if(check(temp,temp1))
	    		{
	    		return true;
	    		}
	    		temp1[s2.charAt(start)-'a']-=1;
	    		temp1[s2.charAt(end)-'a']+=1;
	        start++;
	        end++;
	        }
	    
	    if(check(temp,temp1))
		{
		return true;
		}
	    
	    return false;    
	        
	    }



	    public  static boolean check(int[] t1, int [] t2)
	    {
	       for(int i=0;i<26;i++)
	       {
	    	if(t1[i]!=t2[i])
	    	{
	    		return false;
	    	}
	       }
	    	
	    	return true;
	    }
	    


	public static void main(String[] args)
	{
		String  s1 = "bac";
		 String s2 = "eidbacooo";
		 System.out.println(checkInclusion(s1,s2));
		 List<String> listObj=new ArrayList<String>();
	}
}

