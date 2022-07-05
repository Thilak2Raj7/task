package Rotate;

import java.util.Arrays;

public class RotateLeft {


public static void main(String[] args)
{
	int a[] = {1, 2, 3, 4, 5};
	rotateOne(a);
	
	int n=5;
	String k="";
	for(int i=0;i<a.length;i++)
	{
		k+=a[i];
	}
   k=k.substring(n-3)+k.substring(0,n-3);
   System.out.println(k);
}
   public static void leftRotate(int[] a) {
		int temp=a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;
		//System.out.println(Arrays.toString(a));
	
}
	public static void rotateOne(int[] a) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		
		System.out.println(Arrays.toString(a));
	}
	
   }


