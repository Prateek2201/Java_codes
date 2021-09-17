//WAP in Java to take array elements from user and display it
import java.util.*;
class p13
{
	public static void main(String [] args)
	{
		int [] x=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five numbers to the list: ");
		for(i=0;i<5;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("You have enetred following numbers: ");
		for(i=0;i<5;i++)
		{
			System.out.println(x[i]);
		}
	}
}