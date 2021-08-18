package com.Is_Subsequence;

public class Main {

	public static void main(String[] args) {
		String s = "abc", t = "ahbgdc";
		System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
		if(s.isEmpty()) return true;
		int p1 = 0, p2 = 0;
		while(p1 < s.length() && p2 < t.length()) {
			if(s.charAt(p1) == t.charAt(p2)) {
				p1++;
				p2++;
			}
			else p2++;
		}
		return p1 == s.length();
	}

}
