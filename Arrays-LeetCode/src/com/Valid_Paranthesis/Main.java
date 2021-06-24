package com.Valid_Paranthesis;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(isValid(s));
		sc.close();

	}
	public static boolean isValid(String s) {
		if(s.length() %2 != 0) return false;
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(' || c == '[' || c == '{') stack.push(c);
			else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
				stack.pop();
			else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
				stack.pop();
			else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
				stack.pop();
			else stack.push(c);
		}
		return stack.isEmpty();
	}
}
