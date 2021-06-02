package core_java_programs;
import java.util.*;
public class Array2D {
public static void main(String[] args) {
	System.out.println("Creating a 2 Dimensional array");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no.of Rows: ");
	int m=sc.nextInt();
	System.out.println("Enter the no.of Columns: ");
	int n=sc.nextInt();
	array(m,n);
}	
public static void array(int m,int n) {
	int[][] arr = new int [m][n];
	int k=1;
	for(int i=0; i < m; i++)
	{
		for(int j=0; j < n; j++)
		{
			arr[i][j]=k;
			System.out.print("arr[" + i + "][" + j + "]="+ arr[i][j] + "  ");
			k++;
		}
		System.out.println();
	}
//	System.out.println(+arr[1][1]);
}
}
