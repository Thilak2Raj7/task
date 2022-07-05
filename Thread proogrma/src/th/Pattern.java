package th;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args)
	{
	 
	/* int i;
	 int j;
	 int k;
	 char a=0;
	 
	    int length=s.length();
      int midlength=length/2;
      char[] ch=new char[s.length()];
	   for( i=midlength;i<length;i++) 
	   {
		   
	    ch[i]=s.charAt(i);
	    System.out.print(ch[i]+"$");
	    System.out.print(" ");
	    break;
	   }
	    
	    for(j=midlength;j<length;j++)
	    {
	    ch[j]=s.charAt(j);
	   
	    System.out.print (ch[j]);
	    }
	    
	    System.out.print("$"+" ");

	  
	   for( k=length;k<=midlength-1;k--)
	    {
	    	  ch[k]=s.charAt(k);
	    System.out.print(" "+ch[k]+"$");
	   
	    }
	  
	  }
	   }
		
		{
		String s="SuperStarVijay";
		String str ="";
	    int n = s.length()/2;
	    String newString =s.substring(0,n)+ s.substring(n,s.length())+"";
	    
	    for(int i = 0;i<s.length();i++)
	    {
	        str = "";
	        str += newString.substring(0,i+1)+"$";
	        System.out.print(str+" ");
	    }
		}
	}	
}*/
		    {
		    // Your code goes here

            {
			Scanner scan=new Scanner(System.in); 	
			String S=scan.nextLine();
			int count=0;
			String newString="";
			String[] array=new String[S.length()];
			for(int i=0;i<S.length();i++)
			{
			System.out.println(array[i]);
			}
		    for(String s1:array)
			{
			for(int j=S.length();j<0;j--)
			{
			newString=s1;
			}
			}
			System.out.println(newString);
			}
}
		    }
}
			    
