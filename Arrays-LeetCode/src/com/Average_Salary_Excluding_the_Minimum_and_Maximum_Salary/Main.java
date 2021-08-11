package com.Average_Salary_Excluding_the_Minimum_and_Maximum_Salary;

public class Main {

	public static void main(String[] args) {
		int[] salary = {4000,3000,1000,2000};
		System.out.println(average(salary));
	}
	public static double average(int[] salary) {
		int maxSalary = Integer.MIN_VALUE;
		int minSalary = Integer.MAX_VALUE;
		for(int i=0; i<salary.length; i++) {
			minSalary = Math.min(minSalary, salary[i]);
			maxSalary = Math.max(maxSalary, salary[i]);
		}
		double sum =0;
		for(int i=0; i<salary.length; i++) {
			if(salary[i] != minSalary && salary[i] != maxSalary) {
				sum += salary[i];
			}
		}
		return sum / (salary.length-2);
	}
}
