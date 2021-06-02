package core_java_programs;

import java.util.*;

public class EvenOdd {
public static void main(String[] args) {
	System.out.println("Checking whether the number is Even or Odd");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number: ");
	int nmb=sc.nextInt();
	if(nmb%2==0)
	{
		System.out.println(nmb+" is a Even Number");
	}
	else
	{
		System.out.println(nmb+" is a Odd Number");
	}	
}
}