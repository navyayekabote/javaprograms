package com.shristi.objbasics;

public class Student {
	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void Details()
	{
		System.out.println("Student name is "+name);
		System.out.println("Department "+department);
	}
	int sum=0;
	int average=0;
	String grade;
	String getGrades(int[] marks)
	{
		System.out.println("marks are");
		for(int mark:marks)
		{
			sum+=sum+mark;
			System.out.println(mark);
		}
		average=sum/(marks.length-1);
		if(average>=80)
			return "grade is A";
		else if(average>=60&&average<=80)
		return "grade is B";
		else if(average>=40&&average<=60)
			return "grade is c";
		else
			return "result is fail";
	}
}
