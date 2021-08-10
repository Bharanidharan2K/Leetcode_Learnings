package com.longest_substring_without_repeating_character;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int result = 0;
		for(int i=0, j=0; j<s.length(); j++) {
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)));
			}
			result = Math.max(result, j-i+1);
			map.put(s.charAt(j), j+1);
		}
		return result;
	}

}
