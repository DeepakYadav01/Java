import java.util.*;
public class JumpingNumber {

	public static void main(String arg[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the testcases");
		int n=sc.nextInt();

	    for(int i=0;i<n;i++) {

			System.out.println("Enter the value for which you want jumping number");
	    	int t=sc.nextInt();
	    	if(t>=1&&t<=10) {
	    		for(int j=0;j<=t;j++) {
	    			System.out.print(j+" ");
	    		}
	    	}
	    	else {
	    		for(int j=0;j<=t;j++) {
	    			if(j<=10) {
	    				System.out.print(j+" ");
	    			}
	    			else {

	    				int m=j,k=0;
	    				int count=0,count1=0;
	    				while(m>0) {
	    					m=m/10;
	    					count++;
	    				}

	    				m=j;

	    				int a[]=new int[count];
	    				while(m>0) {
	    					a[k++] =m%10;
	    					 m=m/10;
	    				}

	    				for(int p=0;p<count-1;p++) {
	    					if(a[p]-a[p+1]==1||a[p]-a[p+1]==-1) {

	    						count1++;
	    					}
	    					else {
	    						break;
	    					}
	    				}
	    				if(count1==count-1)
	    					System.out.print(j+" ");

	    			}
	    		}
	    	}
	    	System.out.print("\n");
	    }
	}
}
