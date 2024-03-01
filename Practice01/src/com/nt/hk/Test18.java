package com.nt.hk;

public class Test18 {
	public static void main(String[] args) {
		int a=100;
		int b=0;
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			//e.printStackTrace();
			//System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}
