import java.util.*;

class Strings
{
	public int CountCap(String str)
	{
		char arr[]=str.toCharArray();
		
		int i=0, count=0;
		
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				count++;
			}
		}		
		return count;
	}
}

class CountSmall
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string");
		
		String str=sobj.nextLine();
		
		Strings obj=new Strings();
		
		int iRet=obj.CountCap(str);
		
		System.out.println("Number of small letters are "+iRet);
	}
}
