import java.util.*;
public class ContigousMaxMin {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int k,m=sc.nextInt();
			int a[]=new int[m];
			for(int j=0;j<m;j++)
			{
				a[j]=sc.nextInt();
			}
			Arrays.sort(a);

			for( k=0;k<m;k++)
			{
				System.out.print(a[k]+" ");

			}

			System.out.print("\n");
			if(m%2==0)
			{
			for(k=0;k<m;k++)
			{
				--m;
				if(k<m) {
				System.out.print(a[m]+" ");
				System.out.print(a[k]+" ");
				}

			}
			}
			else {
				for(k=0;k<m;k++)
				{
					--m;
					if(k<m) {
					System.out.print(a[m]+" ");
					System.out.print(a[k]+" ");
					}
					else {
						System.out.print(a[k]+" ");
					}

				}
			}

		}
	}
}
