/*package array;

public class Array1 {

	class Solution {
	    public int[] smallerNumbersThanCurrent(int[] nums) {
	        int j=0;
	        int count=0;
	        int[]  countArray=new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	        {
	            
	            while(j<nums.length)
	            {
	           if (nums[i]>nums[j])
	           {
	               j++;
	               count++;
	           }
	            
	            else
	            {
	             j++;
	            }
	            }
	             countArray[i]=count;
	            count=0;
	                j=0;
	            }
	            
	            
	    
	        return countArray;
	}
	}
	class Solution{

	    // arr: input array
	    // n: size of array
	    //Function to find the sum of contiguous subarray with maximum sum.
	    long maxSubarraySum(int arr[], int n){
	         long max=arr[0];
	        
	        long sum=arr[0];
	       for(int i=1;i<arr.length;i++)
	       {
	           long max1=arr[i];
	            sum+=arr[i];
	           max1=Math.max(max1,sum);
	        max= Math.max(max,max1) ;
	       }
	       return max; 
	    }
	    
	}
	   public static void convertToWave(int arr[], int n)
	    {
	        
	      
	        
	      for(int i=0;i<n-1;i+=2)
	      {
	         int  temp=arr[i];
	          arr[i]=arr[i+1];
	          arr[i+1]=temp;
	      }
	      
	   
	  
	}
	   public static void convertToWave(int arr[], int n)
	    {
	        
	      
	        
	      for(int i=0;i<n-1;i+=2)
	      {
	         int  temp=arr[i];
	          arr[i]=arr[i+1];
	          arr[i+1]=temp;
	      }
	      
	   
	  
	}
	   class Solution
	   {
	       static int majorityElement(int a[], int size)
	       {
	          int num=0;
	          int n=a.length/2;
	           int count=1;
	           int max=0;
	           Arrays.sort(a);
	           Map<Integer,Integer> mapObj=new HashMap<>();
	           if(a.length>1)
	           {
	          for(int i=0;i<a.length;i++)
	          {
	              
	              
	            if(mapObj.containsKey(a[i]) ) 
	            {
	                int value=mapObj.get(a[i]);
	             mapObj.put(a[i],value+1);
	                
	            }
	            else
	            {
	                mapObj.put(a[i],1);
	            }
	          }
	          for(int j=0;j<a.length;j++)
	          {
	              
	              int h=mapObj.get(a[j]);
	              if(h>n)
	              {
	                  return a[j];
	              }
	              
	          }
	          return -1;
	          
	           }
	           else
	           {
	               return a[0];
	           }
	           }
	   }

class Solution
{
    int search(int A[], int l, int h, int key)
    {
          for(int i=0;i<A.length;i++)
          {
              if(A[i]==key)
              {
                  return i;
              }
          }
          return -1;
    }
    
}
class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
    int sum1=0;
    int sum2=0;
       for(int i=0;i<n/2;i++)
       {
           sum1+=a[i];
       }
         for(int i=n/2;i<n;i++)
       {
           sum2+=a[i];
       }
       if(sum1==sum2)
       {
           return 1;
       }
       else if(sum1>sum2)
       {
           return sum1-sum2;
       }
       else 
       {
           return sum2-sum1;
       }
}
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] s=new int[nums.length];
       int j=0;
        for(int i=0;i<n;i++)
        {
          
            if(i<n)
            {
              s[j] =nums[i];
                s[j+1]=nums[n+i];
            }
            j=j+2;
            
        }
        return s;
    }
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int count=0;
            int j=1;
            for(int i=0;i<nums.length-1;i++)
            {
                j=i+1;
                while(j<nums.length)
                {
                   
                 if(nums[i]==nums[j])
                 {
                     count++;
                 }
                
                  j++;
                }
                
            }
            
         return count;   
        }
    }
    class Solution
    {
        public int minimum_difference(int[] nums)
        {
            Arrays.sort(nums);
            int min=Integer.MAX_VALUE;
          for(int i=0;i<nums.length-1;i++)
          {
              int diff=Math.abs(nums[i]-nums[i+1]);
              min=Math.min(diff,min);
              
          }
          return min;
        }
    }
    class Solution{
        //Function to find the leaders in the array.
        static ArrayList<Integer> leaders(int arr[], int n){
           
           ArrayList<Integer> listObj=new ArrayList<Integer>();
          
          int max=arr[n-1];
          listObj.add(max);
                for(int i=n-2;i>=0;i--)
                {
              if(max<=arr[i])
              {
                  max=arr[i];
                  listObj.add(arr[i]);
              }
          }
        
        Collections.reverse(listObj);
        return listObj;
    }

class Solution{

    static boolean findsum(int arr[],int n)
    {
     
        int sum = 0;
  Set<Integer> hs = new HashSet<Integer>();
       
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
            if(sum==0 || arr[i]==0 || hs.contains(sum))
             {
                 return true;
             }
                 hs.add(sum);
             }
           return false;  
        }
    
}

class Check{
    
    public int firstNonRepeating(int arr[], int n) 
    { 
        // Complete the function
        int count=0;
        Map<Integer,Integer> mapObj=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            
          if(mapObj.containsKey(arr[i]))
          {
              int value=mapObj.get(arr[i])+1;
              mapObj.put(arr[i],value);
          }
          else
          {
              mapObj.put(arr[i],1);
          }
        }
        for(int i=0;i<arr.length;i++)
        {
            
            int output=mapObj.get(arr[i]);
            if(output==1)
            {
                return  arr[i];
            }
        }
        
         return 0;
    }  
    
}


class Solution
{
    int findMin(int arr[], int n)
    {
        int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
           min=Math.min(min,arr[i]);
       }
       return min;
    }
}

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        int output=0;
       Arrays.sort(arr);
       if(k>=0)
       {
           output=arr[k-1];
       }
 return output;
    }
}
    }
}*/
