import java.util.Scanner;

public class PalindromicSubstring 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=scan.next();
		printPalindromicSubstring(str);
	}

	static void printPalindromicSubstring(String str) 
	{
		int count=0;
		char[] c=str.toCharArray();
		int con1=c.length,con2=con1;
		for(int k=1;k<=c.length;k++)		
		{
			int j=k;
			for(int i=0;i<con1 && j<=con2;i++,j++)
			{
				if(checkPalindrome(str.substring(i, j)))
				{
					System.out.println(str.substring(i, j));
					count++;
				}
			}
			con1--;
		}
		System.out.println("Total Number of substrings :"+count);
	}
	
	static boolean checkPalindrome(String s)
	{
		char[] c=s.toCharArray();
		String rev="";
		
//		Storing String in from reverse
		for (int i =c.length-1;i>=0;i--) 
		{
			rev+=c[i];
		}
		
//		Checking for Palindrome
		if(s.equals(rev))
			return true;
		else
			return false;
	}
}
