package baekjoon;

import java.util.Arrays;

public class Main {

	static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			answer += (Math.sqrt(i) % 1 == 0)? -1 * i : i;
		}

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(24, 27));

	}
}
