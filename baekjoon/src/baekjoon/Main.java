package baekjoon;

import java.util.Arrays;

public class Main {

	static int[] solution(int k, int[] score) {
		int[] answer = new int[score.length];
		int cnt = 1;
		int[] tmp = new int[k];// 정렬할 배열
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = -1;
		}
		for (int i = 0; i < score.length; i++) {
//			if(i<k) {
//				tmp[i]=score[i];
//				Arrays.sort(tmp);				
//				System.out.println(Arrays.toString(tmp));
//				answer[i]=tmp[0];
//				continue;
//			}
			if (tmp[0] < score[i]) {
				tmp[0] = score[i];
				Arrays.sort(tmp);
				System.out.println(Arrays.toString(tmp));
			}
			answer[i] = tmp[0];

		}

		return answer;

	}

	public static void main(String[] args) {

		int[] answer = { 10, 100, 20, 150, 1, 100, 200 };
		System.out.println(Arrays.toString(solution(3, answer)));

//		int[] answers = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
//		System.out.println(Arrays.toString(solution(4, answers)));
	}
}
