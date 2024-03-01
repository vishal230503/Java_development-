package com.nt.hk;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		
		try {
			System.out.println("Enter The Value: ");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Division: "+c);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
