package baekjoon;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	static int solution(int k, int m, int[] score) {
		int answer = 0;
		Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp,Comparator.reverseOrder());
		System.out.println(Arrays.toString(tmp));
		for (int i = 0; i < score.length; i++) {
			if (i % m == 0) {
				if (i + m-1 < score.length) {
					answer += tmp[i + m-1] * m;
				}
			}
		}

		return answer;

	}

	public static void main(String[] args) {

//		int[] score = { 4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2 };
		int[] score = { 1, 2, 3, 1, 2, 3, 1 };
		System.out.println(solution(3,4, score));// 3

	}
}
