package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AirlineTicketing {

	 public static void main(String a[])
	    {
	        HashMap hmp=new HashMap();
	        int n,n1;
	        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of passengers");
	        n=sc.nextInt();

         System.out.println("Enter boarding pass number for each passenger");

	        for(int i=0;i<n;i++)
	        {
	           int m=sc.nextInt();
	           if(hmp.containsKey(m))
	           {
	        	   System.out.println("Duplicate");
	           }
	           else
	           {
	        	   System.out.println("Checked");

	           }
	           hmp.put(m,"");
	        }



	    }

}
