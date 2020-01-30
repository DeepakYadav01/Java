import java.util.*;
public class MaxKConSubArr {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int max=0;
		System.out.println("Enter value to find max in contiguous subarray");
        int k=sc.nextInt();
		for(int i=0;i<=n-k;i++) {
			max=0;
			for(int j=i;j<k+i;j++) {

				if(a[j]>max)
					max=a[j];
			}
			System.out.print(max+" ");

		}
	}
}
