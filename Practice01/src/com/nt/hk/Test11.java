package com.nt.hk;

import java.util.Arrays;

public class Test11 {
	public static void main(String[] args) {
		
		int intArr[] = {10,15,17,22,45};
		Arrays.sort(intArr);
		int intKey = 22;
		
		System.out.println(intKey+" The Index Of: "+Arrays.binarySearch(intArr, intKey));
		
	}
}
