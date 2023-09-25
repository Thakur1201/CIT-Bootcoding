import java.util.Scanner;
public class IfElseEqual{
public static void main(String [] args){
int a,b;
Scanner s1=new Scanner(System.in);
System.out.println("Enter First number: ");
a=s1.nextInt();
System.out.println("Enter Second number: ");
b=s1.nextInt();
if(a==b){
System.out.println("The two numbers entered are Equal");}
else{
System.out.println("The two numbers entered are Not Equal");}
}
}