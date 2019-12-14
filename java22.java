package Assignment1;

import java.util.Scanner;

public class Main5 {
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		Sorting s=new Sorting();
        s.sort(a,b,c);

	}
}
