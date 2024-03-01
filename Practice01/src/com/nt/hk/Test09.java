package com.nt.hk;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		System.out.println("Enter any value");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a+b+c;
		System.out.println("Addition: " + d);
	}
}
