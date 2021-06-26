package com.Plus_One;

public class Main {

	public static void main(String[] args) {
		int []digits = {9,9,9};
		digits = plusOne(digits);
		System.out.print(digits[0]);
		for(int i=1 ; i<digits.length;i++) {
			System.out.print(","+digits[i]);
		}
			

	}
	public static int[] plusOne(int[] digits) {
        // int n = digits.length;
//         for(int i=n-1; i>=0;i--){
//             if(digits[i] < 9) {
//                 digits[i]++;
//                 return digits;
//             }
//             digits[i] = 0;
             
//         }
        int n = digits.length -1;
        while(n >= 0){
            if(digits[n] == 9) digits[n] = 0;
            else if(digits[n] < 9) {
                digits[n]++;
                return digits;
            }
            n--;
        }
        int new_arr[] = new int[digits.length+1];
        new_arr[0] = 1;
        return new_arr;
    }
}
