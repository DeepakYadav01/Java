import java.util.*;
public class WindowSize {



	 public static void main(String[] arg)
     {
	   Scanner input=new Scanner(System.in);
	   SortedArrayToBST tree=new SortedArrayToBST();
	   int n,m,count=0;
	   System.out.println("Enter how many array you want ");
	   n=input.nextInt();
	   for(int i=0;i<n;i++)
	    {
		   System.out.println("\nEnter size of array");
		   m=input.nextInt();
		   int arr[]=new int[m];
		   System.out.print("Enter elements");
		   for(int j=0;j<m;j++)
		   {
	         arr[j]=input.nextInt();
		   }
		   System.out.print("Enter window size");
		   int ws=input.nextInt();
		   for(int k=0;k<=m-ws;k++)
		   {
			   count=0;
			   for(int l=k;l<ws+k;l++)
			   {
				   if(arr[l]<0)
				   {
					   System.out.print(arr[l]+" ");
					   count=1;
					   break;
				   }
			   }
			   if(count==0)
			   {
				   System.out.print("0"+" ");
			   }
		   }


	    }
     }

}
