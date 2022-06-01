package com.eample.AddtonApp;

//Data Shadowing

public class Test 
{
	int x=10; // instance variable
	
	
	void show(Test t)
	{
		
		 int x=20; //local varible 
		 System.out.println(t.x);
		 System.out.println(x);
		
	}


	public static void main(String[] args) 
	{
		Test t=new Test();
		t.show(t);

		
	}

}
