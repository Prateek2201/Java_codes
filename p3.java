import java.util.*;
class p3
{
	public static void main(String [] a)
	{
		int n1,n2,sum,sub,mult,div;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		n1=sc.nextInt();
		System.out.print("Enter second number: ");
		n2=sc.nextInt();
		sum=n1+n2;
		sub=n1-n2;
		mult=n1*n2;
		div=n1/n2;
		System.out.println("Summation= "+sum);
		System.out.println("Subtraction= "+sub);
		System.out.println("Multiplication= "+mult);
		System.out.println("Division= "+div);
	}
}