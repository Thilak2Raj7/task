package Beast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import String3.CompareString;

public class Arr2 {
	public static void findSumPair(int[] a,int num)
	{
		
		int n=a.length-3;
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++ )
		     if(a[i]+ a[j]== num)
		     {
		    	 System.out.print("("+a[i]+","+a[i+1]+")");
		    	
		     }
			  
		}
		
	}
	public static void findDuplicateNumber(int [] a) {
		
		
		int n=a.length;
		Map<Integer,Integer> mapObj=new HashMap<>();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(mapObj.containsKey(a[i]))
			{
				count=mapObj.get(a[i]);
				count++;
				mapObj.put(a[i], count);
		        count=0;
			}
			else
			{
				mapObj.put(a[i], 1);	
			}
		}
		  
			  for(Integer key:mapObj.keySet())
			  {
				  System.out.println(key+"-"+mapObj.get(key));
			  }
		  
	}
	
	public static void findSet( List listObj,  List list)
	{
		List<Integer> union=new ArrayList();
		List<Integer> except=new ArrayList();
		List<Integer> intersect=new ArrayList();
	for(int i=0;i<listObj.size();i++)
	{
		int n=(Integer)listObj.get(i);
		if(!union.contains(listObj.get(i)))
	{
		 union.add((Integer) listObj.get(i));
	}
		if(!except.contains(listObj.get(i)) && n % 2==0)
		{
		   except.add((Integer)listObj.get(i));
	}
	}
	for(int i=0;i<list.size();i++)
	{
		int g=(Integer)list.get(i);
		if(!union.contains(list.get(i)))
		{
			 union.add((Integer) list.get(i));
	     }
		if(!except.contains(list.get(i)) && g % 2>0)
		{
			except.add((Integer)list.get(i));
		}
	
	}
	for(int i=0;i<list.size();i++)
	{
		if(listObj.contains(list.get(i)))
       {
			if(!intersect.contains(list.get(i)))
			{
			  intersect.add((Integer)list.get(i));	
			}
       }
	}
	System.out.print(union);
	System.out.print(except);
	System.out.print(intersect);
	}	
	public static void grandFather(Map <String,String> mapObj,String name)
	{
		int count=0;
		Map <String,String> obj=new HashMap<>(); 
		List<String> objList=new ArrayList<>();
	  for( String father:mapObj.keySet())
	  {
		  if(mapObj.get(father).equals(name))
		  {
			 objList.add(father); 
			 //System.out.print(father);
			 System.out.print(objList);
		  }
	  }
	  for(String grandSon:mapObj.keySet())
	  {
		  
		  if(objList.contains(mapObj.get(grandSon)))
				  {
			  System.out.print(grandSon);
			    count++;
				  }
	  }
		
	System.out.println(count);	
	}
	public  static int sumOfDigits(int num)
	{
		int sum=0;
		while(num>0)
		{
			int i=num%10;
			sum=sum+i;
			num=num/10;
		}
		return sum;
		
	}
	public static void sortSmallestSum(int [] a) {
      int max=0;
       int max1=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
			max=sumOfDigits(a[i]);
			max1=sumOfDigits(a[j]);
			if(max>max1||(max==max1&&a[i]>a[j])) {
				System.out.println("i"+a[i]);
				System.out.println("j"+a[j]);
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				System.out.println("i"+a[i]);
				System.out.println("j"+a[j]);
				System.out.println(Arrays.toString(a));
		
	}
		}
	
	
}
		System.out.println(Arrays.toString(a));
	}
	
	public static void rotateLeft(int [] array,int n)
	{
		int a=0;
		while (a < n)
		{
		int temp=array[0];
		for(int i=0;i<array.length-1;i++)
		{
			array[i]=array[i+1];
		}
	     array[array.length-1]=temp;
	     a++;
		}
		System.out.println(Arrays.toString(array));
	}
	public static void digitSum(int num,int num1)
	{
	  int a=Math.abs(num-num1);
	  System.out.println(a);
	  System.out.println(num1);
	  String k=String.valueOf(num1)+String.valueOf(a);
	  
	  
	 
	  System.out.println(k);
	}
	 public static void closeToSum(int [] array)	
	  {
		 int n=10;
		 int num1=0;
		 int num2=0;
		 int min=Integer.MAX_VALUE;
		  for(int i=0;i<array.length;i++)
		  {
			  for(int j=i+1;j<array.length;j++)
			  {
				  int diff=Math.abs(n-(array[i]+array[j]));
				  
				  min=Math.min(diff,min);
				  
				  if(min==diff)
				  {
					 num1 =array[i];
					   num2=array[j];
				  }
			  }
		  }
		  System.out.println(num1+","+num2);
	  }
