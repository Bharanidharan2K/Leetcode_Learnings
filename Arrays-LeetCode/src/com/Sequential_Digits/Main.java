package com.Sequential_Digits;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int low = 1000, high = 13000;
		System.out.println(sequentialDigits(low, high));
	}
	public static List<Integer> sequentialDigits(int low, int high) {
		List<Integer> list = new ArrayList<>();
		String digits = "123456789";
		for(int i=1; i<=digits.length(); i++) {
			for(int j=0; j+i<=digits.length(); j++) {
				int value = Integer.parseInt(digits.substring(j, i+j));
				if(value >= low && value <= high)
					list.add(value);
			}
		}
		return list;
	}

}
