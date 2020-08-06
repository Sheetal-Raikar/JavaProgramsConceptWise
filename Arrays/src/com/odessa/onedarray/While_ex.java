package com.odessa.onedarray;

public class While_ex {

	public static void main(String[] args) {
		int i=0;
/*while (i<9) {
if(i==3)
	System.out.println(i);
	i++;
	continue;
}
System.out.println("out of loop");*/
		do
		{
			System.out.println(i);
			i++;
		}while(i<9);
	
	
	int[] x1 = {2,4,6,8} ;
	for(int x:x1)
	{
		System.out.println(x);
	}
	
	String[] s1= {"red","yellow","blue"};
	for(String s:s1) {
		System.out.println(s);
	}
}

}
