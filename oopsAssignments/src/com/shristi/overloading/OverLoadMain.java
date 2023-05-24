package com.shristi.overloading;
import java.util.*;
public class OverLoadMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String name=sc.next();
		System.out.println("Enter the designation");
		String designation=sc.next();
		if(designation.equalsIgnoreCase("Programmer"))
		{
		Employee employee=new Employee(name,designation);
		System.out.println("Bonus is");
		 System.out.println( employee.calcBonus(7000));
		}
		else if(designation.equalsIgnoreCase("Manager"))
		{
			Employee employee1=new Employee(name,designation);
			System.out.println("Bonus is");
			System.out.println(employee1.calcBonus(6000,800));
		}
		else if(designation.equalsIgnoreCase("Director"))
		{
			Employee employee2=new Employee(name,designation);
			System.out.println("Bonus is");
			System.out.println(employee2.calcbonus(3544,450,4540));
		}
		
	}

}
