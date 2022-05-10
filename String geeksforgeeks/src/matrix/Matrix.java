package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Matrix {
	
	
public  static void replaceRow(int [][] mat)
{
	int count=0;

	//List <Integer> k=new ArrayList<>();
	Set <Integer> k=new HashSet<>();
	int n=mat.length;
	int t=mat[0].length;
	
	int[] arr=new int [n];
	int [][] output=new int[n][t];
	for(int i=0;i<n;i++)
	{
		
		int m=mat[i].length;
		for(int j=0;j<m;j++)
		{
			if(mat[i][j]==1)
			{
				count++;
			}
		
		}
		arr[i]=count;
		count=0;
	 }
	int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
  if(max<=arr[i])
  {
	 max=Math.max(max, arr[i]) ;
	 if(max==arr[i])
	 {
		k.add(i); 
	 }
		 
  }
}//Arrays.fill
	
	for(int i=0;i<n;i++)
	{
		int m=mat[i].length;
		for(int j=0;j<m;j++)
		{
			if(k.contains(i))
			{
			 mat[i][j]=0;
			  System.out.print( mat[i][j]);	
			}
			else {
				
				  System.out.print( mat[i][j]);
			}
					
			}
		System.out.println();
	}
	
	
}


public static void leftDiagonalMatrix(int [][] mat)
{
	int n=mat.length;
	int m=mat[0].length;
	int [] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(i==j)
			{
				arr[i]=mat[i][j];
			}
		}
	}
	Arrays.sort(arr);
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			if(i==j)
			{
				mat[i][j]=arr[i];
				System.out.print(mat[i][j] +" ");
			}
			else {
			System.out.print(mat[i][j]+" ");	
			}
		}
		System.out.println();	
		}
}
public static void main(String[] args)
{
	int mat[][]= {
			{5,2,0,7, 1},
			{3,4, 2, 9, 14},
			{5,1, 3, 5, 2},
			{4 ,2, 6, 2, 1},
			{0, 6, 3, 5, 1}
	};
	leftDiagonalMatrix(mat);
	
	//replaceRow(mat);
	
}
}
