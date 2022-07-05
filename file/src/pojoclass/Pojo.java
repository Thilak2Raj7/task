package pojoclass;
import utilityclass.Utility;
import exception.CustomException;


//import java.lang.reflect.*;
public class Pojo {
private String name;
private int id;
public String getName()
{ 
System.out.println("msg");
	return name;
}

public int getId()
{
	return id;
}

public  Pojo(String name,int id)throws CustomException
{
	Utility.checkString(name);
this.name=name;
this.id=id;

System.out.println(name+"\n"+id);
}

public Pojo()
{
	System.out.println("c");
}

public void setName(String name)throws CustomException
{
	Utility.checkString(name);
	this.name=name;

}
public void setId(int id)//nullcheck
{
this.id=id;
}

public String toString()
{
	return name +" "+ id;
}
}