//WAP in Java to prepare a list of 10 numbers, now find biggest numeber of list
import java.util.*;
class p16
{
	public static void main(String [] args)
	{
		int [] list=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers to the list: ");
		for(i=0;i<10;i++)
		{
			list[i]=sc.nextInt();
		}
		Arrays.sort(list);
		System.out.println("Smallest number= "+list[0]);
		System.out.println("Greatest number= "+list[9]);
	}
}