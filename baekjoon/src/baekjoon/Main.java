package baekjoon;

import java.util.Arrays;

public class Main {

	static boolean solution(String s) {
		if (s.length() != 4 || s.length() != 6)
			return false;
		char[] arr = s.toCharArray();
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if('0'<arr[i]&&arr[i]<'9') {
				cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println(arr.length);
		return cnt==arr.length;
	}

	public static void main(String[] args) {
		System.out.println(solution("1234"));

	}
}
