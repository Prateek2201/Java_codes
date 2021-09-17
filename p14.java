//WAP in Java to find sum of ten numbers using array
import java.util.*;
class p14
{
	public static void main(String [] args)
	{
		int [] arr=new int[10];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ten numbers to the list: ");
		for(i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("Sum of ten elements of array= "+sum);
	}
}