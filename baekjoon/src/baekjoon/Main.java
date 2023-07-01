package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static int[] solution(int[] answers) {
		int [] tmp = new int[3];
		int[] answer;
		int[] one = { 1, 2, 3, 4, 5 };
		int[] two = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] three = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int oneidx = 0;
		int twoidx = 0;
		int threeidx = 0;
	
		int size = 0;

		for (int i = 0; i < answers.length; i++) {
			if(oneidx>5) oneidx=0;
			if(twoidx>8) twoidx=0;
			if(threeidx>10) threeidx=0;
			if (answers[i] == one[oneidx]) {
				
				tmp[0]++;
			}
			if (answers[i] == two[twoidx]) {
				tmp[1]++;
			}
			if (answers[i] == three[threeidx]) {
				tmp[2]++;
			}
			oneidx ++;
			twoidx++;
			threeidx++;
		}

		if(onehap!=0)size++;
		if(twohap!=0)size++;
		if(threehap!=0)size++;
		
		answer = new int[size];
		for(int i = 0; i< answer.length ; i++) {
			if(onehap!=0) {
				answer[i]=onehap;
			}
			
		}

		return answer;

	}

	public static void main(String[] args) {

		int[] score = { 1,3,2,4,2};
		System.out.println(Arrays.toString(solution(score)));// 3

	}
}
