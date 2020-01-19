import java.util.*;
public class StringReverse {

	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String s,s1,str="";
		System.out.println("Enter the testcases");
		int n=sc.nextInt();
		int c=0,len;
		for(int i=0;i<n;i++) {
			System.out.println("Enter the String");
			s=sc.next();
			 s1=s.replace('.',',');
			 len=s1.length();

			 if(s1.charAt(len-1)==',') {
				 c=1;

			 }

			 String str1[]=s1.split(",");

			 for (int j=str1.length-1; j >=0; j--)
			    {
				 if(j!=0)
				 str=str+str1[j]+".";
				 else
					 str=str+str1[j];
			    }

			 if(c==1) {
				 str="."+str;
			 }
			 System.out.println(str);
			 str="";
		}

	}
}
