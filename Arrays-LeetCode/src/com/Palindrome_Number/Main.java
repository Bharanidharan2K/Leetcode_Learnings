package com.Palindrome_Number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(isPalindrome(x));
		sc.close();

	}
	public static boolean isPalindrome(int x) {
        if(x ==0) return true;
        if(x<0 || x%10 == 0) return false;
        int reversed = 0;
        int dummyVar = x;
        while(dummyVar != 0){
            int pop = dummyVar%10;
            dummyVar /= 10;
            reversed = (reversed *10)  + pop;
        }
        if(reversed == x) return true;
        else return false;  

    }

}
