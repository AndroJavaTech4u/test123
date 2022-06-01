package com.eample.AddtonApp;

public class Student 
{

	String name;
	int age;
	
	Student(String name,int age)
	{
	this.name=name;
	this.age=age;	
	}
	
	void show()
	{
		System.out.println(name);
		System.out.println(age);
		
	}
	
	
	public static void main(String[] args) 
	{
		Student s=new Student("ram",23);
		s.show();
		
	}

}
