package core_java_programs;

import java.util.*;

public class BigOf3Int {
public static void main(String[] args) {
	System.out.println("Program to Find the Largest Among Three Numbers");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Number");
	int a=sc.nextInt();
	System.out.println("Enter the Second Number");
	int b=sc.nextInt();
	System.out.println("Enter the Third Number");
	int c=sc.nextInt();
	if (a>b)
	{
		if(a>c)
		{
			System.out.println(a+" is the biggest number");
		}
		else
		{
			System.out.println(c+" is the biggest number");
		}
	}
	else if (b>c)		
	{
		System.out.println(b+" is the biggest number");
	}
	else
	{
		System.out.println(c+" is the biggest number");
	}
}
}
