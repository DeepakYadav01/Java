import java.util.Scanner;

public class SubArrayKIndex1 {
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

		System.out.println("Enter number");
		int sum=0,ind;
		int m=sc.nextInt();

		for(int i=0;i<n;i++)
	   	{
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				if(sum==m)
				{
					System.out.println("Starting index :"+i+","+"Ending index :"+j);

				}

		    }
				sum=0;
	    }

    }
}
