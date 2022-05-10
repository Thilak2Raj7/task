/*package String3;

public class String1 {

	   class GfG
{

	void printPattern(String s)
	{

int m=s.length()/2;
String string=s.substring(m,s.length())+s.substring(0,m);
for(int i=0;i<s.length();i++)
{
  
   String str=string.substring(0,i+1);
    System.out.print(str+"$"+" ");
}
	}
} 
	   
	   class Sol
	   {
	       public static int wordBreak(String a, ArrayList<String> b )
	       {
	        Sol obj=new Sol();
	        String[] array=new String[12];
	        String m="";
	        boolean value=obj.permutation(a,b);
	        if(value==true)
	        {
	            return 1;
	        }
	        
	       return 0;
	     
	       }
	       
	        
	        public boolean permutation(String a, ArrayList<String> b) 
	        {
	           for (int i=1;i<a.length();i++)
	           {
	                   
	               
	               if (b.contains(a.substring(0,i)) &&  permutation (a.substring(i,a.length()),b));
	               {
	                   return true;
	               }
	               
	           }
	                 return false;
	             
	           
	        } 
	           
	         }
	         

class Solution {
    String printString(String S, char ch, int count) {
        int originalCount=0;
        if(count==0)
      {
          return S;
      }
      
      
      else
      {
          int index=0;
         char [] array=S.toCharArray() ;
          for(int i=0;i<array.length;i++)
          {
              if (array[i]==ch)
              {
               
               originalCount++;  
              
          }
          
         
      
    
      if(originalCount==count)
      {
      if(S.charAt(i)==ch)
      {
       S=S.substring(i+1,S.length());
       
       if(S.equals(""))
       {
           
       return  "Empty string";
       
      }
      
      else
      {
          return S;
      }
      }
      else if (originalCount!=count)
      {
          S=S.substring(i+1,S.length());
          return S;
         
      }
      }
      }
   
      
      
      
      
    }
     S="Empty string";
          return S;
}
}


class Solution
{
String reverseWords(String S)
{
    String M="";

String[] array=S.split("[.]");

String k="";

String t="";
//Stack <String> st=new Stack <String>(); 
int n=array.length;
 int i=0;
 
	  // your code here
	while(i<n) 
	{
//   if(array[i]!=" ")
//   {

k=array[i];

//   }

for(int j=k.length()-1;j>=0;j--)
{
 M+=k.charAt(j);
}


if(i!=n-1)
{
M+=".";
}
t+=M;
M="";

i++;
}
while(S.length()!=t.length())
{
   t+=".";
}
return t;
}
 
 }
class Solution
{
    String reverseWithSpacesIntact(String S)
    {
  
    char [] array=new char[S.length()]; 
    
    int j=0;
    
    String word="";
    
     for (int a=0; a<S.length();a++)
     {
        if(S.charAt(a)==' ')
        {
        array[a]=S.charAt(a);
         }
     }
       
       for(int i=S.length()-1;i>=0;i--)
       {
           
           if(S.charAt(i)!=' ')
           {
          while(array[j]==' ')
           {
               
            j++;
           }   
           array[j]=S.charAt(i);
           j++;
           }
            
         
       }
        
        return String.valueOf(array);
        
    }
}
class Solution 
{ 
    boolean kPangram(String str, int k) 
    {
        // code here
    String newString=str.replaceAll(" ","");
       boolean[] array=new boolean[26];
       int count=0;
 
   
       if (newString.length()>=26)
       {
           for(int i=0;i<newString.length();i++)
           {
              array[newString.charAt(i)-'a']=true;
               
           }
           
           for(int j=0;j<26;j++)
           {
          
               if(array[j]==false)
               {
                   count++;
               }
               
           }
       
           if(count<=k)
           {
           return true;
           }
          
               return false;
           
         
       }
        else
        {
            return false;
        }
  
}

}      

{
    public int maxChars(String s)
    {
        int h=0;
        int count=0;
        String k="";
        int index=0;
        int last=0;
        int diff=0;
         int y=-1;
    char ch[]=s.toCharArray();
    int length=ch.length;
   
    for (int i=0;i<length;i++)
    {
      index=s.indexOf(ch[i]);
      last=s.lastIndexOf(ch[i]);
      diff=last-index-1;
    
      
        y=Math.max(y,diff);
        
        }
      
     return y;
    }
}


    public List<String> find_permutation(String S) {
        
    List<String> listObj=new ArrayList<String>();
    String obj="";
     permutation(S,obj,listObj);
     Collections.sort(listObj);
     return listObj;
    }
     
     public void permutation(String S, String obj,List listObj)
     {
         if (S.length()==0)
         {
             listObj.add(obj);
             
         }
         
         for(int i=0;i<S.length();i++)
         {
           char ch=S.charAt(i);
           String ans=S.substring(0,i)+S.substring(i+1);
           permutation(ans,obj+ch,listObj);
           }
         
         
     
     
        
    }
   
    	    public String restoreString(String s, int[] indices) {
    	    char[] array=s.toCharArray();
    	    char[] output=new char[array.length];
    	        String t="";
    	        int i=0;
    	        while(i<array.length)
    	        {
    	      int j=indices[i];
    	     output[j]=s.charAt(i);
    	            i++;
    	    }
    	        for(int u=0;u<output.length;u++)
    	        {
    	        t+=output[u];
    	        }
    	        
    	     return t;
    	    }
    	}
     
    	    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    	        
    	        String k="";
    	        
    	        String g="";
    	      for(int i=0;i<word1.length;i++)
    	  {
    		 k+=word1[i]; 
    	  }
    	       for(int i=0;i<word2.length;i++)
    		{
    			 g+=word2[i]; 	  }
    	        if(k.equals(g))
    	        {
    	            return true;
    	        }
    	        
    	            return false;
    	        
    	    }
    	}

    public List<List<String>> Anagrams(String[] string_list) {
        
        
          List<List<String>> ret=new ArrayList<>();
     
      
    
        Map<String,List<String>> mapObj=new HashMap<String,List<String>>();
       for (int j=0;j<string_list.length;j++)
        {
          String t=string_list[j];
        char [] array=t.toCharArray();
          Arrays.sort(array);

               List<String> listObj=mapObj.get(String.valueOf(array));
               
               if(listObj==null)
               {
                  listObj=new ArrayList<String>();
                  
                  mapObj.put(String.valueOf(array),listObj);
               }
              listObj.add(string_list[j]);
           }
           
       
            
           
       
       
       for(String key:mapObj.keySet())
       {
          ret.add(mapObj.get(key));
           
       }
       return ret;
    }
}
       
}
}*/
