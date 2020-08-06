package com.odessa.onedarray;

public class Encap {

	public static void main(String[] args) 
	{
		
			Test t = new Test();
			//t.pageno=100;
		//	System.out.println(t.pageno);
			t.setData(50);
			int a=t.getData();
			System.out.println(a);

	}

}
class Test
{
	  private int pageno;
	  public void setData(int x)
	  {
		  if (x>0)
		  {
			  pageno=x;
		  }
		  else
		  {
			  System.exit(0);
		  }
		  }
	  
public int getData()
{
	return pageno;
}
	
}
