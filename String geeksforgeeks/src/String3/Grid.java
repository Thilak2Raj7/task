package String3;

import java.util.ArrayList;
import java.util.List;

public class Grid{
	
	public void gridElements(String word,char[][] a)
	{
		int row=a.length;
	    int wordLength=word.length();
	    
	    List<List<Integer>> result=new ArrayList<List<Integer>>();	    
	    for(int i=0;i<row;i++)
	    {
	      int col=a[i].length;
	  
	     for(int j=0;j<col;j++)
	     {
	    
	     for(int dir=1;dir<=8;dir++)
	     {
	    	   String s="";
	        List<Integer> obj=new ArrayList<>();
	        int count=1;
	    	 if(dir==1)//left
	    	 {
	    		 
	    		 int r=i;
   	    	     int c=j;
	            while(count<=word.length())
	    		 {
	            	
	            	
	    			 if(c<0)
	    			 {
	    				 break;
	    			 }
	    			s+=a[r][c]; 
	    			count++;
	    			c--;
	    			 
	    			 
	    		 }
	    		}
	    	   if (dir==2)//right
	    	   {
	    		   
	    		   int r=i;
	   	    	     int c=j;
	    		   while(count<=word.length())
	    		   {
	    			  
	    			   if(c>=col)
	    			   {
	    				   break;
	    			   }
	    			   s+=a[r][c]; 
		    			count++;
		    			c++;
	    			   
	    		   }
	    		  }
	    	   if(dir==3)//top
	    	   {
	    		   int r=i;
	   	    	     int c=j;
	    	   
	    		  while(count<=word.length()) 
	    		  {
	    			  
	    			  if(r<0)
	    			  {
	    				  break;
	    			  }
	    			  s+=a[r][c]; 
		    			count++;
		    			r--;
	    			  
	    		  }
	    	   }
	    	   if(dir==4)//bottom
	    	   {
	    		   
	    		   int r=i;
   	    	       int c=j;
	    		   while(count<=word.length()) 
	    		   {
	    			   if(r>=row)
	    			   {
	    				   break;
	    				   
	    			   }
	    		   s+=a[r][c]; 
	    			count++;
	    			r++;
	    		   
	    	   }
	    	   }
	    	
	        if(dir==5)//top left
	        {
	        	
	        	int r=i;
  	    	     int c=j;
	        	while(count<=word.length())
	        	{
	        		
	        		if(r<0 || c<0)
	        		{
	        			break;
	        		}
	        		 s+=a[r][c]; 
		    			count++;
		    			r--;
		    			c--;
	        		
	        	}
	        }
	        if(dir==6)//top right
	        {
	        	int r=i;
  	    	     int c=j;
	        	while(count<=word.length())
	        	{
	        		
	        		if(r<0 || c>=col  )
	        		{
	        			break;
	        		}
	        		 s+=a[r][c]; 
		    			count++;
		    			r--;
		    			c++;
	        		
	        	}
	        }
	        if(dir==7)//bottom left
	        {
	        	int r=i;
  	    	     int c=j;
	        	while(count<=word.length())
	        	{
	        		
	        		if(c<0 || r>=row)
	        		{
	        			break;
	        		}
	        		 s+=a[r][c]; 
		    			count++;
		    			r++;
		    			c--;
	        	}
	        }
	      
	      if(dir==8)//bottom right
	      {
	    	  int r=i;
	    	     int c=j;
	    	  while(count<=word.length())
	        	{  
	    		  
	    	  if(r>=row || c>=col)
	    	  {
	    		  break;
	    	  }
	    	  s+=a[r][c];
	    	  count++;
	    	  r++;
	    	  c++;
	    	  
	      }
	      }
	     
	      
	    	if(s.equals(word))
	    	{
	    	obj.add(i);
	    	obj.add(j);
	    	
	    	if(!result.contains(obj))
	    	{
	    		result.add(obj);
	    	}
	    	}
	  
	     }
	    }
	}
	    
	    	System.out.print(result);
	   
		
		
	}
	

public void inputGenerator()
{

}
public static void main(String[] args)
 {
	StringGrid obj1=new StringGrid();
	//obj1.inputGenerator();
	char[][] a	= {{'a','b','e'},
	          {'d','b','f'},
	          {'a','h','e'}
};
Grid obj=new Grid();
obj.gridElements("abe",a);
 }
}
