package Assignment1;

import java.util.Scanner;

public class Sorting {
	void sort(int a,int b,int c)
	{
	if(a<b&&a<c)
	{
		System.out.println(a+"\n");
		if(b<c) {
			System.out.println(b+"\n");
			System.out.println(c+"\n");
		}
		else
		    {
		    	System.out.println(c+"\n");
				System.out.println(b+"\n");
		    }
	}
	if(b<a&&b<c)
	{
		System.out.println(b+"\n");
		if(a<c) {
			System.out.println(a+"\n");
			System.out.println(c+"\n");
		}
			else
			    {
			    	System.out.println(c+"\n");
					System.out.println(a+"\n");
			    }
	}
	if(c<a&&c<b)
	{
		System.out.println(c+"\n");
		if(a<b)
		{
			System.out.println(a+"\n");
			System.out.println(b+"\n");
		}
		else
	    {
	    	System.out.println(b+"\n");
			System.out.println(a+"\n");
	    }
	}
	}


	}
