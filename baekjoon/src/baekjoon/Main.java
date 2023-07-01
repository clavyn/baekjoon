package baekjoon;

import java.util.Arrays;

public class Main {

	static int solution(int k, int m, int[] score) {
		int answer = 0;
		Arrays.sort(score);
		for (int i = 0; i < score.length; i++) {
			if (i % m == 0) {
				answer += score[i] * m;
			}
		}

		return answer;

	}

	public static void main(String[] args) {

//		int[] score = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		int[] score = { 1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(3,4, score));// 3

	}
}
