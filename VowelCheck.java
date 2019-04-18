import java.util.*;
class VowelCheck
{
	public static void main(String arg[])
	{
	char ch;
	Scanner scannerObj=new Scanner(System.in);
	System.out.println("Enter a Character");
	ch=scannerObj.next().charAt(0);
	if(ch=='A')
		System.out.println("Vowel");
	else if(ch=='E')
		System.out.println("Vowel");
	else if(ch=='I')
		System.out.println("Vowel");
	else if(ch=='O')
		System.out.println("Vowel");
	else if(ch=='U')
		System.out.println("Vowel");
	else
		System.out.println("Consonant");

	}
}