//WAP in Java to find greatest number in two numbers using non-static function
import java.util.*;
class p24
{
	public static void main(String [] args)
	{
		int num1,num2,gr;
		Scanner sc=new Scanner(System.in);	
		System.out.print("Enter two numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		p24 p=new p24();
		gr=p.greatest(num1,num2);
		System.out.println(gr+" is greatest number.");
	}
	public int greatest(int num1,int num2)
	{
		if(num1>num2)
		{
			return num1;
		}
		else
		{
			return num2;
		}
	}
}