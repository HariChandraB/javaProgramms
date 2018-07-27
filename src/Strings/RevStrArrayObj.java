package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class RevStrArrayObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reverse = "hakunaMatata";
		char[] creverse = reverse.toCharArray();

		List<Character> list = new ArrayList();

		for (char c : creverse)list.add(c);
		Collections.reverse(list);
		ListIterator litr = list.listIterator();
		while (litr.hasNext())
			System.out.println("Reverse of String: " + litr.next());
	}

}
