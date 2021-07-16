package com.Excel_Sheet_Column_Number;

public class Main {

	public static void main(String[] args) {
		String columnTitle = "AB";
		System.out.println(titleToNumber(columnTitle));
	}
	public static int titleToNumber(String columnTitle) {
		int result = 0;
		for(char ch : columnTitle.toCharArray()) {
			int digit = ch - 'A' + 1;
			result = result * 26 + digit;
		}
		return result;
	}
}
