package baekjoon;

import java.util.Arrays;

public class Main {

	static int solution(int [] people, int limit) {
		int answer = 0;
		int min = 0;
		Arrays.sort(people);
		for(int i = people.length -1 ; min <= i; i--) {
			if(people[min] + people[i]<=limit) min ++;
			answer++;
				
			
		}
		
		
		
		return answer;

	}

	public static void main(String[] args) {
		
		int[] people = {70,50,80,50};
		System.out.println(solution(people, 100));//3

	}
}
