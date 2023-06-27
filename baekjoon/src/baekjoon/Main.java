package baekjoon;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

	static int[] solution(int n, String[] words) {
		int answer = 0 ;
		int remain = n;
		while(remain/a>=1) {
			answer+=remain/a*b;
			remain = (remain/a*b)+remain%a;			
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		System.out.println(Arrays.toStrins(solution(2,1,20)));//19
		System.out.println(solution(3,1,20));//9
		
		
	}
}
