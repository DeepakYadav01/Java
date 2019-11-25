package Assignment1;
import java.util.*;
public class RussianMain {

	public static void main(String arg[])
	{
	int a,b;
    System.out.print("Enter Multiplicand and Multiplier and you will get the Product  ");

	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	b=s.nextInt();

	RussianMltiplication R=new RussianMltiplication();
      R.Result(a,b);
 }
}
