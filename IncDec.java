import java.util.Scanner;
public class IncDec{
	public static void main(String[] args)
	{
		int a,temp;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=s1.nextInt();
		temp=a;
		a++;
		System.out.println("Incremented value is: "+a);
		temp--;
		System.out.println("Dremented value is: "+temp);
	}
}