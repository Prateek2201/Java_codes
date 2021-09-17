//WAP in Java to find factorial of given number.
import java.util.Scanner;
class p9
{
	public static void main(String[] args)
	{
	int n,i,f=1;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number to find factorial: ");
	n=sc.nextInt();
	for(i=n;i>0;i--)
	{
		f*=i;	//f=f*i;
	}
		System.out.println("The factorial of "+n+" = "+f);
	}
}