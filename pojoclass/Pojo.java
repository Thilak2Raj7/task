package pojoclass;

public class Pojo {
private String name;
private int id;
public String getName()
{ 
	return name;
}
public int getId()
{
	return id;
	
}

public Pojo(String name,int id)
{
this.name=name;
this.id=id;
}
public Pojo()
{
	
}
public void setName(String name)
{
	this.name=name;
}
public void setId(int id)
{
this.id=id;
}
public String toString()
{
	return name +" "+ id;
}
}
