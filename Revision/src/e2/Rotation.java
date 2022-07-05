package e2;

import java.util.Arrays;

public class Rotation {
public  void rotation(int[] arr,int r,int n)
{
	int temp=arr[n-1];
	for(int i=n-1;i>0;i--)
	{
		arr[i]=arr[i-1];
		
	}
	arr[0]=temp;
	
}
public void longestIncreasingSubsequence(int[] arr)
{
	int max=Integer.MIN_VALUE;
	int[] lis=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		lis[i]=1;
	}
	for(int i=1;i<arr.length;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(arr[i]>arr[j] && lis[i]<=lis[j])
			{
				lis[i]=1+lis[j];	
			}
		
		}
		
	}
	for(int i=0;i<lis.length;i++)
	{
		if(max<lis[i])
		{
			max=lis[i];
		}
		
	}
	
System.out.println(max);	
}
public void numberOfRotation(int[] arr,int r)
{
	Rotation obj=new Rotation();
	for(int i=1;i<=r;i++)
	{
		System.out.println(Arrays.toString(arr));
		obj.rotation(arr,i,arr.length);
	}
	System.out.println(Arrays.toString(arr));
}
public static void main(String[] args)
{
	int [] arr= {1,5,2,3,4};
	Rotation obj=new Rotation();
	//obj.numberOfRotation(arr,5);
	obj.longestIncreasingSubsequence(arr);
}
}
