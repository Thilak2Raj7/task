package task3;
import java.util.Scanner;

public class Input
{
Scanner scan=new Scanner(System.in);
public String inputString="";
public String inputString1="";
public int number;
public char letter;
public void getstring()
{
inputString=scan.nextLine();
}

public void getsubstring()
{
inputString1=scan.nextLine();
}

public void getint()
{
number=scan.nextInt();
}

public void getchar()
{
letter=scan.next().charAt(0);
}

public String multi()//14th task
{
inputString=scan.nextLine();
return inputString;
}

public String multiple()//15th task
{
//String su="";
inputString=scan.nextLine();
String sub=inputString.replace(" ","");
//while(true)
//{
//s=sc.nextLine();
//if (s.equals("stop")) break;
//su=su.concat(s);
//}
return sub;
}
public void enclose(String string)//16th task
{
String [] stringArray=string.split(" ");
for (String sub:stringArray)
{
System.out.println(sub);
}
}

public String mergeString(String string)//17th task
{
//while(true)
//{
inputString=scan.nextLine();
String sub=inputString.replace(" ",string);
//}
return sub;
}

public boolean check(String string)
{
 boolean bool=string.isEmpty();
 return bool;
}
}

