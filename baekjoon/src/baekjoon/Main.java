package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	static int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int big = 0;
		int small = 0;
		for (int i = 1; i <= yellow; i++) {
			if (((yellow / (double)i)) % 1 == 0.0) {
				big = yellow / i;
				small = i;
				if ((big + small) * 2 + 4 == brown) {
					if (big + 2 < small + 2) {
						continue;
					} else {
						answer[0] = big + 2;
						answer[1] = small + 2;
						break;
					}
				}

			} else
				continue;

		}

		return answer;

	}

	public static void main(String[] args) {
//
//		System.out.println(Arrays.toString(solution(10, 2)));
//		System.out.println(Arrays.toString(solution(8, 1)));
		System.out.println(Arrays.toString(solution(50, 22)));//[5,5]
	

	}
}
