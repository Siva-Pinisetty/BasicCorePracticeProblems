package core_java_programs;
import java.util.*;
public class DistanceEuclidean {
public static void main(String[] args) {
	System.out.println("Calculating Euclidean Distance");
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value of x in cartesian point:");
	int x=sc.nextInt();
	System.out.println("enter the value of y in cartesian point:");
	int y=sc.nextInt();
	Eucl_dist(x,y);
}
public static void Eucl_dist(int x,int y) {
	float dist=(float) Math.sqrt((x*x)+(y*y));
	System.out.println("Euclidean Distance of ("+x+","+y+") is "+dist);
}
}
