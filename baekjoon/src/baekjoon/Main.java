package baekjoon;

import java.util.Arrays;
import java.util.Stack;

public class Main {

	static long[] solution(int x, int n) {
		int y = x;
		long[] answer = new long[n];
		for(int i = 0;i<n;i++) {
			answer[i]=x;
			x=x+y;
		}
	
		return answer;
		
	}
	


	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(4,3)));

	}
}
