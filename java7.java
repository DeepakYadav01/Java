package pkg1;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String arg[])
	{
		  int len=-1;
		    String s;
		      Scanner sc=new Scanner(System.in);
		         System.out.print("Enter  String ");
		          s=sc.nextLine();
		           char ch[]=s.toCharArray();

	           for(int n:ch)
                 len++;


	          for(int i=len;i>=0;i--)
	          {

	        	  if(ch[i]==' '&&ch[i+1]==' ')
	        	  {
	        		  continue;
	        	  }

		         System.out.print(ch[i]);

	          }

	 }

}
