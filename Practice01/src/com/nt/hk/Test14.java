package com.nt.hk;

public class Test14 {
	int x,y;
	Test14() {
		x=100;
		y=200;
		System.out.println("This is Constructor");
	}
	public void show() {
		int z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		Test14 t = new Test14();
		t.show();
		t.show();
		t.show();
	}
}