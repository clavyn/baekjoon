package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[] solution (int n , int m) {
		int[] answer = new int [2];
		if(m%n==0) {
			answer[0] = n;
			answer[1] = m;
		}else {
			answer[0]=1;
			answer[1]=n*m;
		}

		return answer;
	}
	

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution(6,14)));
	}
}
