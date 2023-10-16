import java.util.Scanner;

public class MatrixAdd{
public static void main(String[] args){
int A[][]=new int[3][3];
int B[][]=new int[3][3];
Scanner s1=new Scanner(System.in);
System.out.println("Enter Values for Matrix A:");

for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print("Enter the Value of a["+i+"]["+j+"]= ");
A[i][j]=s1.nextInt();}
}

System.out.println("\nEnter Values for Matrix B:");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print("Enter the Value of b["+i+"]["+j+"]= ");
B[i][j]=s1.nextInt();}
}

System.out.println("\nMatrix A is");
for(int i=0;i<3;i++){
System.out.print("[");
for(int j=0;j<3;j++){
System.out.print(A[i][j]+",");}
System.out.print("]\n");}

System.out.println("\nMatrix B is");
for(int i=0;i<3;i++){
System.out.print("[");
for(int j=0;j<3;j++){
System.out.print(B[i][j]+",");}
System.out.print("]\n");}

System.out.println("\nAddition of Matrix A and Matrix B is");
for(int i=0;i<3;i++){
System.out.print("[");
for(int j=0;j<3;j++){
System.out.print(((A[i][j])+(B[i][j]))+",");}
System.out.print("]\n");}

}}
