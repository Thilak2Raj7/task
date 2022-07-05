package Beast;

public class Arrays2 {

	
public static void main(String [] args)
{
	int [] arr= {12,19,38,56,34,23,18,69,41,12,45,78,43,99,10};
     
      int k=0;
    int  count=0;
    int n=5;
	for(int i=1;i<=n;i++)
	{
		k=i;
		
		for(int j=1;j<=i;j++)
		{
		
	    System.out.print(arr[k-1]+" ");
		k=k+n-j;
	    
		}
		System.out.println();
	
	   
		 }
	   
	    
		
	
}
}

