import java.util.Scanner;
public class Test{
public static void main(String [] args){
int a,b;
Scanner s1=new Scanner(System.in);
System.out.println("Enter First number:");
a=s1.nextInt();
System.out.println("Value of a= is: "+a);
System.out.println("Value of a+=5 is: "+(a+=5));
System.out.println("Value of a-=5 is: "+(a-=5));
System.out.println("Value of a*=5 is: "+(a*=5));
System.out.println("Value of a/=5 is: "+(a/=5));
System.out.println("Value of a%=5 is: "+(a%=5));
}
}
