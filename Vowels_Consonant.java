package core_java_programs;
import java.util.*;
public class Vowels_Consonant {
public static void main(String[] args) {
	System.out.println("Checking whether the alphabet is Vowel or Consonant");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the alphabet: ");
	char ch=sc.next().charAt(0);
	if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
	{
		System.out.println("The given alphabet '"+ch+"' is a Vowel");
	}
	else
	{
		System.out.println("The given alphabet '"+ch+"' is a Consonant");
	}
}
}
