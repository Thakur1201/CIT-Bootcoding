import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=s1.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.print(i+"\t");
        }
    }
}
