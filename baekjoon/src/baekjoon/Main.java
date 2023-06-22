package baekjoon;

import java.util.Arrays;

public class Main {

	static int[] solution(String s) {
		int[] answer = new int[2];
		int zeroCnt = 0;
		int twoCnt = 0;

		while(!s.equals("1")) {
			int oneCnt=0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '1') {
					oneCnt++;
				} else {
					zeroCnt++;
				}
			}

			twoCnt++;

			s = Integer.toBinaryString(oneCnt);
			System.out.println("s : "+s);
			
		} 

		answer[0] = twoCnt;
		answer[1] = zeroCnt;
		return answer;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution("01110")));
	}
}