public static void findGreatestCombination(int [] array)
{
	int mul=1;
	int num1=0;
	int num2=0;
	int num3=0;
	int max=Integer.MIN_VALUE;
    for(int i=0;i<array.length-2;i++)
    {
      for(int j=i+1;j<array.length-1;j++)
      {
    	for(int k=j+1;k<array.length;k++)
    	{
    		
    	mul=Math.abs(array[i]*array[j]*array[k]);
    	max=Math.max(max, mul);
    	
    	if(max==mul)
    	{
    		
    		num1=array[i];
    		
    		num2=array[j];
    		
    		num3=array[k];
    	
    	}
    	}
    }
    }
  System.out.println(num1+","+num2+","+num3);  
	
	
}

public static void chocolateDistribution(int [] a,int m)
{
	Arrays.sort(a);
	int start=0;
	int end=m;
	int min=Integer.MAX_VALUE;
	System.out.println( findMinimumDistribution(a,start,end,min));
	
}
public static int findMinimumDistribution(int[] a, int start,int end,int min)
{
if(end==a.length-1)
{
	return min;
}
int d=a[end-1]-a[start];
if(d<min)
{
	min=d;
}
return findMinimumDistribution(a,start+1,end+1,min);
}

public static boolean nonDecreasingArray(int[] a, int n)
{
	for(int i=1;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
		if(a[i]>a[j]) {
			return false;
		}
	}
	
	
}
	return true;
}
	public static void main(String[] args)
	{
		
	
	     int number=0;
		Scanner scan=new Scanner(System.in);
		CompareString obj=new CompareString();
		try
		{
			System.out.println("number");
			 number=scan.nextInt();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
 
	switch(number) {
	
	case 1:
		//int [] a= {0, 14, 0, 4, 7, 8, 3, 5, 7};
		//int num=11;
		//findSumPair(a,num);
		int [] a= {10, 22, 28, 29, 30, 40};
		//findDuplicateNumber(a);
		//findSumClosest(a)
		List<Integer> listObj=new ArrayList();
		listObj.add(1);
		listObj.add(2);
		listObj.add(5);
		listObj.add(3);
		listObj.add(8);
		listObj.add(9);
		List<Integer> list=new ArrayList();
		list.add(1);
		list.add(7);
		list.add(5);
		list.add(8);
		list.add(8);
		//List1: 1 2 5 3 8 9
		//List2: 1 7 5 8 8 
		//findSet(listObj,list);
		Map <String,String> mapObj=new HashMap<>();
		String[][] arr={{"Ram", "Syam"},
		{"Akil", "Syam"},
		{"Nikil", "Ram"},
		{"Subhash","Ram"},
		{"Karthik", "Akil"}};
		String name="Syam";
		mapObj.put("Ram", "Syam");
		mapObj.put("Akil", "Syam");
		mapObj.put("Nikil", "Ram");
		mapObj.put("Subhash","Ram");
		mapObj.put("Karthik", "Akil");
		//grandFather(mapObj,name);
		int [] arr1= {17,85,23,60};
		//sortSmallestSum(arr1);
	int[] array= {1,2,3,4,5 };
	//rotateLeft(array,2);
break;

	case 2:
		System.out.println("number");
		int a1=scan.nextInt();
		System.out.println("n1");
		int a2=scan.nextInt();
		digitSum(a1,a2);
		break;
	case 3:
		int[] array1 =  {1, 2, 3, 4, 5} ;
		closeToSum(array1);
		break;
	case 4:
	int[] s= {-10,-10,10,20,50,60};
	findGreatestCombination(s);
	break;
	case 5:
	int[]	input= {3, 4, 1, 9, 56, 7, 9, 12};
		int m=5;
		chocolateDistribution(input,m);
		break;
	case 6:
		int [] input1= {1,4,3,5,2};
		rotateLeft(input1,5);
		break;
	case 7:
		int []input2= {10,5,6,14,12};
		System.out.println(nonDecreasingArray(input2, 5));
	
}
}
}
