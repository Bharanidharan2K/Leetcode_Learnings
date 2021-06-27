package com.Add_Binary;

public class Main {

	public static void main(String[] args) {
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));

	}
	public static String addBinary(String a , String b) {
		String result = "";
		int sum = 0, carry = 0;
		int i = a.length() -1, j = b.length() -1;
		while( i >= 0 || j >= 0) {
			sum = carry;
			if(i >= 0) sum += a.charAt(i) - '0';
			if(j >= 0) sum += b.charAt(j) - '0';
			result += sum % 2;
			carry = sum /2;
			i--; j--;
		}
		if(carry > 0) result += 1;
		StringBuilder input = new StringBuilder();
		input.append(result);
		return input.reverse().toString();
	}

}
