package test;

import java.util.Scanner;
public class Rectangle implements Area,Perimeter{
	static double length,breadth;
	
	public void perimeter() {
		System.out.print("Perimeter of Rectangle is: "+(2*(length+breadth)));
	}
	public void area() {
		System.out.println("\nArea of Rectangle is: "+(length*breadth));
	}
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);	
		System.out.print("Enter value of Length: ");
		length=s1.nextDouble();
		System.out.print("Enter value of Breadth: ");
		breadth=s1.nextDouble();
		Rectangle r1=new Rectangle();
		r1.perimeter();
		r1.area();
	}
}
