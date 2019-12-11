import java.util.*;

class Strings
{
	public int Difference(String str)
	{
		char arr[]=str.toCharArray();
		
		int i=0, count1=0, count2=0;
		
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				count1++;
			}
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				count2++;
			}
		}		

		return count2-count1;
	}
}

class DiffCapitalSmall
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter string");
		
		String str=sobj.nextLine();
		
		Strings obj=new Strings();
		
		int iRet=obj.Difference(str);
		
		System.out.println("Difference between number of capital and small letters is "+iRet);
	}
}
