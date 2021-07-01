package com.Reverse_String;

public class Main {

	public static void main(String[] args) {
		char []c = {'h','e','l','l','o'};
		for(char s : c) {
			System.out.print(s+" ");
		}
		reverseString(c);
	}
	public static void reverseString(char[] s) {
		int left = 0, right = s.length - 1;
		while(left <= right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			left++;
			right--;
		}
		System.out.println();
		for(char c : s) {
			System.out.print(c+" ");
		}
	}

}
