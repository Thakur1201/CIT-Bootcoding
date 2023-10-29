package test;

import java.util.Scanner;
public class Employee {
	Scanner s1=new Scanner(System.in);
	static float salary;
	public void input() {
		System.out.println("Enter Base Salary of the Employee: ");
		salary=s1.nextFloat();
	}
}