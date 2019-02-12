package test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Test {
	public void foo() {
		Multimap<String, String> m = ArrayListMultimap.create();
		System.out.println(m);
	}
}
