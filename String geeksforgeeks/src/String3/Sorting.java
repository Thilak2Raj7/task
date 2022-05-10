package String3;

import java.util.ArrayList;
import java.util.Arrays;

import javax.sql.rowset.JoinRowSet;

public class Sorting {

    public  static void merge(int arr1[], int arr2[]) {
      
        int[] output=mergeArray(arr1,arr2);
        
        int k=0;
       for(int i=0;i<arr1.length;i++)
       {
           
           arr1[i]=output[i];
           System.out.print(output[i]);
           
          
       }
        
        for(int j=arr1.length;j<output.length;j++)
        {
       //     System.out.print(output[j]);
             arr2[k]=output[j];
        
           k++;
        }
       
    }
    
     public static int[] mergeArray(int[]  left,int[] right)
    {
        int i=0;
        int j=0;
        int k=0;
        int count=0;
    int[] output=new int[left.length+right.length];
    while(i<left.length && j<right.length)
    {
        if(left[i]<right[j])
        {
            output[k++]=left[i++];
            
        }
        else
        {
            output[k++]=right[j++];

            
        }
    }
        
      while(i<left.length) 
      {
        output[k++] =left[i++]; 
      }
        
         while(j<right.length) 
      {
        output[k++] =right[j++] ;
      }
      return output;  
    }
     
     public static int closestToZero (int arr[], int n)
     {
         int min=Integer.MAX_VALUE;
         int s=0;
         int t=0;
         int minSum=arr[0]+arr[1];
        for(int i=0;i<arr.length-1;i++)
        {
            
            for(int j=i+1;j<arr.length;j++)
            {
             int sum =Math.abs(arr[i]+arr[j]);
             
              min=Math.min(min,sum);
          if(min<minSum)
           {
              minSum=min; 
              s=arr[i];
              t=arr[j];
           }
        }
     }
     return minSum;
     }
   

//    public static void bitonicGenerator(long[] arr1, int n)
//     {
//    	int mid=arr1.length/2;
//    	long[] firsthalf=null;
//    	long[] secondhalf=null;
//    	if(arr1.length%2==0)
//    	{
//    	
//    		 firsthalf=new long[mid];	
//    	 secondhalf=new long[mid];
//    	 
//    	}
//    	else {
//    		firsthalf=new long[mid+1];
//    		 secondhalf=new long[mid];
//    	}
//         
//        
//         int j=0;
//         int k=0;
//      for(int i=0;i<arr1.length;i++)  
//      {
//          if(i%2==0)
//          {
//         firsthalf[j++]=arr1[i];
//          }
//          else
//          {
//              secondhalf[k++]=arr1[i];
//          }
//      }
//      firsthalf=arrange(firsthalf);
//      secondhalf=arrange(secondhalf);
//      
//      for(int i=0;i<firsthalf.length;i++)
//      {
//          arr1[i]=firsthalf[i];
//      }
//      int t=secondhalf.length-1;
//         for( j=firsthalf.length;j<arr1.length;j++)
//      {
//          arr1[j]=secondhalf[t--];
//      }
//        
//     }
//     public static long[] arrange(long arr[])
//     {
//         if(arr.length==1)
//         {
//             return arr;
//             
//         }
//         
//         int mid=arr.length/2;
//         long [] left=arrange(Arrays.copyOfRange(arr,0,mid));
//         long[] right=arrange(Arrays.copyOfRange(arr,mid,arr.length));
//         
//         return mergeArray(left,right);
//     }
     
//      public static  long[] mergeArray(long[]  left,long[] right)
//     {
//         int i=0;
//         int j=0;
//         int k=0;
//         int count=0;
//     long[] output=new long[left.length+right.length];
//     while(i<left.length && j<right.length)
//     {
//         if(left[i]<right[j])
//         {
//             output[k++]=left[i++];
//             
//         }
//         else
//         {
//             output[k++]=right[j++];
//
//             
//         }
//     }
//         
//       while(i<left.length) 
//       {
//         output[k++] =left[i++]; 
//       }
//         
//          while(j<right.length) 
//       {
//         output[k++] =right[j++] ;
//       }
//       return output;  
//     }
// 
//
  public void arrayElement()
  {
  int[]   arr= {1,2,3,4,5,6,7};
  int j=arr.length-1;
     ArrayList<Integer> listObj=new ArrayList<>();
     for(int i=0;i<arr.length;i++)
     {
      listObj.add(arr[j]);
      listObj.add(arr[i]);
      j--;
     }
System.out.println(listObj);
  }

     public static void main(String[] args)
     {
    	long arr1[] = {1,2,3,4,5};
    	//int arr2[] = {0, 2, 6, 8, 9};
    //	merge(arr1,arr2);
    	 //closestToZero(arr1, 3);
    	//bitonicGenerator(arr1,5);
    	Sorting obj=new Sorting();
    	obj.arrayElement();
     }
}


