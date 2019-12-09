import java.util.*;

public class MergeArray {


	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array");
		int m=sc.nextInt();
		int arr[]=new int[m];

		System.out.println("Enter elements ");


       for(int i=0;i<m;i++)
        {
         	arr[i]=sc.nextInt();
        }

       System.out.println("Enter the size  of 2nd array");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter elements ");

		for(int i=0;i<n;i++)
        {
         	arr1[i]=sc.nextInt();
        }

		int arr2[]=new int[m+n];
		int l=0;
		for(int i=0;i<m+n;i++)
		{
			if(i<m)
				arr2[i]=arr[i];
			else
			{
               arr2[i]=arr1[l];
			l++;
			}
		}
		Arrays.sort(arr2);
		for(int i=0;i<m+n;i++)
			System.out.println(arr2[i]);

	}
}
