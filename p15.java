//WAP in Java to take five names as input and display names in sorted order
import java.util.*;
class p15
{
	public static void main(String [] args)
	{
		String [] names=new String[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter five names: ");
		for(i=0;i<5;i++)
		{
			names[i]=sc.nextLine();
		}
		Arrays.sort(names);
		System.out.println("Names in sorted order: ");
		for(i=0;i<5;i++)
		{
			System.out.println(names[i]);
		}
	}
}
