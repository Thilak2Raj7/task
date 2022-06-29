package DesignBoard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayGame {
Map<Integer,Map<Character,String>> chess=new HashMap<>();
List<String> listObj=new ArrayList<>();
	public PlayGame()
	{
	
		 Map<Character,String> column1=chess.get(1);
		 column1=new HashMap();
		 column1.put('a', "W_R");
		 column1.put('b', "W_N");
		 column1.put('c', "W_B");
		 column1.put('d', "W_Q");
		 column1.put('e', "W_K");
		 column1.put('f', "W_B");
		 column1.put('g', "W_N");
		 column1.put('h', "W_R");
		 chess.put(1, column1);
		 Map<Character,String> column2=chess.get(2);
		 column2=new HashMap();
		 column2.put('a', "W_P");
		 column2.put('b', "W_P");
		 column2.put('c', "W_P");
		 column2.put('d', "W_P");
		 column2.put('e', "W_P");
		 column2.put('f', "W_P");
		 column2.put('g', "W_P");
		 column2.put('h',  "W_P");
		
		 chess.put(2, column2);
		
	  Map<Character,String> column3=chess.get(3);
	  column3=new HashMap();
		 column3.put('a',"");
		 column3.put('b',"");
		 column3.put('c',"");
		 column3.put('d',"");
		 column3.put('e',"");
		 column3.put('f',"");
		 column3.put('g',"");
		 column3.put('h', "");
	  chess.put(3, column3);
	  Map<Character,String> column4=chess.get(4);
	  column4=new HashMap();
		 column4.put('a',"");
		 column4.put('b',"");
		 column4.put('c',"");
		 column4.put('d',"");
		 column4.put('e',"");
		 column4.put('f',"");
		 column4.put('g',"");
		 column4.put('h', "");
	  chess.put(4, column4);
	  Map<Character,String> column5=chess.get(5);
	  column5=new HashMap();
		 column5.put('a',"");
		 column5.put('b',"");
		 column5.put('c',"");
		 column5.put('d',"");
		 column5.put('e',"");
		 column5.put('f',"");
		 column5.put('g',"");
		 column5.put('h', "");
	  chess.put(5, column5);
	  Map<Character,String> column6=chess.get(6);
	  column6=new HashMap();
		 column6.put('a',"");
		 column6.put('b',"");
		 column6.put('c',"");
		 column6.put('d',"");
		 column6.put('e',"");
		 column6.put('f',"");
		 column6.put('g',"");
		 column6.put('h', "");
	  chess.put(6, column6);
		 Map<Character,String> column7=chess.get(7);
		 column7=new HashMap();
		 column7.put('a', "B_P");
		 column7.put('b', "B_P");
		 column7.put('c', "B_P");
		 column7.put('d', "B_P");
		 column7.put('e', "B_P");
		 column7.put('f', "B_P");
		 column7.put('g', "B_P");
		 column7.put('h', "B_P");
		
		 chess.put(7, column7);
		 Map<Character,String>column8=chess.get(8);
		 column8=new HashMap();
		 column8.put('a', "B_R");
		 column8.put('b', "B_N");
		 column8.put('c', "B_B");
		 column8.put('d', "B_Q");
		 column8.put('e', "B_K");
		 column8.put('f', "B_B");
		 column8.put('g', "B_N");
		 column8.put('h', "B_R");
		 chess.put(8, column8);
		 
	printChess();	
	 }
		

public void printChess()
{
	System.out.println("  "+"a  "+" "+"b  "+" "+"c  "+" "+"d  "+" "+" "+"e  "+" "+"f  "+" "+"g  "+" "+"h  " );
     
	for(int key:chess.keySet())
	{
	
		
	Map<Character,String> mapObj1=chess.get(key);
	System.out.print(key+" ");
	for(char ch:mapObj1.keySet())
	{
	
	String coin=mapObj1.get(ch);
	System.out.print(coin+" ");
	}
	System.out.println();
}
	
}
public String getPosition(String coin)
{
String position="";	

	for(int key:chess.keySet())
	{
		Map<Character,String> mapObj1=chess.get(key);
		for(char ch:mapObj1.keySet())
		{
			if(coin.equals(mapObj1.get(ch)))
			{
				position+=ch+String.valueOf(key);
			}
		}
		
	}
	System.out.println("position"+position);
	return position;
}
public List<String> kingPosition(String position)
{
	int[] row= {1,1,0,-1,-1,-1,0,1};
	int[] column={0,1,1,1,0,-1,-1,-1};
	for(int i=0;i<8;i++)
	{
	 char pos=(char) ( position.charAt(0)+row[i]);
	 int col1=Integer.parseInt(position.charAt(1)+"")+column[i]	;
	 listObj.add(pos+String.valueOf(col1));
	}
	return listObj;
}
public List<String> rookPosition(String position)
{
	int i=0;
	int[] row={0,1,0,-1};
	int[]col={ 1,0,-1,0};
     while(i<4 )   
     {
     System.out.println("i value"+i);
	 char pos=(char) ( position.charAt(0)+row[i]);
	 int col1=Integer.parseInt(position.charAt(1)+"")+col[i];
	 if(col[i]==1)
	 {
	 while(col1<=8&& col1>0)
	 {
	 listObj.add(pos+String.valueOf(col1));
	 System.out.println(listObj);
	 col1++;
     }
	 
     } 
	 if(col[i]==-1)
	 {
		while(col1<=8 && col1>0) 
		{
			listObj.add(pos+String.valueOf(col1));
			col1--;
		}
	 }
	 if(row[i]==1)
	 {
		 while(pos >='a' && pos<='h')
		 {
			listObj.add(pos+String.valueOf(col1));
			 System.out.println(listObj);
			pos=(char) (pos+1);
		 }
		 }
	 if(row[i]==-1)
	 {
		 while(pos >='a' && pos<='h')
		 {
			listObj.add(pos+String.valueOf(col1));
			 System.out.println(listObj);
			pos=(char) (pos-1);
		 }
		 }
	 i++;
	 }
     System.out.println("List"+listObj);
	return listObj;
	
}
public void bishopPosition(String position) 
{
	int i=0;
int[] row= {1,-1,-1,1};	
int[] col= {1,1,-1,-1};
	while(i<4)
	{
	 char pos=(char) ( position.charAt(0)+row[i]);
     int col1=Integer.parseInt(position.charAt(1)+"")+col[i];
     if(row[i]==1 && col[i]==1)
     {
    	while((col1<=8 && col1>=1) && (pos >='a' && pos<='h'))
    	{
    		listObj.add(pos+String.valueOf(col1));
    		col1++;
    		pos=(char)(pos+1);
    		System.out.println(listObj);
    	}
    	 
     }
     if(row[i]==-1 && col[i]==1)
     {
    	 while((col1<=8 && col1>=1) && (pos >='a' && pos<='h')) 
    	 {
    		 listObj.add(pos+String.valueOf(col1));S
     		col1--;
     		pos=(char)(pos+1); 
     		System.out.println(listObj);
    	 }
    	 
    	 
     }
     if(row[i]==-1 && col[i]==-1)
     {
    	 while((col1<=8 && col1>=1) && (pos >='a' && pos<='h')) 
    	 {
    		 listObj.add(pos+String.valueOf(col1));
     		col1--;
     		pos=(char)(pos-1);
     		System.out.println(listObj);
    	 }
    	 
     }
     if(row[i]==1 && col[i]==-1)
     {
    	 while((col1<=8 && col1>=1) && (pos >='a' && pos<='h')) 
    	 {
    		 listObj.add(pos+String.valueOf(col1));
     		col1++;
     		pos=(char)(pos-1); 
     		System.out.println(listObj);
    	 }
     }     
     i++;
	}
	System.out.println(listObj);
}
public void movePosition(int rowPos ,int colPos)
{
}
}
