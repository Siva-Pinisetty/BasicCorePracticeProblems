package core_java_programs;
import java.util.*;
public class SumOf3is0 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of Elements(>5): ");
	int nmb=sc.nextInt();
	triplet(nmb);
}
public static void triplet(int nmb) {
	Random random = new Random();
	int[]arr=new int[nmb];
	for(int i=0;i<nmb;i++)
	{	
		int ran = random.nextInt(99)-50;
		arr[i]=ran;
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int count=0;
	for(int a=0;a<(nmb-2);a++)
		for(int b=1;b<(nmb-1);b++)
			for(int c=2;c<(nmb);c++)
			{
				if (arr[a]+arr[b]+arr[c]==0)
				{
					count++;
					System.out.println(count+":"+"{"+arr[a]+","+arr[b]+","+arr[c]+"}");
				}
			}
	System.out.println("Total count of Triplets: "+count);
}
}
