package baekjoon;

import java.util.Stack;

public class Main {

	static int solution(String s) {
		int answer = 0;
		Stack<Character> stk = new Stack<>();
		stk.push(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			if (!stk.isEmpty()) {
				if (stk.peek() == s.charAt(i)) {
					stk.pop();
					continue;
				} else {
					stk.push(s.charAt(i));
				}
			} else {
				stk.push(s.charAt(i));
			}
		}
		answer = stk.isEmpty() ? 1 : 0;
		return answer;

	}

	public static void main(String[] args) {
		System.out.println(solution("baabaa"));// 1
		System.out.println(solution("cdcd"));// 0

	}
}
