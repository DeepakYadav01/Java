package pkg1;
public class StringFrequency {

	public static void main(String arg[]) {
		int count=1;
		String str,s="AaabbB";
		str=s.toLowerCase();
		char c[]=str.toCharArray();
		char m = 0, c1=c[0];
		for(int i=1;i<c.length;i++)
		{
			if(c1==c[i])
			{
				count++;
				m=c1;

			}
			else
			{
				System.out.print(count);
				c1=c[i];
				count=1;

			}

		}

	}
}
