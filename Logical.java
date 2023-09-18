import java.util.Scanner;
public class Logical{
public static void main (String [] args){
	int a, b, c;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter first number:");
	a=s1.nextInt();
	System.out.println("Enter second number:");
	b=s1.nextInt();
	System.out.println("Enter third number:");
	c=s1.nextInt();
	if((a>b)&&(b>c)){
	System.out.println(a+" is the greatest number");
	}
	else if((b>c)&&(c>a)){
	System.out.println(b +" is greatest number");
	}
	else if((a>b)&&(a>c)){
		System.out.println(a+" is greatest number");
	}
	else if((b>a)&&(b>c)){
		System.out.println(b+" is greatest number");
	}
	else{
	System.out.println(c+" is greatest number");
}}
}