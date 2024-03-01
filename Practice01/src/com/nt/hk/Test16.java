package com.nt.hk;

public class Test16 {
	
	int x,y;
	Test16() {
		System.out.println("This is constructor: ");
	}
	public void show() {
		int x=100;
		int y=200;
		int z=x+y;
	}
	public static void main(String[] args) {
		Test16 t = new Test16();
		t.show();
		t.show();
		t.show();
	}
}
