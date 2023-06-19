package baekjoon;

import java.util.Arrays;

public class Main {

	static long solution(long n) {
		long answer = 0 ;
		String tmp = Long.toString(n);
		int len = tmp.length();
		String ans ="";
		int t = 0;
		int[] temp = new int [len];
		for(int i = 0 ; i < len ; i++) {
			temp[i]=tmp.charAt(i)-'0';
		}
		
		for(int i = 0 ; i < len;i++) {
			for(int j = 0 ; j < len-1;j++) {
				if(temp[j]<temp[j+1]) {
					t=temp[j];
					temp[j]=temp[j+1];
					temp[j+1]=t;
				}
			}
		}
		
		for(int i = 0 ; i < len ; i++) {
			ans+=temp[i];
		}
		
		return Long.parseLong(ans);

		
		
	}

	public static void main(String[] args) {
		System.out.println(solution(118372));

	}
}
