package pkg1;

import java.util.*;

public class RomanNumber {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String s[]=new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuilder sb=new StringBuilder();
		System.out.println("Enter the Number greater than 0 and  less than equal to 1000");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("The number zero does not have its own Roman numeral");

		}
		for(int i=0;i<a.length;i++)
		{

		while(n-a[i]>=0)
		{
			sb.append(s[i]);
			n=n-a[i];
		}
		}

		String str=sb.toString();
		System.out.println(str);


      }
 }
