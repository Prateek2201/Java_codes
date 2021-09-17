//WAP in Java to print even nubers from 1-100.
class p7
{
	public static void main(String[] args)
	{
		int c;
		c=1;	//Initialization of loop counter
		while(c<=100)	//Condition
		{
			if(c%2==0)	
			{
				System.out.print(c+"\t");
			}
			c++;	//Increment loop counter
		}				
	}
}