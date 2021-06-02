package core_java_programs;

import java.util.*;

public class Quotient_Remainder {
public static void main(String[] args) {
	System.out.println("Finding the Quotient and Remiander of a number");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to find Quotient and Remiander");
	int nmb=sc.nextInt();
	for(int i=2; i<=nmb/2+1; i++)
	{
		int qtnt=nmb/i;
		int rmnd=nmb%i;
		System.out.println("For "+nmb+"/"+i+": Quotient = "+qtnt+"; Remainder is "+rmnd+";");
	}
}
}
