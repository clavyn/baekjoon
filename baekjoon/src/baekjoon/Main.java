package baekjoon;

import java.util.Arrays;

public class Main {

	static String[] solution(String[] strings, int n) {
		String tmp;
		Arrays.sort(strings);
		for(int i = 0 ; i < strings.length ; i++) {
			for(int j = 0 ; j < strings.length-1; j++) {
				if(strings[j].charAt(n)>strings[j+1].charAt(n)) {
					tmp=strings[j];
					strings[j]=strings[j+1];
					strings[j+1] = tmp;
				}
			}
		}
		return strings;
		
		
	}

	public static void main(String[] args) {

		String [] strings = {"sun","bed","car"};
		String [] string = {"abce", "abcd", "cdx"};
		System.out.println(Arrays.toString(solution(string,2)));
		System.out.println(Arrays.toString(solution(strings,1)));

	}
}
