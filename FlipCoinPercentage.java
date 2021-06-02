package core_java_programs;

import java.util.*;

public class FlipCoinPercentage {
public static void main(String[] args) {
	System.out.println("Calculating Winning Percentage of Flip coin");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of times to flip coin: ");
	int Flip=sc.nextInt();
	int Head = 0,Tail = 0;
	for(int i=0; i<Flip;i++)
	{
		double rndm = Math.random();
		if(rndm<0.5)
		{
//			System.out.println("Fliping coin shows Heads");
			Head++;
		}
		else
		{
//			System.out.println("Fliping coin shows Tails");
			Tail++;
		}
	}
	System.out.println("Head Count: "+Head+" and Tail Count: "+Tail);
	double HeadWin=(double) Head*100/Flip;
	System.out.println("Winning of Head is "+HeadWin);
	double TailWin=(double) Tail*100/Flip;
	System.out.println("Winning of Tail is "+TailWin);
}
}
