package Revise;

	

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data) {
//        this.data = data;
//        left = null;
//        right = null;
//    }
//}
//
//public class ProgramDebug{
//
//public static Node printArray(){
//	Node root=null;
//	int[] arr= {50,20,70,10,25,60,90,55,80,75};
//	for(int i=0;i<arr.length;i++)
//	{
//		
//	root=insertElement(root,arr[i]);
//}
//return root;
//}
//
//public static Node insertElement(Node root,int key)
//{
//	
//	if(root== null)
//	{
//		return new Node(key);
//	}
//	if(key<root.data)
//	{
//		root.left=insertElement(root.left,key);
//	}
//	
//	if(key > root.data)
//	{
//		root.right=insertElement(root.right,key);
//	}
//	
//	return root;
//}
//   
//    static void printInorder(Node root) {
//        if (root == null) return;
//
//        printInorder(root.left);
//        System.out.print(root.data + " ");
//
//        printInorder(root.right);
//    }
//
//    public static Node deleteNode(Node root, int X) {
//        if(root== null)
//        {
//          return root;  
//        }
//        
//        
//        if(X<root.data)
//       {
//         root.left=deleteNode(root.left,X);
//         System.out.print(root.left);
//       }
//      else  if(X>root.data)
//       {
//          root.right= deleteNode(root.right,X);
//       }
//       
//       else{
//           if(root.right==null)
//           {
//               return root.left;
//           }
//           else if(root.left== null)
//           {
//             return root.right;  
//           }
//           root.data=min(root.right);
//           root.right=deleteNode(root.right,root.data);
//       }
//       
//       
//     
//        return root;  
//    }
//    
//    
//public static int min(Node root)
//{
//    
//   
//   
//   int  min=  root.data;
//
//    
//    while(root.left!=null)
//    {
//        min=root.left.data;
//       root=root.left;
//     
//    
//    }
//    return min;
//}
//  
//
//
//
//    public static void main(String[] args) throws Exception {
//         
//            Node root = printArray();
//            ProgramDebug g = new  ProgramDebug();
//            root = g.deleteNode(root, 70);
//            printInorder(root);
//            System.out.println();
//           
//        }
    public class ProgramDebug{
    	
    	public void findFrequency(int[] a)
    	{
    		Arrays.sort(a);
    		int x=0;
    		System.out.println(Arrays.toString(a));
    		int[][] b=new int[a.length][2];
//    	    HashSet<Integer> store=new HashSet<>();	
//    		for(int i:a)
//    		{
//    			store.add(i);
//    		}
//    		System.out.println(store);
    		b[x][0]=a[0];
    		for(int i=1;i<a.length;i++)
    		{
    			if(a[i]==a[i-1])
    			{
    				b[x][1]=b[x][1]+1;
    			}
    			else
    			{
    				x++;
    				b[x][0]=a[i];
    				
    			
    			}
    		}
    			for(int i=0;i<b.length;i++)
    			{
    			for(int j=0;j<2;j++)	
    			{
    		    System.out.print(b[i][j]);
    			}
    			System.out.println();
    	}
    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();		
    		for(int i=0;i<a.length;i++)
    		{
    			if(map.containsKey(a[i]))
    			{
    				map.put(a[i],map.get(a[i])+1);
    			}
    			else {
    				map.put(a[i],1);
    			}
    			
    			
    			
    		}
    		System.out.println(map);
    		
    		
    	}
    	
    	
    	
    	public static void main(String[] args) {
    		int a[]= {4,5,4,5,2,3,4};
    		ProgramDebug d=new ProgramDebug();
    		d.findFrequency(a);
			
		}
}
// } Driver Code Ends


// User function Template for Java


    