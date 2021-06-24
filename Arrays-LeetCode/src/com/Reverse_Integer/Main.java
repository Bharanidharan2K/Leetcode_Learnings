package com.Reverse_Integer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(reverse(x));
		sc.close();

	}
	public static int reverse(int x) {
        int pop = 0;
        int reversed = 0;
        while(x != 0){
            pop = x%10;
            x /= 10;
            if(reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 9) return 0;
            if(reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -9) return 0;
            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }

}
