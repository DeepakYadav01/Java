import java.util.*;
public class Robot {

	public static void main (String arg[]) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt(),n=sc.nextInt();
		int path=uniquePath(m,n);
		System.out.print(path);
	}
	static int uniquePath(int m,int n) {

	           int a[][]=new int [m][n];


	         for(int i=0;i<m;i++)
	         {

	            for(int j=0;j<n;j++)
	            {

	                if(i==0&& j<n)
	                a[i][j]=1;
	                else if(i<m&&j==0)
	                    a[i][j]=1;
	                else
	                {
	                    a[i][j]=a[i][j-1]+a[i-1][j];
	                }
	            }
	          }

	          return a[m-1][n-1];
	    }
	}
