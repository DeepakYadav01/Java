import java.util.*;
public class ArrayPair {

	public static void main(String arg[]) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		List l=new ArrayList();
		String s="";
		System.out.print("Enter elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter Choice");
		int choice=sc.nextInt();
		if(choice==0) {
			System.out.print("Invalid Choice");
		}
		else {

			int c=choice;
			int len=a.length;
			if(choice<=len) {

				if(len%choice==0) {

					for(int i=0;i<n;) {

						for(int j=i;j<choice&&j<n;j++) {
							if(j==choice-1)
								s=(String)(s+a[j]);
							else
							s=(String)(s+a[j]+",");
						}
						i=choice;
						choice=choice+c;
						s="("+s+")";
						l.add(s);
						s="";
					}
					System.out.print(l);
				}
				else {
					System.out.print("Not possible");

				}

			}
			else {
				System.out.println("Invalid choice");
			}

		}


	}
}
