package com.Group_Anagrams;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		String []strs = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> result = groupAnagrams(strs);
		System.out.println(result);

	}
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		List<List<String>> result = new ArrayList<>();
		for(String str : strs) {
			char ch[] = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			List<String> list = map.getOrDefault(key, new ArrayList<String>());
			if(list.isEmpty()) {
				map.put(key, list);
			}
			list.add(str);
			result = new ArrayList<>(map.values());
		}
		return result;
	}
}
