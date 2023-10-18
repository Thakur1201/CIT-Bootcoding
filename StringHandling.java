package test;

import java.util.Scanner;
import java.lang.StringBuffer;
public class StringHandling {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter First String: ");
		String first=s1.nextLine();
		System.out.print("Enter Second String: ");
		String second=s1.nextLine();
		
		System.out.print("\nEnter the index of the charater: ");
		int a=s1.nextInt();
		System.out.println("Character at the index "+a+" of first String is: "+first.charAt(a));
		System.out.println("Character at the index "+a+" of second String is: "+second.charAt(a));
		
		System.out.println("\nThe length of the first String is: "+first.length());
		System.out.println("The length of the second String is: "+second.length());
		
		System.out.println("\nFirst String compared to Second String: "+first.compareTo(second));
		
		System.out.println("\nCompares first string with second, ignoring case: "+first.compareToIgnoreCase(second));
		
		System.out.println("\nConcatenates the two Strings: "+first.concat(second));
		
		/**System.out.println("\nEnter a sub-String to Check whether the inputs contain it: ");
		String b=s1.nextLine();
		System.out.println("First string contains "+b+" ? : "+first.contains(b));
		System.out.println("Second string contains "+b+" ? : "+second.contains(b));*/
		
		System.out.println("\nThe First string is Equal to Second string: "+first.equals(second));
		System.out.println("\nThe First string is Equal to second string, ignoring case: "+first.equalsIgnoreCase(second));
		
		System.out.print("\nEnter a String to check whether "+first+" Starts with it: ");
		String c=s1.nextLine();
		System.out.print("Enter a String to check whether "+second+" Ends with it: ");
		String d=s1.nextLine();
		System.out.println("First string starts with "+c+" ? : "+first.startsWith(c));
		System.out.println("Second string ends with "+d+" ? : "+second.endsWith(d));
		
		System.out.println("\nByte value of "+first+" is : "+first.getBytes());
		System.out.println("Byte value of "+second+" is : "+second.getBytes());
		
		System.out.println("\nHash code of "+first+" is :"+first.hashCode());
		System.out.println("Hash code of "+second+" is :"+second.hashCode());
		
		System.out.println("\nFirst index of "+second+" in "+first+" is "+first.indexOf(second));
		System.out.println("Last index of "+second+" in "+first+" is "+first.indexOf(second));
		
		System.out.println("\nIs the First string input is Empty ? :"+first.isEmpty());
		System.out.println("Is the second string input is Empty ? :"+second.isEmpty());
		
		System.out.println("Repalcing "+first+" with "+second+" : "+first.replace(first,second));
		
		System.out.println("\nEnter the start and end index values to extract a sub-String :");
		int e=s1.nextInt();
		int f=s1.nextInt();
		System.out.println("The sub-String extracted from first and second String is :"+first.substring(e, f)+" and "+second.substring(e, f));
		
		System.out.println("\n"+first+" in lower case is : "+first.toLowerCase());
		System.out.println(second+" in upper case is : "+second.toUpperCase());
		
		/**System.out.print("\nEnter an integer value to convert to String :");
		int g=s1.nextInt();
		System.out.println(g+" converted to String is : "+first.toString());*/
		
		System.out.println("\nEnter a String to split the matching input string :");
		String h=s1.nextLine();
		System.out.println(first+" splited as :"+first.split(h));
		
		System.out.println("\nEnter a sentence :");
		String i=s1.nextLine();
		System.out.println("String returned from the sentence is : "+i.intern());
		
		System.out.print("\nEnter a Delimiter : ");
		String j=s1.nextLine();
		System.out.println("Joined "+first+" and "+second+" is : "+first.join(j,first,second));
	}
}
