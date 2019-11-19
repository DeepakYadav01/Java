import java.util.*;
public class RevStr {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		 String str;
		  System.out.println("Enter the string");
		   str=sc.next();
		  char ch[]=str.toCharArray();
		 int l=ch.length;
		int li=l-1;
		for(int si=0;si<l;si++)
		{
			if(si<li)
			 {
            if((ch[si]>='A'&&ch[si]<='Z'||ch[si]>='a'&&ch[si]<='z')&&(ch[li]>='A'&&ch[li]<='Z'||ch[li]>='a'&&ch[li]<='z'))
              {
        	       char temp=ch[si];
        	       ch[si]=ch[li];
        	       ch[li]=temp;
			           li--;

              }
            else if((ch[si]>='A'&&ch[si]<='Z'||ch[si]>='a'&&ch[si]<='z'))
              {
        	        if(true)
        	        {
          		     si=si-1;
         	         li--;
        	        }
              }
		      }
		 }

	   for(int i=0;i<l;i++)
 	    {
 		    System.out.print(ch[i]);
 		  }

	  }
  }
