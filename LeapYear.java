package core_java_programs;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Checking given year is leap year or not");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year ");
		int yr=sc.nextInt();
		if (yr%4==0 && (yr%100!=0 || yr%400==0))
		{
			System.out.println(yr+" is a Leap Year");
		}
		else
		{
			System.out.println(yr+" is not a Leap Year");
		}
}
}