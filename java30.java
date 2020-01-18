import java.util.*;
public class checkTriplet {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the testcases");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.print("enter the size of array");
			int m=sc.nextInt();
			int ar[]=new int[m];
			for(int j=0;j<m;j++) {
				ar[j]=sc.nextInt();
			}

		 boolean b=CheckTriplet(ar,m);
		 if(b==true)
			 System.out.println("Yes");
		 else
			 System.out.println("No");


		}

	}

	 static boolean CheckTriplet(int[] a,int s) {

		 int a1[]=a.clone();
			int c=0,c1=0;

			for(int i=0;i<s;i++) {
				for(int j=i+1;j<s;)
				{
					if(a[i]==0&&a[j]==0&&a1[c]==0) {
						c1=1;
						break;
					}

					if(a[i]!=a1[c]&&a[j]!=a1[c])
					{
						if(((a[i]*a[i])+(a[j]*a[j]))==(a1[c]*a1[c])) {
							c1=1;
							break;
						}

					}

						if(c==s-1) {
							c=-1;
							j++;
						}
						c++;

				}
				if(c1==1)
					break;
				c=0;

			}
			if(c1==1)
				return true;
			else
				return false;

	}

}
