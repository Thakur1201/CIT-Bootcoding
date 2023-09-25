import java.util.Scanner;
public class IfElse{
public static void main(String [] args){
int a;
Scanner s1=new Scanner(System.in);
System.out.println("Enter a number: ");
a=s1.nextInt();
if(a%2==0){
System.out.println("The number "+a+" is Even");}
else{
System.out.println("The number "+a+" is Odd");}
}
}