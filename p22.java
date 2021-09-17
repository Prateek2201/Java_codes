//A program to demonstrate concept of static function
import java.util.*;
class p22
{
	static int add(int x,int y)	//static function
	{
		return (x+y);
	}
	public static void main(String [] args)
	{
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers: ");	
		a=sc.nextInt();
		b=sc.nextInt();
		sum=p22.add(a,b);
		System.out.println("Summation= "+sum);
	}
}