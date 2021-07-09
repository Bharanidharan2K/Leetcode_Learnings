package com.Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n = 3;
		List<String> list = generateParenthesis(n);
		System.out.println(list);
	}
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		generate(0,0,n,list,new StringBuilder());
		return list;
	}
	public static void generate(int openN, int closeN, int n, List<String> list, StringBuilder sb) {
		if(openN == n && closeN == n) {
			list.add(sb.toString());
		}
		if(openN < n) {
			sb.append("(");
			generate(openN + 1, closeN, n, list, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
		if(closeN < openN) {
			sb.append(")");
			generate(openN, closeN + 1, n, list, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
