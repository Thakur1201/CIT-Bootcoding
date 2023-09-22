import java.util.Scanner;
public class Arithmetic
{
public static void main(String [] args)
{
int a,b;
char ch;
Scanner s1=new Scanner(System.in);
System.out.println("Select Operater: (+,-,/,%,*)");
ch=s1.next().charAt(0);
System.out.println("Enter First number:");
a=s1.nextInt();
System.out.println("Enter Second Number:");
b=s1.nextInt();
switch(ch){
case '+':
System.out.println("Addition ="+(a+b));
break;
case '-':
System.out.println("Subtraction ="+(a-b));
break;
case '*':
System.out.println("Multiplication ="+(a*b));
break;
case '/':
System.out.println("Division ="+(a/b));
break;
case '%':
System.out.println("Remainder ="+(a%b));
break;
default:
System.out.println("Invalid Operater");
}
}
}