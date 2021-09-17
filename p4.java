//WAP in Java to check given number is even or odd.
import java.util.Scanner;
class p4
{
	static public void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=s.nextInt(); 
		if(n%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
	}
}