/*package Logic;

public class String3 {
	//User function Template for Java

	class Solution {
	    int lps(String s) {
	        int i=0;
	       int n=s.length();
	       if(n%2==0)
	       {
	            i=n/2;
	       }
	       else{
	           i=n+1/2; 
	       }
	       
	      
	       int j=0;
	       while(i<n)
	       {
	         if(s.charAt(i)==s.charAt(j))
	         {
	             i=i+1;
	             j=j+1;
	         }
	         else
	         {
	             i=i+1;
	             j=j+1;
	         }
	          
	       }
	     
	      return j; 
	       
	    
	}
	}
	class Solution {
	    boolean areKAnagrams(String s1, String s2, int k) {
	        // code here
	        int j=0;
	        int count=0;
	        String v="";
	       
	        
	        if(s1.length()==s2.length())
	        {
	          for(int i=0;i<s1.length();i++)
	          {
	              int index=str2.indexOf()
	            if (!s2.contains(String.valueOf(s1.charAt(i))) || v.contains(String.valueOf(s1.charAt(i))))
	            {
	                 count++;
	               
	            }
	          else
	          {
	              v+=String.valueOf(s1.charAt(i));
	          }
	          }
	          
	          
	          count+=s2.length()-s1.length();
	          
	          
	         if(count<=k  )
	         {
	             return true;
	         }
	      
	           
	        }
	          
	        return false;
	        
	        
	    }
	}
	class Solution{
	    int longestUniqueSubsttr(String str){
	      // Result
	       int maxLength=-1;
	       String m="";
	      String store="";
	            for(char ch:str.toCharArray())
	            {
	            m=String.valueOf(ch);
	            if(store.contains(m))
	            {
	            store=store.substring(store.indexOf(m)+1);
	            }
	            
	            store+=String.valueOf(ch);
	            maxLength=Math.max(maxLength,store.length());
	            }
	            return maxLength;
	        }
	}
}*/
