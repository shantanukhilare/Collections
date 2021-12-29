package list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list {

	public static void main(String[] args) {
		Linked_list x = new Linked_list();
		x.linkedlist();
	}

	public void linkedlist() {
		LinkedList l = new LinkedList();

		System.out.println(l.isEmpty());
		System.out.println(l.size());
		l.add("shantanu");
		l.add(55);
		l.add('S');
		l.add(null); // null
		l.add("shantanu"); // duplicate

//		l.clear();           //deletes whole data
		System.out.println(l.isEmpty());
		System.out.println(l.size());

		System.out.println(l.indexOf(55));
		System.out.println(l.lastIndexOf("shantanu"));
		System.out.println(l.contains('S'));
		System.out.println(l.get(3));
		l.add(2, "khilare");
		System.out.println(l);

		l.remove(2);
		System.out.println(l);

		l.addFirst(55);
		l.addLast(222);
		System.out.println(l);

		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		Collections.reverse(l);
		Iterator i1=l.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

	}

}
