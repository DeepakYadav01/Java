import java.util.*;
public class MinPathSum {

	static int minPathSum(int a[][]) {


	     int m=a.length;
	     int n=a[0].length;
	     for(int i=0;i<m;i++)
	     {

	        for(int j=0;j<n;j++)
	        {

	            if(i==0&& j==0)
	            a[i][j]=a[i][j];

	            else if(i==0 && j>0){
	                a[i][j]=a[i][j]+a[i][j-1];
	            }
	            else if(i>0 && j==0){
	                a[i][j]=a[i][j]+a[i-1][j];
	            }
	            else{

	                 if(a[i][j]+a[i-1][j]< a[i][j]+a[i][j-1]){
	                    a[i][j]=a[i][j]+a[i-1][j];
	                }
	                else{
	                    a[i][j]=a[i][j]+a[i][j-1];
	                }
	            }

	        }
	      }


	      return a[m-1][n-1];
	  }

public static void main (String arg[]) {

		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++)
        {

           for(int j=0;j<n;j++)
           {
        	   a[i][j]=sc.nextInt();
           }
        }
		int sum=minPathSum(a);
		System.out.print(sum);
	}

}
