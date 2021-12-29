package list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println(v.capacity());
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println("Adding value to vector");
		v.add("bbb");
		v.add(555);
		v.add('D');
		v.add(null);   // null value
		v.add("bbb");  // duplicate value

		System.out.println(v.indexOf("bbb"));
		System.out.println(v.lastIndexOf("bbb"));
		System.out.println(v.contains('d'));
		System.out.println(v.get(3));
		System.out.println(v);
		
		v.add(3, "aaa");
		System.out.println(v);
		
		v.add(3, "zzz");
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);

		Enumeration cur = v.elements();
		while (cur.hasMoreElements()) {
			System.out.println(cur.nextElement());
		}
		Collections.reverse(v);               // collection is class
		System.out.println();

		Enumeration cur1 = v.elements();
		while (cur1.hasMoreElements()) {
			System.out.println(cur1.nextElement());
		}

	}
}
