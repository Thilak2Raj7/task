
public class String2 {
	
	
	
	          // your code here
		
			    public static int minimumNumberOfDeletions(String S) {
			        int count=0;
			        int j=S.length()-1;
			        int length=S.length()/2;
			      String arr="";
			        String remove="";
			        for(int i=0;i<=length;i++)
			        {
			           
			          if(  S.charAt(i)==S.charAt(j))
			          {
			              arr=String.valueOf(S.charAt(i));
			              j--;
			          }
			            
			           else
			           {
			             remove+=String.valueOf(S.charAt(i))+String.valueOf(S.charAt(j));
			              System.out.println(remove);
			              System.out.println(j);
			               j--;
			               System.out.println(j);
			           }
			              
			            
			        }
			        for(int i=0;i<remove.length();i++)
			        {
			            count++;
			            
			        }
			        return count;
			        //your code here
			    }
			
	 public static void main(String[] args)
	 {
		String2 obj=new String2();
		System.out.println(minimumNumberOfDeletions("fk"));
	 }
}
