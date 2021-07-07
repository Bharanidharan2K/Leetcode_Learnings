package com.Kth_Smallest_Element_in_a_Sorted_Matrix;

public class Main {

	public static void main(String[] args) {
		int matrix[][] = {
							{1,5,9},
							{10,11,13},
							{12,13,15}
						};
		int k = 8;
		System.out.println(kthSmallest(matrix, k));
		

	}
	public static int kthSmallest(int[][] matrix, int k) {
		int l = matrix[0][0];
		int r = matrix[matrix.length-1][matrix.length-1];
		while(l<=r) {
			int mid = l + (r - l) / 2;
			int count = getCount(matrix, mid);
			if(count < k) l = mid + 1;
			else r = mid - 1;
		}
		return l;
	}
	public static int getCount(int[][] matrix, int mid) {
		int count = 0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j] <= mid)
					count ++;
			}
		}
		return count;
	}

}
