import java.util.Scanner;
public class IfElseBlood{
public static void main(String[] args){
int age,weight;
Scanner s1=new Scanner(System.in);
System.out.println("Enter Your age: ");
age=s1.nextInt();
if(age>=20){
System.out.println("Enter Your Weight:");
weight=s1.nextInt();
if(weight>=80){
System.out.println("You are Eligible to Donate Blood");
}else{System.out.println("You are Not Eligible to Donate Blood");
}}else{System.out.println("You are Not Eligible to Donate Blood");}
}
}