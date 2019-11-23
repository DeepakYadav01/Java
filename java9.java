import java.util.*;

public class FmaxFrmSubaray {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		int a[]=new int[n];

		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

		}

		int temp=a[0];
		System.out.println("Enter number");
		int m=sc.nextInt();
		int c=m;

		if(m<a.length) {
			for(int i=0;i<=n-m;i++)
			{
				for(int j=i;j<c;j++)
				{
					if(temp<a[j])
					{
						temp=a[j];
					}
				}
				System.out.print(temp+" ");
				c++;
				temp=0;
			}

		 }
		else {

			System.out.println("number cannot be greater than the length of array");
		}

	}

}
