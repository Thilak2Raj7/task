
import java.util.Arrays;

public class Sorting {
	 //Function to find the minimum number of swaps required to sort the array.
    public static int minSwaps(int nums[])
    {
        int[] output=nums;
       int count=0;
       Arrays.sort(nums);
         for(int i=0;i<output.length;i++)
         {
             if(nums[i]!=output[i] )
             {
                 count++;
             }
         }
         int h=count/2;
         
       return h;
    }

 public static void main(String[] args)
 {
	int [] arr= {2,8,5,4}; 
	 System.out.print(minSwaps(arr));
}
}
