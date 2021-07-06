package com.Best_Time_to_Buy_and_Sell_Stock;

public class Main {
	public static void main(String[] args) {
		int []prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	public static int maxProfit(int[] prices) {
		int maxProf = 0;
		int left = 0, right = 1; 
		// left is for Buying
		// right is for Selling
		while(right < prices.length) {
			if(prices[left] < prices[right]) {
				int diff = prices[right] - prices[left];
				maxProf = Math.max(maxProf, diff);
			}
			else {
				left = right;
			}
			right += 1;
		}
		return maxProf;
	}
}
