package com.Sqrt_X;

public class Main {

	public static void main(String[] args) {
		int x = 8;
		System.out.println(mySqrt(x));

	}
	public static int mySqrt(int x) {
        long l = 0 , r = x, mid  = 0;
        while(l<=r) {
        	mid = l + (r-l)/2;
        	if(mid * mid == x) return (int)mid;
        	else if(mid * mid < x) l = mid + 1;
        	else r = mid -1;
        }
        return (int)l-1;
    }
}
