import java.util.*;
public class LeaderArray {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");

		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int j=1;
		for(int i=0;i<n;)
		{
			if(a[i]>=a[j])
			{
				j++;
			}else
			{
				++i;
				j=i+1;
			}

			if(j==n) {
				System.out.print(a[i]+" ");
				++i;

				if(i!=n-1)
				{
				   j=i+1;
				}
				else
				{
					j--;
				}
			}
		}
	}
}
