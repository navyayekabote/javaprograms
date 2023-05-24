package com.shristi.objbasics;
import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an student name");
		String name=sc.next();
		System.out.println("Enter an department");
		String department=sc.next();
		System.out.println("Enter marks");
		int[] marks= new int[5];
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		Student student=new Student(name,department);
		student.Details();
		System.out.println(student.getGrades(marks));
		System.out.println("Enter an student name");
		String name1=sc.next();
		System.out.println("Enter an department");
		String department1=sc.next();
		System.out.println("Enter marks");
		int[] marks1= new int[5];
		for(int i=0;i<marks1.length;i++)
		{
			marks1[i]=sc.nextInt();
		}
		student.Details();
		System.out.println(student.getGrades(marks1));

	}

}
