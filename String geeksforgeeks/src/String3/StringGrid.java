package String3;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import javax.naming.directory.SearchControls;
import javax.sql.rowset.JoinRowSet;
import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.xml.transform.Templates;

public class StringGrid {
	public static void findCharWord( String word,char[][] d){
		int r=d.length;
		int wordLength=word.length();
		ArrayList<ArrayList<Integer>> objArrayList=new ArrayList<>();
		for(int i=0;i<r;i++)
		{
			int col=d[i].length;
			for(int j=0;j<col;j++)
			{
			String s="";
			
			for(int dir=1;dir<=8;dir++)
			{
				ArrayList<Integer> obj1=new ArrayList<>();
				if(dir==1)
				{
					
				int count=1;
				 int row=i;
				 int column=j;
				 while(count<=wordLength)//left
				 {
					if(column<0) 
					{
						break;
					}
					s+=d[row][column];
					count++;
					column--;
				 }
				}
				 if(dir==2)//right
					{
						
					int count=1;
					 int row=i;
					 int column=j;
					 while(count<=wordLength)
					 {
						if(column>=col) 
						{
							break;
						}
						s+=d[row][column];
						count++;
						column++;
					 } 
				 }
				 
				 if(dir==3)//top
					{
						
					int count=1;
					 int row=i;
					 int column=j;
					 while(count<=wordLength)
					 {
						if(row<0) 
						{
							break;
						}
						s+=d[row][column];
						count++;
						row--;
					 } 
				 }
				 if(dir==4)//bottom
					{
						
					int count=1;
					 int row=i;
					 int column=j;
					 while(count<=wordLength)
					 {
						if(row>=r) 
						{
							break;
						}
						s+=d[row][column];
						count++;
						row++;
					 } 
					}
					 if(dir==5)//bottom left
						{
							
						int count=1;
						 int row=i;
						 int column=j;
						 while(count<=wordLength)
						 {
							if(row>=r || column<0) 
							{
								break;
							}
							s+=d[row][column];
							count++;
							row++;
							column--;
						 }
				}
					 if(dir==6)//bottom right
						{
							
						int count=1;
						 int row=i;
						 int column=j;
						 while(count<=wordLength)
						 {
							if(row >=r ||column>=col) 
							{
								break;
							}
							s+=d[row][column];
							count++;
							row++;
							column++;
						 }
						}
						 if(dir==7)//top right
							{
								
							int count=1;
							 int row=i;
							 int column=j;
							 while(count<=wordLength)
							 {
								if(row<0 || column>=col) 
								{
									break;
								}
								s+=d[row][column];
								count++;
								row--;
								column++;
							 }
				}
			
						 if(dir==8)//top left
							{
								
							int count=1;
							 int row=i;
							 int column=j;
							 while(count<=wordLength)
							 {
								if(row<0 || column<0) 
								{
									break;
								}
								s+=d[row][column];
								count++;
								row--;
								column--;
							 }
							}
			
		
			
						if(s.equals(word))
						{
						obj1.add(i);
						obj1.add(j);
						
						
						if(!objArrayList.contains(obj1))
						{
							objArrayList.add(obj1);
						}
					}
			obj1.clear();
			s="";
			}
			}	
		}
			
			for(int k=0;k<objArrayList.size();k++)
			{
		       for(int h=0;h<2;h++)
		       {
				System.out.print((int)objArrayList.get(k).get(h));
			}
			}
		}

	public void inputGenerator()
	{
	char[][] a	= {{'a','b','c'},
		          {'d','e','f'},
		          {'g','h','i'}
	};
	//Grid obj=new Grid();
	//obj.gridElements("abc",a);
	}
	public static void main(String[] args)
	 {
		StringGrid obj1=new StringGrid();
		obj1.inputGenerator();
		
//		Scanner scan=new Scanner(System.in);
//		 String word="abc";
//		 int n=scan.nextInt();
//		 int m=scan.nextInt();
//		 char[][] d= new char[n][m] ;
//		 for(int i=0;i<n;i++)
//		 {
//			 for(int j=0;j<m;j++)
//			 {
//				d[i][j]=scan.next().charAt(0);
//			 }
//		}
//		 
//		 for(int i=0;i<n;i++)
//		 {
//			 for(int j=0;j<m;j++)
//			 {
//				System.out.print(d[i][j]);
//			 }
//			 System.out.println();
//		}
//		 System.out.println(d.toString());
//		 System.out.println( Arrays.deepToString(d));
//		 
//		 
////				 {'a','b','c'},
////				 {'d','e','f'},
////				 {'g','h','i'}
////		 };
//		 findCharWord(word,d);
	 }
 }

	 
 
