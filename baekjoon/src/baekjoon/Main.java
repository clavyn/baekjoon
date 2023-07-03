package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	static int[] solution(int[] answers) {
	
		int[] answer;
		int [] one = {1,2,3,4,5};		
		int [] two = {2,1,2,3,2,4,2,5};
		int [] three = {3,3,1,1,2,2,4,4,5,5};
		int [] score  = new int [3];  
		for(int i = 0 ; i < answers.length ; i++) {
			if(answers[i]==one[i%5])score[0]++;
			if(answers[i]==two[i%8])score[1]++;
			if(answers[i]==three[i%10])score[2]++;			
		}
		int max = score[0];
		for(int i = 1; i <=2; i++) {
			if(max<score[i])max=score[i];
		} 
		ArrayList<Integer> alist = new ArrayList<>();
		for(int i = 0 ; i<score.length; i++) {
			if(score[i]==max)alist.add(i+1);
		}
		answer = new int[alist.size()];
		for(int i = 0 ; i < alist.size(); i ++) {
			answer[i]=alist.get(i);
					
		}
		
		
		return answer;

	}

	public static void main(String[] args) {

		int[] score = { 1,2,3,4,5};
		System.out.println(Arrays.toString(solution(score)));// 3

	}
}
