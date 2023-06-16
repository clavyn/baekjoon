package baekjoon;

import java.util.Arrays;

public class Main {

	 static int[] solution(long n) {
		 	String str = String.valueOf(n);
		 	int[] answer = new int[str.length()];
	        int idx=answer.length-1;
	        for(int i = 0 ; i<answer.length; i++) {
	        	answer[i] = Integer.parseInt(str.charAt(idx)+"");
	        	idx--;
	        }
	        
	        return answer;
	    }
	


	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(12345)));

	}
}
