package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


class nameComparator implements Comparator
{

	@Override
	public int compare(Object o, Object o1) {

		Employ emp=(Employ)o;
		Employ emp1=(Employ)o1;

		return emp.name.compareTo(emp1.name);
//if(emp.id==emp1.id)
//	return 0;
//else if(emp.id>emp1.id)
//	return 1;
//else return -1;

	}

}
class Employ
{
	int id;
	String name;
	int salary;
	String location;
	public Employ(int id, String name, int salary, String location) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}



}
public class ComaratorEg {

	public static void main(String arg[])
	{
		Employ e=new Employ(3,"rishabh",50000,"chandigaarh");
		Employ e1=new Employ(5,"rahul",30000,"Gujrat");
		Employ e2=new Employ(2,"rohit",70000,"Delhi");
		Employ e3=new Employ(6,"rohan",10000,"Delhi");
		Employ e4=new Employ(1,"mohit",20000,"turkey");
		Employ e5=new Employ(4,"rohan",80000,"uk");



		ArrayList <Employ> a=new ArrayList();
		a.add(e);
		a.add(e1);
		a.add(e3);
		a.add(e4);
		a.add(e5);
Collections.sort(a,new nameComparator());
Iterator itr=a.iterator();
while(itr.hasNext())
{
	Employ et=(Employ)itr.next();
	System.out.println(et.id+et.name+et.salary+et.location);
}
	//or
//		for(Employ o:a)
//		System.out.println("id="+o.id+" name="+o.name+" salary= "+o.salary+" location"+o.location);
//

	}
}
