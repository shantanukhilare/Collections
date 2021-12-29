package set;

import java.util.TreeSet;

public class Tree {
public static void main(String[] args) {
	Tree x=new Tree();
	x.method1();
}
public void method1() {
	TreeSet t=new TreeSet();
	
	t.add("aa");   //order is in ascending order
	t.add("zz");
	t.add("yy");
	t.add("aa");   //duplicate not allowed
	t.add("bb");
	t.add("dd");
//	t.add(null);   //null will show exception
	
	System.out.println(t);
	System.out.println(t.isEmpty());;
	System.out.println(t.size());
	System.out.println();
	 
//	New methods
	System.out.println(t.last());     //zz
	System.out.println(t.first());    //aa
	t.pollFirst();                    //removes first value i.e. aa
	t.pollLast();                     //removes last value  i.e. zz
	System.out.println(t);            //[bb, dd, yy]
	
	t.add("2");
	t.add("99");
	t.add("1");
	System.out.println(t);
	
	
}
}
