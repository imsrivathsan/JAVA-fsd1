package PracticeProject;
import java.util.*;
public class Collection {
	public static void main(String[] args)
	{
		System.out.println("ArrayList");
		ArrayList<String>city= new ArrayList<String>();
		city.add("Chennai");
		city.add("Villupuram");
		city.add("Mumbai");
		city.remove("Mumbai");
		System.out.println(city);
		System.out.println("Vector");
		Vector<Integer>vec=new Vector();
		vec.addElement(15);
		vec.addElement(56);
		vec.addElement(34);
		vec.set(2, 18);
		System.out.println(vec);
		System.out.println("LinkedList");
		LinkedList<String>names=new LinkedList<String>();
		names.add("Srivathsan");
		names.add("Sridhar");
		Iterator<String>itr=names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Hashset");
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(101);
		set.add(103);
		set.add(101);
		set.add(102);
		System.out.println(set);
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer>set2=new LinkedHashSet<Integer>();
		set2.add(11);
		set2.add(12);
		set2.add(14);
		System.out.println(set2);
		
		
	}
}
