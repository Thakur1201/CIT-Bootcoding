import java.util.Scanner;
public class Relational{
public static void main(String [] args){
int a,b;
Scanner s1=new Scanner(System.in);
System.out.println("Enter First number:");
a=s1.nextInt();
System.out.println("Enter Second number:");
b=s1.nextInt();
if(a>b){
System.out.println(a+" is Greater than "+b);
}else{
System.out.println(a+" is Less than "+b);
}
if(a==b){
System.out.println(a+" is Equal to "+b);
}else{
System.out.println(a+" is Not Equal to "+b);
}
if(a<=b){
System.out.println(a+" is Less Than or Equal to "+b);
}else{
System.out.println(a+" is Greater Thanor Equal to "+b);
}
}}