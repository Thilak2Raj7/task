package String3;

public class FirstNonRepeatingCharacter {
 public String findCharacter(String S)
 {
	 String t="";
	 int j=0;
	 char[] c=new char[S.length()];
	 System.out.println(S);
	 char[] ch=S.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	    int index=S.indexOf(ch[i]);
	    int last=S.lastIndexOf(ch[i]);
		 if(index==last)
		 {
			t+=ch[i];
			
		 }
	    }
	  
	  if(t.length()==0)
	  {
		 t="No Matching Character";
		return t;
	  }
	   t=String.valueOf(t.charAt(0));
		return t; 
	}
	  
	   
	 
 

public static void main(String[] args)
{
String S="character";
FirstNonRepeatingCharacter objCharacter=new FirstNonRepeatingCharacter();
System.out.println(objCharacter.findCharacter(S));
	
}	
}

