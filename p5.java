//WAP in Java as example of Ladder if-else.
import java.util.Scanner;
class p5
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age: ");
		age=sc.nextInt();
		if(age<0)
		{
			System.out.println("Age can never be negative");
		}
		else if(age==0)
		{
			System.out.println("You have just borned.");
		}
		else if(age>0 && age<=15)
		{
			System.out.println("You are a kid");
		}
		else if(age>15 && age<=45)
		{
			System.out.print("You are young");
		}
		else if(age>45 && age<=100)
		{
			System.out.println("You are old");
		}
		else
		{
			System.out.println("You have crossed your age limit");
		}
	}
}