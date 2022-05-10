package String3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.naming.AuthenticationException;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;
import java.util.Scanner;
//Java program to find minimum number 
//of insertions to make a string 
//palindrome 
public class Palindrome { 

	

  public static void main(String[] args){
   	 Scanner scan=new Scanner(System.in);
     int[] arr=new int[5];
     int[] output=new int[5];
 	 for(int i=0;i<arr.length;i++)
 	{
 	  System.out.println("Enter the number");
 	  arr[i]=scan.nextInt();
 	}
 	 System.out.println("Enter D1"
 	 		+ "");
 	 int D=scan.nextInt();
 	 for(int i=D;i<arr.length;i++)
 	 {
 	   output[i]=arr[i];
 	   System.out.print(output[i]);
 	 }
 	 for(int i=0; i<D;i++)
 	 {
 	       output[i]=arr[i];
 	       System.out.print(output[i]);
 	 }
  }
  }
