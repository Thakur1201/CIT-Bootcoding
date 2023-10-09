package test;

import java.util.Scanner;

public class MathTable {
	public static void main(String[] args) {
		int a=1,num,result;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number whose table is required:");
		num=s1.nextInt();
		do {
			result=num*a;
			System.out.println(num+" * "+a+" = "+result);
			a++;
		}while(a<=10);
	}
}