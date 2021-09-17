//WAP in Java to check whether the given number is Prime or not
import java.util.Scanner;
class Prime
{
	public static void main(String[] args)
	{
		int n,i,mid,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number to find the Prime Number: ");
		n= sc.nextInt();
		mid=n/2;
		for(i=2;i<=mid;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}	
		}	
		if(flag==0)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is not a Prime Number");
	}
}