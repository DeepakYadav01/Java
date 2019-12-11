import java.util.*;
public class FormLargeNo {

	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		String str[]=new String[n];
		Vector v=new Vector();
		System.out.println("Enter numbers in array");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
			v.add((String)str[i]);

		}

		Collections.sort(v,new CompareLargestNo());
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}

	}

}
class CompareLargestNo implements Comparator<String>
{
	public int compare(String s,String s1)
	{
		String ss1=s+s1;
		String s1s=s1+s;
		return ss1.compareTo(s1s)>0?-1:1;

	}

}
