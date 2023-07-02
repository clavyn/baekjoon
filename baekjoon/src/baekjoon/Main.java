package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static int[] solution(int[] answers) {
	
		int[] answer;
		int [] one = {1,2,3,4,5};
		int [] scoring = new int[answers.length];
		for(int i = 0; i< scoring.length ; i++) {
				scoring[i]=one[i];
			
		}
		int [] two = {2,1,2,3,2,4,2,5};
		int [] three = {3,3,1,1,2,2,4,4,5,5};
		int onecnt = 0;
		for(int i = 0; i <answers.length ; i++) {
			if(i>one.length)
			if(answers[i]==one[i]) {
				onecnt++;
			}
		}
		
		return one;

	}

	public static void main(String[] args) {

		int[] score = { 1,3,2,4,2};
		System.out.println(Arrays.toString(solution(score)));// 3

	}
}
