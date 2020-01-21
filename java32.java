import java.util.*;
public class SecondLargestElement {

	public static void main(String arg[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Largest - "+a[n-1]);
		System.out.println("Second - "+a[n-2]);

	}

}
