package com.nt.hk;

import java.io.DataInputStream;
import java.io.IOException;

public class Test17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		DataInputStream d = new DataInputStream(System.in);
		float b,h,area;
		b=5;
		h=15;
		System.out.println("Enter height and breath");
		b=Integer.parseInt(d.readLine());
		area = 0.5f*b*h;
		System.out.println("Enter Of Triangle: "+area);
		
	}
}
