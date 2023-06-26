package baekjoon;

import java.util.Arrays;

public class Main {

	static  int[] solution(int[] array, int[][] commands) {
		int [] answer= new int [commands.length];
		int [] tmp;
		int idx = 0;
		for(int i = 0; i<commands.length ; i++) {
			idx=0;
			tmp=new int [commands[i][1] - commands[i][0]+1];
			for(int j = commands[i][0]-1;j<commands[i][1];j++) {
				tmp[idx]=array[j];
				idx++;				
			}
			Arrays.sort(tmp);			
			answer[i]=tmp[commands[i][2]-1];
		}
		
		return answer;

	}

	public static void main(String[] args) {

		System.out.println(solution(5));

	}
}
