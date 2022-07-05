package th;
import java.util.*;
public class ReverseWord {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String S=scan.nextLine();
		  // your code here
        String[] array=S.split("\\.");
        String w="";
        String reverseString="";
        for(int i=0;i<array.length;i++)
        {
        w=array[i];
        
        
        for(int j=w.length()-1;j>=0;j--)
        {
        
        reverseString=reverseString+w.charAt(j);
           
        }
        if(reverseString.length()-1 <reverseString.length())
        {
        reverseString=reverseString+".";
        }
        
        System.out.println(reverseString);
    }
}
}


