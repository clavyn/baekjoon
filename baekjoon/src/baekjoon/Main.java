package baekjoon;

import java.util.Stack;

public class Main {

	static int solution (int n) {
		int answer = 0 ;
		int i = 1;
		Stack<Integer>stk = new Stack<>();
		while(n>0) {
			stk.add(n%3);//n을 3으로 나눈 나머지
			n/=3;//n은 3으로 나누어진 몫으로 초기화			
		}
		while(!stk.isEmpty()) {
			answer+=stk.pop()*i;			
			i*=3;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		
		System.out.println(solution(1));
	}
}
