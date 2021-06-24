package com.Longest_Common_Prefix;

import java.util.Scanner;

public class Horizontal_method {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strs[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
		sc.close();

	}
	public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.length() == 0){
                    return "";
                }
            }
        }
        return prefix;
    }
}
