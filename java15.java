import java.util.*;

public class CountFrequency {
 public static void main (String arg[])
{
	Scanner sc=new Scanner(System.in);
	System.out .println("Enter the size of array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int count=1;
	System.out .println("Enter the Elements");
	for(int i=0;i<n;i++)
	{
		a[i]= sc.nextInt();

	}
	for(int i=0;i<n;i++)
	{
		if(a[i]!=0)
		{
		 for(int j=i+1;j<n;j++)
		 {
			if(a[i]==a[j])
			{
				count++;
				a[j]=0;
			}
		 }
		 System.out.println(a[i]+" "+count);
			count=1;
		}

	}

   }

}
