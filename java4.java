package Hashing;
import java.util.*;

public class HashmapeEg {

	 public static void main(String a[])
	    {
	        HashMap<String,String> mp=new HashMap<>();
	        int n,n1;
	        String str1;
	        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of elements you want");
	        n=sc.nextInt();

            System.out.println("Enter key and its value");

	        for(int i=0;i<n;i++)
	        {
	           String str=sc.next();
	           str1=sc.next();
	           mp.put(str,str1);
	        }

            System.out.println("Enter the value");

	         String val1=sc.next();
	          ArrayList<String>v=new ArrayList<String>();

	          for(String str:mp.keySet())
	          {
	           String val=mp.get(str);
	            if(val1.compareTo(val)==0)
	                v.add(str);

	          }

	        if(v.isEmpty())
	            System.out.println("false");
	        else
	        {
	            Collections.sort(v);

	            Iterator itr=v.iterator();

	            while(itr.hasNext()) {
	             System.out.print(itr.next()+" ");

	         }
	      }

	   }
}
