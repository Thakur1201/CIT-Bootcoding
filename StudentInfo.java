package test;

import java.util.Scanner;
public class StudentInfo {
	static Scanner s1=new Scanner(System.in);
	public void inputInfo() {
		System.out.println("---Student Info---");
		System.out.print("Name: ");
		String name=s1.nextLine();
		System.out.print("Roll No.: ");
		int rollno=s1.nextInt();
		System.out.print("Branch: ");
		String branch=s1.nextLine();
	}
}