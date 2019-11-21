import java.util.*;

public class LongestSubString {

	 public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int len=0,count=0,k=0;
		System.out .println("Enter the String");

		String s=sc.next(),s1,s2=null,s4=" ";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{

			s1=s.substring(i,j);
			if(isPalindrome(s1))
			 {
				int l=s.substring(i,j).length();

				if(l>len)
				{

					len=l;
					s2=s.substring(i,j);

				}

			 }
			}
		}
		System.out.println(s2);


	}

	static boolean isPalindrome(String s)
	 {
		 String s3=s;
		 StringBuffer sb=new StringBuffer(s3);
		 sb.reverse();
		 s3=sb.toString();
		 if(s3.equals(s))
			 return true;
		 else
			 return false;
	 }
}
