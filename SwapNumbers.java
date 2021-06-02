package core_java_programs;

import java.util.*;

public class SwapNumbers {
public static void main(String[] args) {
	System.out.println("Swapping of 2 numbers with out other variable");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number 'x': ");
	int x=sc.nextInt();
	System.out.println("Enter the number 'y': ");
	int y=sc.nextInt();
	System.out.println("Value of x: "+x+" & y: "+y+" before swaping");
	x=x*y;
	y=x/y;
	x=x/y;
	System.out.println("Value of x: "+x+" & y: "+y+" after swaping");
}
}
