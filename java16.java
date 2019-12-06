import java.util.*;

public class HPF {

	public static void main(String rg[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int n1=0,c1=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{

			if(isPrime(i)==true)
			{
				if(i>n1)
				{
					n1=i;
					c1=1;
				}
			}
		}
	}
	if(c1==1)
	{
		System.out.println(n1);
	}
	else {
		System.out.println("It has no prime factor");

	}

   }

	static boolean isPrime(int a)
	{
		int c=0;
		if(a>2) {

		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				c=1;
				break;
			}
		}
	  }
		if(c==1)
		{
			return false;
		}
		else {
			return true;
		}
	}
}
