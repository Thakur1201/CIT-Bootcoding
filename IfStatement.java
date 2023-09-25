import java.util.Scanner;
public class IfStatement{
public static void main(String [] args){
int a;
Scanner s1=new Scanner(System.in);
System.out.println("Enter your Age: ");
a=s1.nextInt();
if(a>=18){
System.out.println("You are an Adult");}
if(a<18){
System.out.println("You are Underage");}
}
}