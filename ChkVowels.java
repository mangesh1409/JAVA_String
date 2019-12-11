import java.util.*;

class Strings
{
	public boolean Difference(String str)
	{
		char arr[]=str.toCharArray();
		
		int i=0;
		
		for(i=0;i<arr.length;i++)
		{
			if ((arr[i]=='a') || (arr[i]=='e') || (arr[i]=='i') || (arr[i]=='o') || (arr[i]=='u') || (arr[i]=='A') || (arr[i]=='E') || (arr[i]=='I') || (arr[i]=='O') || (arr[i]=='U'))
			{
				break;
			}
		}		

		if(i<arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class ChkVowels
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string");
		
		String str=sobj.nextLine();
		
		Strings obj=new Strings();
		
		boolean bRet=obj.Difference(str);
		
		if(bRet==true)
		{
			System.out.println("Given string contain vowels in it");
		}
		else
		{	
			System.out.println("Given string do not contain vowels in it");
		}
		
	}
}
