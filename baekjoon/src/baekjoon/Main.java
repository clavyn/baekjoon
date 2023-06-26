package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	static int[] solution(int[] numbers) {
		int[] answer;
		ArrayList<Integer> arr = new ArrayList<>();
		int tmp = 0;
		for(int i = 0 ; i<numbers.length;i++) {
				tmp=numbers[i];
			for(int j = i+1 ; j < numbers.length ; j++) {
				if(!arr.contains(tmp+numbers[j])) {
				arr.add(tmp+numbers[j]);
				}
			}
		}
		
		Collections.sort(arr);
		answer = new int [arr.size()];
		for(int i = 0 ; i < arr.size(); i++) {
			answer[i]=arr.get(i);
		}
		
		return answer;

	}

	public static void main(String[] args) {
		int [] numbers = {2,1,3,4,1};
		System.out.println(Arrays.toString(solution(numbers)));
		int [] number = {5,0,2,7};
		System.out.println(Arrays.toString(solution(number)));

	}
}
