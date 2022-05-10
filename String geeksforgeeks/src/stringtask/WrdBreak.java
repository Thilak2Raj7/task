package stringtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class WrdBreak {

//	public static int wordBreak(String a,ArrayList<String> b)
//	{
//		if(a.length()==0)
//		{
//			return 1;	
//		}
//	     if(b.contains(a))
//	     {
//	    	 return 1;
//	     }
//		
//		
//		for(int i=0;i<a.length();i++)
//		{
//			String s1=a.substring(0,i);
//			String s2=a.substring(i);
//			if(b.contains(s1) && wordBreak(s2,b)==1)
//					{
//				return 1;
//					}
//		}
//		
//		
//	return 0;	
//		
//		

//	public static int wordBreak(String a, ArrayList<String> b) {
//		TreeSet<String> ts = new TreeSet<String>();
//		for (int i = 0; i < b.size(); i++) {
//			ts.add(b.get(i));
//		}
//		int length = a.length();
//		
//		ArrayList<Boolean> arr=new ArrayList<Boolean>(length+1);
//		for (int i = 0; i <length ; i++) {
//			arr.add(false);
//		}
//		arr.add(0,true);
//		for (int i = 1; i <=a.length(); i++) {
//			for (int j = 0; j < a.length(); j++) {
//				if (arr.get(j) && ts.contains(a.substring(j, i))) {
//                    arr.add(i,true);
//					break;
//				}
//			}
//		}
//
//		if (arr.get(length) == true) {
//			return 1;
//		}
//		return 0;
//	}
//
//	public static void main(String[] args) {
//		String[] b = { "i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "icecream", "man", "go",
//				"mango" };
//		ArrayList<String> d = new ArrayList<>();
//		for (int i = 0; i < b.length; i++) {
//			d.add(b[i]);
//		}
//
//		String a = "ilikesamsung";
//		int num = wordBreak(a, d);
//		System.out.println(num);
//
//	}
//}
	
	    //Function to check if two strings are isomorphic.
	    public static boolean areIsomorphic(String str1,String str2)
	    {
	       if(str1.length()!=str2.length())
	       {
	           return false;
	       }
	       String s1="";
	       String s2="";
	       Map<Character,Character> mapCharacter=new HashMap<Character,Character>();
	       String value="";
	       for(int i=0;i<str1.length();i++)
	       
	      {
	          s1=str1.substring(i);
	          s2=str2.substring(i);
	          
	          int i1=str1.indexOf(str1.charAt(i));
	          int  l1=str1.lastIndexOf(str1.charAt(i));
	          
	           int i2=str2.indexOf(str2.charAt(i));
	          int  l2=str2.lastIndexOf(str2.charAt(i));
	        
	        if(i1!=i2 || l1!=l2)
	        {
	          value="false";
	            break;
	            
	        }
	        
	       value="true";
	        
	     }
	     
	     if(value=="true")
	     {
	         return true;
	     }
	     return false;
	    }
	    public void inputGenerator()
	    {
	    	String str1="abx";
	    	String str2="xyz";
	    	System.out.println(areIsomorphic(str1,str2));
	    	
	    	
	    }
	    public static void main(String[] args)
	    {
	    	Scanner scan=new Scanner(System.in);
	    	WrdBreak obj=new WrdBreak();
	    	obj.inputGenerator();
//	    	String s1=scan.nextLine();
//	    	String s2=scan.nextLine();
//	    	System.out.println(obj.areIsomorphic(s1,s2));
	    	
	    	
	    	
	    }
	}

