package baekjoon;

import java.util.Arrays;

public class Main {

	static boolean solution(int x) {
		
		String tmp = x+"";
		int len = tmp.length();
		int[] arr = new int[len];
		int hap = 0;
		
		for(int i = 0 ; i < len ; i++) {
			arr[i]=tmp.charAt(i)-'0';
			hap+=arr[i];
		}
	
		
		
		
		
		System.out.println(hap);
		return x%hap==0;
		
		
	}

	public static void main(String[] args) {
		System.out.println(solution(13));

	}
}
