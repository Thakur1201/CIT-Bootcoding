import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args) {
        int n, reverse = 0;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter any number:");
        n=s1.nextInt();
        int num=n;
            while (n > 0) {
                int remainder = n % 10;
                reverse = (reverse * 10) + remainder;
                n = n / 10;
            }
            if(num==reverse) {
                System.out.println(num+" is a palindrome");
            }
            else
            {
                System.out.println(num+" is not a palindrome");
            }
    }
}
