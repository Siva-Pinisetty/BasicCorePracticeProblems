package core_java_programs;

import java.util.*;

public class PowersOf2 {
public static void main(String[] args) {
	System.out.println("Printing the table for Powers of 2");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to print powers of 2: ");
	int nmb=sc.nextInt();
	for(int i=0;i<=nmb;i++)
	{
		int val= (int) Math.pow(2, i);
		System.out.println("2 Power of "+i+" is "+val);	
	}
}
}
