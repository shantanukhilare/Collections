package set;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		Hashset x = new Hashset();
		x.hash();
	}

	public void hash() {
		HashSet h = new HashSet();
		System.out.println(h.isEmpty());
		System.out.println(h.size());

		h.add("XYZ");
		h.add("sdfjaksdfjklasdf");
		h.add(44);
		h.add(null);
		h.add('t');
		h.add(44); // duplicate not allowed, automatically removed

		System.out.println(h);
//it will not print sequentially as order of insertion is random
//hashtable saved (ASCII=American Standard Code for Information Interchange)

	}
}
