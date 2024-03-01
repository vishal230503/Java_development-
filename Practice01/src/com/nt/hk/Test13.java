package com.nt.hk;

public class Test13 {
	public static void main(String[] args) {
		int day=8;
		switch (day) {
		case 1: {
				System.out.println("Monday");
				break;
		}
		case 2: {
			System.out.println("Thusday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}
	}
}
