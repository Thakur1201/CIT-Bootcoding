import java.util.Scanner;
public class PosiNeg{
public static void main(String[] args){
int a;
Scanner s1=new Scanner(System.in);
System.out.println("Enter a Number: ");
a=s1.nextInt();
if(a>0){
System.out.println("Entered Number is Positive");
}else if(a==0){System.out.println("Entered Number is Zero");
}else{System.out.println("Entered Number is Negative");}
}
}