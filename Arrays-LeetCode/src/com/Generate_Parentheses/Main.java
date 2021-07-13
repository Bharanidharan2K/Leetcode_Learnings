package com.Generate_Parentheses;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int n = 3;
		List<String> list = generateParenthesis(n);
		System.out.println(list);
	}
	public static List<String> generateParenthesis(int n) {
       List<String> list = new ArrayList<>();
        int openCount = n;
        int closeCount = n;
        solve(openCount , closeCount , "" , list);
        
        return list;
    }
    private static void solve(int openCount , int closeCount , String output , List<String> list) {
        if(openCount==0 && closeCount==0){
            list.add(output );
            return;
        }
        
        if(openCount!=0)
            solve(openCount-1 , closeCount , output+"(" , list);
        
        if(closeCount > openCount)
           solve(openCount , closeCount-1 , output+")" , list);
        
    }

}
