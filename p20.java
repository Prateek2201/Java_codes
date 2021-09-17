//WAP in Java to use split() method for Word counter
import java.util.*;
class p20
{
	public static void main(String [] args)
	{
		String sentence;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		sentence= sc.nextLine();
		String [] words= sentence.split(" ");
		System.out.println("No. of words in sentence = "+words.length);
	}
}