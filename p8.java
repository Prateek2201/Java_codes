//WAP in Java to print the table of given number.
import java.util.*;
class p8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);		
		int n,i,t;
		System.out.print("Enter a number to print the table: ");
		n=sc.nextInt();
		i=1;
		while(i<=10)
		{
			t=n*i;
			System.out.println(n+"*"+i+" = "+t);
			i++;
		}
	}
}