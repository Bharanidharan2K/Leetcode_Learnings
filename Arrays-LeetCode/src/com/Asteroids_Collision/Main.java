package com.Asteroids_Collision;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		int[] asteroids = {5,10,-5};
		int[] res = asteroidCollision(asteroids);
		for(int i : res)
			System.out.print(i+" ");
	}
	public static int[] asteroidCollision(int[] asteroids) {
		if(asteroids.length <= 1) return asteroids;
		Stack<Integer> stack = new Stack<>();
		for(int i : asteroids) {
			if(i > 0) stack.push(i);
			else {
				while(!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(i))
					stack.pop();
				if(stack.isEmpty() || stack.peek() < 0)
					stack.push(i);
				else if(stack.peek() == Math.abs(i))
					stack.pop();
			}
		}
		int[] res = new int[stack.size()];
		for(int i=res.length-1 ; i>=0; i--)
			res[i] = stack.pop();
		return res;
	}

}
