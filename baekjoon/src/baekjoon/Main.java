package baekjoon;

import java.util.Arrays;

public class Main {

	static int[][] solution(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
        		
		int[][] answer = new int [len][len];
        for(int i = 0 ; i < len;i++) {
        	for(int j = 0 ; j < arr1[i].length ; j++) {
        		answer[i][j]= arr1[i][j]+arr2[i][j];        	
        		}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[][] arr1 = { { 1 }, { 2} };
		int[][] arr2 = { { 3 }, { 4 } };
		System.out.println(Arrays.deepToString(solution(arr1, arr2)));
	}
}
