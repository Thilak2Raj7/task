import java.util.*;

public class StringGrid {
public  static void  grid(char[][]array,String word)
{
	int row=array.length;
	int wl=word.length();
	List<List<Integer>> ob1=new ArrayList<List<Integer>>();
	for(int i=0;i<array.length;i++)
	{
		
	
		
		int col=row;
	  for(int j=0;j<col;j++ )
	  {
		 
	  
		
		  for(int dir=1;dir<=8;dir++)
		  {
			 
			  String s="";
			  List obj1=new ArrayList<Integer>();
		  
			  int count=0;
			
			  if(dir==1)//left
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)
				  {
					 if(c<0)
					 {
					break;
				  }
					s+=array[r][c];
					count++;
					c--;
					}
			  }
			  if(dir==2)//right
			  {
				  int r=i;
				  int c=j;
				 while(count<wl)
				 {
					if(c>=col) 
					{
						break;
					}
					s+=array[r][c];
					count++;
					c++;
				 }
				  
			  }
			  if(dir==3)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//t
					 {
						if(r<0) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r--;
					 }  
			  }
			  
			  if(dir==4)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//b
					 {
						if(r >=row) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r++;
					 }  
			  }
			  
			  if(dir==5)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//tl
					 {
						if( r<0 || c>=col) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r--;
						c++;
					 }  
			  }
			  
			  if(dir==6)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//tr
					 {
						if( r<0 || c>=col) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r--;
						c++;
					 }  
			  }
			  
			  if(dir==7)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//bl
					 {
						if( r >= row || c<0) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r++;
						c--;
					 }  
			  }
			  
			  if(dir==8)
			  {
				  int r=i;
				  int c=j;
				  while(count<wl)//br
					 {
						if( r>=row || c>=col) 
						{
							break;
						}
						s+=array[r][c];
						count++;
						r++;
						c++;
					 }  
			  
		  }
			  if(s.equals(word))
			  {
				  obj1.add(i);
				  obj1.add(j);
				  if(!ob1.contains(obj1))
				  {
					  ob1.add(obj1);
				  }
			  }
		  }
	  }
	}
	System.out.println(ob1);
		  
		  
	  }

public static int lookAndSay(int n)
{
if(n==1)	
{
	return 1;
}
if(n==2)
{
	return 11;
}
	
	String str="11";
	String c="";
	int count=1;
	for(int i=3;i<=n;i++)
	{
		str=str+"$";
	    char[] arr=str.toCharArray();
	    for(int j=1;j<arr.length;j++)
	         {
	    	if(arr[j]!=arr[j-1])
	    	{
	    	 c+=count;
	    	 c+=arr[j-1];
	    	 System.out.println(c);
	    	}
	    	else
	    	{
	    		count++;
	    	}
	         }
		    str=c;
		    c="";
		    count=1;
	}
	System.out.println(str);
	System.out.println(Integer.parseInt(str));
	return Integer.parseInt(str);
}
public static boolean checkArray(int number)
{

		 if(number >= 0 && number<=255)
		 {
			 return true;
		 }
		return false; 
	 }
	
//public static String[] split(String str)
//{
//	if(str.charA)
//	
//	
//}
	
	public static boolean validIp(String str)
	{
		//String[] array=null;
		String[] array1=str.split("\\.");
		String t="";
		int c=0;
		
//	  for(int i=0;i<str.length();i++)
//	  {
//		  
//		  if(str.charAt(i)=='.')
//		  {
//			array[c++]=t; 
//			t="";
//		  }
//		  else
//		  {
//			t+=str.charAt(i);  
//		  }
//		  
//	  }
	  if(array1.length!=4)
	  {
		  return false;
		  
	  }
	  else
	  {
		  
		 for(int i=0;i<array1.length;i++) 
		 {
			 int number=Integer.parseInt(array1[i]);
			 if(!checkArray(number))
			 {
				 return false;
			 }
			 
		 }
	  }
	  return true;
	}
	
	
	
	
	
	
	
public static void main(String[] args)
{
//	char[][] a	={{'a','b','a','b'},{'a','b','e','b'},{'e','b','e','b'}};
//	
//grid(a, "abe");
System.out.println(validIp("555.55"));
		
	}
	

}
