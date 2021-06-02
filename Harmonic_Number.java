package core_java_programs;

import java.util.*;

public class Harmonic_Number {
public static void main(String[] args) {
	System.out.println("Printing the Harmonic Number");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find the harmonic number: ");
	int i,nmb=sc.nextInt();
	double H = 0;
	for( i=1;i<=nmb;i++)
	{
		H=(double) 1/i+H ;
		System.out.println("Harmonic number of position "+(i)+" is "+H);
	}
}
}
