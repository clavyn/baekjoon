package baekjoon;

import java.util.Stack;

public class Main {

	static int solution(int n) {
		int answer = 0;
		boolean flag = true;
		String bin = "";
		int idx = n + 1;
		bin = Integer.toBinaryString(n);
		char[] arr = bin.toCharArray();
		int oneCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '1')
				oneCnt++;
		}
		
		String tmp = "";
		char[] temp;
		int cnt = 0;
		while (flag) {
			tmp = Integer.toBinaryString(idx);
			temp = tmp.toCharArray();
			cnt=0;
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] == '1')
					cnt++;
			}
			
			if (cnt == oneCnt) {
				answer = idx;
				flag = false;
				break;
			}
			idx++;
		}

		return answer;

	}

	public static void main(String[] args) {
		System.out.println(solution(78));// 83
		System.out.println(solution(15));// 23

	}
}
