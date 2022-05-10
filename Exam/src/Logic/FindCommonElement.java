package Logic;
import java.util.*;
public class FindCommonElement {

	
public void findElement(int [] arr1,int [] arr2,int[] arr3)	
{
	List<Integer> list1=new ArrayList<>();
	List<Integer> list2=new ArrayList<>();
	List<Integer> list3=new ArrayList<>();
	
	for(int i=0;i< arr1.length;i++)
	{
		list1.add(arr1[i]);
		
	}
	
	for(int i=0;i< arr2.length;i++)
	{
		for(int j=0; j<list1.size();j++)
	
		if(list1.get(j)==arr2[i])
		{
			list2.add(arr2[i]);
		}
	}
	for(int i=0;i< arr3.length;i++)
	{
		for(int j=0;j<list2.size();j++)
		{
		if(list2.get(j)==arr3[i])
		{
			list3.add(arr3[i]);
		}
	}
	}
	System.out.println(list3);	
}
	
	
	
	
	
	
	



public void inputGenerator()
{
	int a[]= {1,2,3,4};
	int b[]= {2,3};
	int c[]= {1,3,5};
	findElement(a,b,c);
}

public static void main(String[] args)
{
FindCommonElement obj=new FindCommonElement();

//Scanner scan=new Scanner(System.in);
//	System.out.println("Enter the number of elements in array");	
//	int elements1=scan.nextInt();
//	int [] arr1=new int[elements1];
//	for(int i=0;i<elements1;i++)
//	{
//		arr1[i]=scan.nextInt();		
//	}
//	
//	
//	System.out.println("Enter the number of elements in array");
//	int elements2=scan.nextInt();
//	int [] arr2=new int[elements2];
//	for(int i=0;i<elements2;i++)
//	{
//		arr2[i]=scan.nextInt();		
//	}
//	
//	System.out.println("Enter the number of elements in array");
//	int elements3=scan.nextInt();
//	int [] arr3=new int[elements1];
//	for(int i=0;i<elements3;i++)
//	{
//		arr3[i]=scan.nextInt();		
//	}
	
	int[] a= {1,5,10,20,40,80};
	int[] b= {6,7,20,80,100};
	int [] c= {3,4,15,20,30,70,80,120};
	//obj.inputGenerator();
	obj.findElement(a,b,c);
	
	
	
}
}

