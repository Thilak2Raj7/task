import java.awt.image.AbstractMultiResolutionImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;






class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
   TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
       this.left = left;
       this.right = right;
   }
}

public class CheckAnswer {


 
	    public int rangeSumBST(TreeNode root, int low, int high) {
	        int sum=0;
	        List<Integer>listObj=new ArrayList<>();
	       
	       inOrderTraversal(root,listObj);
	        for(int i=0;i<listObj.size();i++)
	        {
	          if(listObj.get(i)>=low  || listObj.get(i)<=high)
	          {
	            sum+= listObj.get(i);
	         
	          }
	        }
	     System.out.print(sum);
	     return sum;
	    }
	    
	    public  void inOrderTraversal(TreeNode root, List<Integer> listObj) 
	    {
	       if(root==null) 
	       {

	       return ;
	           
	       }
	       inOrderTraversal(root.left,listObj);
	        listObj.add(root.val);
	        inOrderTraversal(root.right,listObj);
	        
	        
	    }
	    public  void printArray()
	    {
	   	 Scanner scanner=new Scanner(System.in);
	 	   int number=scanner.nextInt();
	 	   int [] arr=new int[number];
	 	   TreeNode root=null;
	 	   for(int i=0;i<number;i++)
	 	   {
	 		 System.out.print("Enter the array elements");  
	 		 arr[i]=scanner.nextInt() ; 
	 		 root=insertElements(root,arr[i]);
	 		List<Integer> listObj=new ArrayList<>();
	 		
		    
	 		rangeSumBST( root,7, 15);
	 	   }
	 	  
	 	   
	 	 
	    }
	    public TreeNode insertElements(TreeNode root,int value)
	    {
	 	 if(root==null) {
	 		 
	 			 return new TreeNode(value);
	 	 }
	 	 if(root.val > value)
	 	 {
	 		 root.left=insertElements(root.left, value);
	 	 }
	 	  if(root.val < value) 
	 		  
	 	  {
	 		  root.right=insertElements(root.right, value);
	 		  
	 	  }
	 	  return root;
	    }
	    
	    public static void main(String [] args)
	    {
	    	 CheckAnswer obj=new CheckAnswer();
	
	     try {
			obj.printArray();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
