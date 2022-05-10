import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class BinarySearchTree {
	Scanner scan=new Scanner(System.in);
	class Node{
		
		int key;
		Node left;
		Node right;
   public Node(int value)
   {
	   key=value;
	   left=null;
	   right=null;
   }
	}
	 public static int sumOfLeafNodes(Node root)
	    {
	        int value=0;
	        int sum=0;
	       
	       inOrder(root, sum,value);
	       return sum;
	    }
	    
	    
	    public  static void inOrder(Node root,int sum,int value)
	    {
	        
	        if(root==null)
	        {
	           sum+=value; 
	        }
	        value=root.key;
	        inOrder(root.left,sum,value);
	        inOrder(root.right,sum,value);
	        
	    }
   public  void printArray()
   {
	  
	   int number=scan.nextInt();
	   int [] arr=new int[number];
	   Node root=null;
	   for(int i=0;i<number;i++)
	   {
		 System.out.print("Enter the array elements");  
		 arr[i]=scan.nextInt() ; 
		 root=insertElements(root,arr[i]);
	   }
	   System.out.print("Enter the value");
	   int val=scan.nextInt();
	   inorderTraversal(root);
	   root=search(root, val);
	   preOrderTraversal(root);
	   
   }
   public void preOrderTraversal(Node root)
   {
	   if(root == null)
	   {
		   return;
	   }
	   System.out.print(root.key);
	   preOrderTraversal(root.left);
	   preOrderTraversal(root.right);
	   
   }
   public void inorderTraversal(Node root)
   {
	   if(root== null)
	   {
		   return ;
	   }
		   
	  
	    inorderTraversal(root.left);
	    System.out.print(root.key);
	    inorderTraversal(root.right);
	   
   }
  public Node search(Node root,int value) 
  {
	 if(root==null || root.key==value) 
	 {
		 return root;
	 }
     if(root.key<value)
     {
    	 search(root.right, value);
     }
     return search(root.left, value);
  }
   
   public Node insertElements(Node root,int value)
   {
	 if(root==null) {
		 
			 return new Node(value);
	 }
	 if(root.key > value)
	 {
		 root.left=insertElements(root.left, value);
	 }
	  if(root.key < value) 
		  
	  {
		  root.right=insertElements(root.right, value);
		  
	  }
	  return root;
   }
   
   public static void main(String [] args)
   {
	   BinarySearchTree bst=new BinarySearchTree();
	   bst.printArray();
	   
   }
		
	}
		
	

