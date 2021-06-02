package core_java_programs;

import java.util.*;

public class Prime_Factors {
public static void main(String[] args) {
	System.out.println("Finding the Prime Factors");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find prime factors: ");
	int nmb=sc.nextInt();
	for(int i=2; i<=nmb; i++)
	{
		while(nmb%i == 0)
		{
			System.out.print(i+" ");
			nmb=nmb/i;
		}
	}
	System.out.println("are the prime factors for given number");
}
}
