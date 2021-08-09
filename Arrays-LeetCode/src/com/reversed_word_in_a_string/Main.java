package com.reversed_word_in_a_string;

public class Main {

	public static void main(String[] args) {
		String s = "the sky is blue";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) {
		String reversedWords ="";
        int i = s.length() -1;
        while(i >= 0){
        	if(s.charAt(i) == ' ')i--;
        	else {
        		int j = i; 
        		while(i >= 0 && s.charAt(i) != ' ') {
        			i--;
        		}
                if(reversedWords.length() > 0) reversedWords+=" ";
                reversedWords += s.substring(i+1, j+1);
        	}
            
        }
        return reversedWords;
	}
}
