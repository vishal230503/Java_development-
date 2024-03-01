package com.nt.hk;

import java.util.ArrayList;

public class Test07_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(10);
		al.add(200);
		al.add("a");
		al.add("b");
		al.add(true);
		al.add(false);
		
		System.out.println(al.size());
		System.out.println(al.toString());
		
		al.remove(2);
		System.out.println(al);
		
		System.out.println("wishMessageGenerator");
		
	}
}