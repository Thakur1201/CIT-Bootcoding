import java.util.Scanner;
public class MaxElement {
    public static void main(String [] args){
        int num[];
        int size;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=s1.nextInt();
        num=new int[size];
        int max=num[0];
        for(int j=0;j<size;j++){
            System.out.println("Enter array elements:");
            num[j]=s1.nextInt();
        }
        for(int i=0;i<size;i++){
            if(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("maximum element is "+ max);
    }
}