import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=s1.nextInt();
        int result=1;
        for(int i=n;i>0;i--)
        {
            result=result*i;
        }
        System.out.print("factorial of "+n+" is "+result);
    }
}