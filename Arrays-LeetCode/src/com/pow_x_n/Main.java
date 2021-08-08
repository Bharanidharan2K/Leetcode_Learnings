package com.pow_x_n;

public class Main {

	public static void main(String[] args) {
		double x = 2.00000;
		int n = 10;
		System.out.println(myPow(x, n));
	}
	public static double myPow(double x, int n) {
		double ans = 1;
		long num = n;
		if(n < 0) {
			num = -1 * n;
		}
		while(num > 0) {
			if(num % 2  == 0) {
				num = num / 2;
				x = x * x;
			}
			else {
				num = num - 1;
				ans = ans * x;
			}
		}
		if(n < 0) return 1.0/ans;
        return ans;
	}

}
