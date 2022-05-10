package Pattern;

import javax.sql.rowset.JoinRowSet;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class PrintPattern {

	
	public static void leftToRightPattern()
	{
		int n=5;
		
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	public static void RightToLeftPattern()
	{
		int  n=5;
		for(int i=1;i<=5;i++)
		{
			int t=2*n-2*i;
			for(int j=1;j<=t;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				System.out.print(" ");
				
			}
			
			System.out.println();
        }
				
	}
	public static void pascalPattern()
	{ 
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		int n=4;
		int k=0;
      for(int i=6;i<=9;i++)
		{
			for(int j=1;j<=n-k;j++)
			{
				System.out.print("*");	
			}
			System.out.println();
			k++;
		}
	}
	public static void simpleNumberPattern()
	{
		int n=5;
		
		for(int i=0;i<n;i++)
		{ 
			int k=1;
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();		
			}
	}
	public static void pyramidPattern()
	{
		int  n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
	}
	}
	public static void diamondPattern()
	{
		int  n=5;
		int rows=9;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=count+i;k++)
			{
				System.out.print("*");
				
			}
			count++;
			System.out.println();
		}
		
			for(int i=n+1;i<=rows;i++)
			{
				for(int j=1;j<=i-n;j++)
				{
					System.out.print(" ");
				}
				for (int k=1;k<=count+2;k++)
				{
					System.out.print("*");
				}
				count=count-2;
				System.out.println();
			}
	}
	public static void sandGlassPattern()
	{
		int n=5;
		int rows=9;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
		for(int i=n+1;i<=rows+1;i++)
		{
			for(int j=1;j<=rows-i+1;j++)
			{
			System.out.print(" ");	
			}
			for(int k=1;k<=count;k++)
			{
				System.out.print("* ");
			}
			count++;
			System.out.println();
		}
	}
	public static void trianglePattern() {
		
int n=5;
for(int i=1;i<=n;i++)
{
	for(int j=i;j<n;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=(2*i-1);k++)
	{
		if(k==1 ||  i==n ||k==(2*i-1) )
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
	}
}
public static void diamondStar()	
{
	int n=5;
	int rows=9;
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<n;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++)
		{
			if(k==1  ||k==(2*i-1) )
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
	
	for(int i=n+1;i<=rows;i++)
	{
		for(int j=1;j<=i-n;j++)
		{
			System.out.print(" ");
		}
		int t=(2*rows)-(2*i)+1;
		for(int k=1;k<=t;k++)
		{
			if(k==1 || k==t)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
	public static void oddLength()
	{
		char[] array={'O','D','D'};
		int n=array.length/2;
		int d=array.length-1;
		int count=0;
		for(int i=0;i<=n;i++)
		{
		if(n!=i) {
		System.out.println(array[i]+" "+array[d-i]);
		}
		else {
			System.out.println(array[i]);
		}
		count++;
		}
		for(int j=n-1;j>=0;j--) {
			System.out.println(array[j]+" "+array[count]);
			count++;
		}
	}
	public static void pascalNumber(int n)
	{   
		for(int i=0;i<n;i++) {
			int Number=1;
			for(int j=i;j<n;j++) {
			System.out.print(" ");	
		}
			for(int k=0;k<=i;k++) {
				
					System.out.print(Number+" ");
				
				Number=Number*(i - k) / (k + 1);
			}
			
			System.out.println();
		}
	 }
		
		
	public static void printZ()
	{
		int n=5;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
		
			 if(i==1 || i==n || n+1-i==j)
			 {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			}
			  
			/*
			if(i!=0 && i!=4 )
			{
				if( j==n-1-i)
			{
					
				System.out.print("*");
			}
			 else {
				 System.out.print(" ");
			 }
			}
			else {
				System.out.print("*");
			}*/
			
			
		}
		System.out.println();
	}
	}
	
	public static void diamondNumbers()
	{
		int n=5;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			int number=1;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
		}
	}
	
		public static  void alternatingRectangle(int num)
		{
			String arr[][]=new String[num][num];
			String value="";
			int l=0;
			int k=0;
			int row=num;
			int col=num;
			int newNum=num;
			while(k<num)
			{
				if(k%2==0)
				{
					value="X";
				}
				if(k%2==1)
				{
					value="0";
				}
				for(int i=l;i<num;i++)
				{
					arr[k][i]=value;
				}
				k++;
				for(int j=k;j<num;j++)
				{
					arr[j][num-1]=value;
				}
				num--;
				for(int i=num-1;i>=l;i--)
				{
					arr[newNum-1][i]=value;
				}
				newNum--;
				for(int j=newNum-1;j>=k;j--)
				{
					arr[j][l]=value;
				}
				l++;
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			} 
		}
	
	public static void spiralPattern(int num,int num1)
	{
	           int arr[][]=new int[num][num1];
				int value=4;
				int l=0;
				int k=0;
				int row=num;
				int col=num;
				int newNum=num;
				while(k<num)
				{
					
					for(int i=l;i<num1;i++)
					{
						arr[k][i]=value;
					}
					k++;
					for(int j=k;j<num;j++)
					{
						arr[j][num-1]=value;
					}
					num--;
					for(int i=num-1;i>=l;i--)
					{
						arr[newNum-1][i]=value;
					}
					newNum--;
					for(int j=newNum-1;j>=k;j--)
					{
						arr[j][l]=value;
					}
					l++;
					value--;
				}
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				} 
			}
		
public static void spiralNumbers()
{
	int row=7;
    int col=7;
	int rowStart=0;
    int rowEnd=row-1;
    int colStart=0;
    int colEnd=col-1;
    int value=4;
      int array[][]=new int[row][col];
     
    while(rowStart<=rowEnd || colStart<=colEnd)
    {
    	for(int i=colStart;i<=colEnd;i++)
    	{
    	 array[rowStart][i]=value;
    	}
    	rowStart++;
    	
    	for(int j=rowStart;j<=rowEnd;j++)
    	{
    		array[j][colEnd]=value;
    	}
    	colEnd--;
    	for(int i=colEnd;i>=colStart;i--)
    	{
    		array[rowEnd][i]=value;
    	}
    	rowEnd--;
    	for(int j=rowEnd;j>=rowStart;j--)
    	{
    		array[j][colStart]=value;
    	}
    	
    	colStart++;
    	value--;
    }
    
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<col;j++)
    		{
    			System.out.print(array[i][j]);
    		}
    		System.out.println();    
    		}
    
}
		
		
		
	
	
	public static void main(String [] args)
	{
		//leftToRightPattern();
		//RightToLeftPattern();
		//pascalPattern();
		//simpleNumberPattern();
		//pyramidPattern();
		//diamondPattern();
		//sandGlassPattern();
		//trianglePattern();
		//oddLength();
		//diamondStar();
		int n=5;
		//pascalNumber(n);
		//printZ();
		//diamondNumbers();	
		int num=7;
		int num1=5;
		//alternatingRectangle(num);
		//spiralPattern(num,num1);
		spiralNumbers();
		}
}
