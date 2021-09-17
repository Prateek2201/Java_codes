//WAP in Java to compare two strings for equality
import java.util.*;
class p18
{
	public static void main(String[] args)
	{
		String str1,str2;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter first string: ");
		str1= sc.nextLine();
		System.out.print("Enter second string: ");
		str2= sc.nextLine();
		//boolean b= str1.equals(str2);
		boolean b= str1.equalsIgnoreCase(str2);
		if(b==true)
		{
			System.out.println("Both strings are equal");
		}
		else
		{
			System.out.println("Both strings are not equal");
		}
	}
}