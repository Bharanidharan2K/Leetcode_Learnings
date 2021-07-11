package com.Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		int nums[] = {1,1,1,2,2,3};
		int k = 2;
		int result[] = topKFrequent(nums, k);
		for(int i : result) {
			System.out.print(i+ " ");
		}
	}
	public static int[] topKFrequent(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		PriorityQueue<Tuple> maxHeap = new PriorityQueue<Tuple>();
		for(Map.Entry<Integer, Integer> itr : map.entrySet()) {
			maxHeap.add(new Tuple(itr.getKey(), itr.getValue()));
		}
		int index = 0;
		int result[] = new int[k];
		for(int i=0;i<k;i++) {
			result[index++] = maxHeap.poll().key;
		}
		return result;
	}
	
}
class Tuple implements Comparable<Tuple>{
	int key;
	int value;
	public Tuple(int key, int value) {
		this.key = key;
		this.value = value;
	}
	public int compareTo(Tuple o) {
		if(this.value < o.value) return 1;
		return -1;
	}
	
}
