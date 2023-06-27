package baekjoon;

import java.util.Arrays;

public class Main {

	static int[] solution(String s) {
		int[] answer = new int [s.length()];
		answer[0]=-1;
		char[] tmp = s.toCharArray();
		for(int i = 1 ; i < answer.length ; i++) {
			for(int j = i-1 ; j>=0; j--) {
				if(tmp[j]==tmp[i]) {
					answer[i]=i-j;
					break;
				}
				if(j==0) {
					answer[i]=-1;
				}
			}
		}
		
		
		return answer;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution("banana")));// [-1,-1,-1,2,2,2]
		System.out.println(Arrays.toString(solution("foobar")));// [-1, -1, 1, -1, -1, -1]

	}
}
