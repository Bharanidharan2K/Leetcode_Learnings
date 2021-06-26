package com.Length_of_Last_Word;

public class Main {

	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length();
        int count = 0;
        // for(int i=s.length()-1; i>=0;i--){
        //     if(s.charAt(i) != ' ') count++;
        //     else if(count > 0) return count;
        // }
        while(n > 0){
            n--;
            if(s.charAt(n) != ' ') count++;
            else if(count > 0) return count;
        }
        return count;
    }
}
