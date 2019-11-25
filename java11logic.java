package Assignment1;

public class RussianMltiplication {

	void Result(int a,int b)
	{

		          int c=0;

		    while(a>0)
		    {

	            System.out.print(a+"\t"+b+"\t");

		        if(a%2==0)
		        {
		            b=b*2;
		            a=a/2;
		            System.out.print("\n");

		        }
		        else
		        {

		            c=c+b;
		              b=b*2;
		            System.out.print("\t="+c+"\n");
		            a=a/2;

		        }
		    }

	  }
}
