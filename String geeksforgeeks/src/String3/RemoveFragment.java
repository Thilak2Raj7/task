package String3;

import java.util.ArrayList;

public class RemoveFragment {
	
public String fragmentElements(String[] s1)
{
 String temp="";
 int count=0;
 ArrayList<String> arr=new ArrayList<String>();
 for(int i=0;i<s1[0].length();i++)
 {
	 
	 if(s1[0].charAt(i)==' ')
	 {
	 if(checkFragment(s1,temp) && count<3)
	 {
		 count++;
		 arr.add(temp);
		 temp=temp+" ";
		 
	 }
	 else
	 {
	 temp="";
	 arr.clear();
	 }
	 if(count==3)
	 {
		  
		return  arr.get(arr.size()-1);
	 }
	 
	 
 }
	 else
	 {
		 temp+=s1[0].charAt(i);
	 }
 }
 
 if(checkFragment(s1,temp) && count<3)
 {
	 count++;
	 arr.add(temp);
	 temp=temp+" ";
	 
 }
 else if(count==3)
 {
	 int s=arr.size();	 
	return  arr.get(arr.size()-1);
 }	
	
	
	
return "no consecutive words";	
}
public boolean checkFragment(String[] s1,String temp)
{
	for(int i=0;i<s1.length;i++)
	{
		if(!s1[i].contains(temp))
		{
			return false;
		}
	}
	return true;
}
//


	
	
	
	
	
	
	
	
	
//public String  fragment(String[] s1)
//{
//	String temp = "";
//	int count = 0;
//	ArrayList<String> arr = new ArrayList<String>();
//	int i = 0;
//	
//	for (i = 0; i < s1[0].length(); i++) {
//		if (s1[0].charAt(i) == ' ') {
//			if (fragmentChecker(s1, temp) && count < 3) {
//				count++;
//				arr.add(temp);
//				temp = temp + " ";
//			} else {
//				if (count == 3) {
//					return arr.get(arr.size() - 1);
//				}
//
//				arr.clear();
//
//				count = 0;
//				temp = "";
//			}
//
//		} else {
//			temp += s1[0].charAt(i);
//		}
//	}
////	if (i == s1[0].length()) {
////		if (fragmentChecker(s1, temp) && count < 3) {
////			count++;
////			arr.add(temp);
////
////		}
////	}
////	if (count == 3) {
////		return arr.get(arr.size() - 1);
////	}
//	return "no consecutive same words";
//}

public  boolean fragmentChecker(String[] s1, String temp) {
	 boolean bool[] = new boolean[s1.length];
	for (int i = 0; i < s1.length; i++) {
		if (!s1[i].contains(temp)) {
			return false;
		}

	}
	return true;
	
	}
	
	public static void main(String[] args)
	{
		String s1[]={"Every morning I want to do exercise regularly","Every morning I want to do meditation without fail","It is important that I want to be happy always"};
	    String	s2="Every morning I want to do meditation without fail";
		String s3="It is important that I want to be happy always";
		
		RemoveFragment rmv=new RemoveFragment();
		try {
			String result=rmv.fragmentElements(s1);
			System.out.println(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		for(int i=0;i<s1.length();i++) {
//			String temp1=s1.substring(0, s1.length()-i);
//			String temp2=s1.substring(s1.length()-i, s1.length());//Rotation of the string
//			String s3=temp2+temp1;
//			if(s3.equals(s2)) {
//				return "Yes";
//			}
		
	}
}
