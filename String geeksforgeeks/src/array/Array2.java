package array;

import java.awt.List;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array2 {
	
	public String  findMinimumPair(int [] arr)
	{
		int n=arr.length;
		int num1=0;
		int num2=0;
		int min=Integer.MAX_VALUE;
		Arrays.sort(arr);
		int[] array=new int[2];
		
		for(int i=0;i<n-1;i++)
		{
			int diff=Math.abs(arr[i]-arr[i+1]);
			if(diff >min)
			{
			 int count=diff;
			}
			else {
				min=Math.min(min,diff);
				
			    num1=arr[i]	;
				 num2=arr[i+1];
			}
			
	     }
		String resultString=String.valueOf(num1)+","+String.valueOf(num2);
		return resultString;
	}

public static void main(String[] args)
{
	int[] arr= {10,40, 35, 0, 60};
	Array2 obj=new Array2();
	System.out.println(obj.findMinimumPair(arr));
}
}