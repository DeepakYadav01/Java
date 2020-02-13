import java.util.*;
public class MaxDistBwTwoOcrnc {

	public static void main(String arg[]) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the testcases");
		int n=sc.nextInt(),m;
		int min=0,max=0,max1=0;
		for(int i=0;i<n;i++) {

			System.out.print("Enter the size of array");

			m=sc.nextInt();
			int a[]=new int[m];

			System.out.print("Enter the elements");

			for(int j=0;j<m;j++) {
				a[j]=sc.nextInt();
			}

			for(int j=0;j<m;j++) {

					for(int k=j+1;k<m;k++) {

						if(a[j]==a[k]) {
							min=j;

							if(max<=k) {
								max=k;
							}

							a[k]=0;
						}

					}


				if(max-min>=max1) {
					max1=max-min;
				}

			}
			System.out.println(max1);
		}

	}
}
