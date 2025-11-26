package basic_17_Sep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList lst=new ArrayList();
		lst.add(12);
		lst.add(23.12);
		
		lst.add(123123123l);
		lst.add("Sangini");
		lst.add(22.435345f);
		lst.add("Sangini");
		lst.add("Sangini");
		Employee e=new Employee();
		lst.add(new Employee());
		lst.add(e);
		System.out.println(lst);
//		for (int i=0;i<lst.size();i++)
//			System.out.println(lst.get(i));
		
		Iterator i=lst.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		
		HashSet set=new HashSet();
		set.add(23);
		set.add(11.2323);
		set.add("Hello");
		set.add(22.23);
		set.add(23);
		set.add(11.2323);
		set.add("Hello");
		System.out.println(set.size());
		
		
		ArrayList lst2=new ArrayList(set);
		//lst2.add(lst);
		lst2.addAll(lst);
		//lst2 have set and lst
		System.out.println(lst2);
		
		
		
		
		
	}

}
