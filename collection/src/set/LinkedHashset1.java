package set;

import java.util.LinkedHashSet;

public class LinkedHashset1 {

	public static void main(String[] args) {
		LinkedHashset1 x=new LinkedHashset1();
		x.method1();
	}
	public void method1() {
		LinkedHashSet h=new LinkedHashSet();
		
		h.add(45);
		h.add("abbb");
		h.add('f');
		h.add(45);
		h.add(null);
		h.add(null);
		
		System.out.println(h); //insertion order is maintained
	}
}
