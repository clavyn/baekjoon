package baekjoon;

import java.util.Stack;

public class Main {

	static int solution(String s) {
	
		char c;
		Stack<Character> stk = new Stack<>();
		
		for(int i = 0 ; i < s.length();i++) {
			c=s.charAt(i);
			if(!stk.isEmpty()&&stk.peek()==c)stk.pop();
			else stk.push(c);			
		}
		return stk.isEmpty()? 1:0;

	}

	public static void main(String[] args) {

		System.out.println(solution("baabaa"));

	}
}
