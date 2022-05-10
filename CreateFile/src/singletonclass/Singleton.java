package singletonclass;

public class Singleton {
	private static Singleton object;
	public Singleton()
	{
	System.out.println("10");
	}
  public static Singleton method()
  {
	if (object== null)
		 {
		synchronized (Singleton.class)
		{
		if (object== null)
		{
		 object=new Singleton();
	}
	  }
		 }
return object;
  }
}
