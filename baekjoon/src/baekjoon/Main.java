package baekjoon;

import java.util.Arrays;

public class Main {

	static String solution(String phone_number) {
		
		int front = phone_number.length()-4;
		String star ="";
		for(int i = 0 ; i < front ; i++) {
			star+="*";
		}
		return star+phone_number.substring(phone_number.length()-4, phone_number.length());
		
		
	}

	public static void main(String[] args) {
		System.out.println(solution("01033334444"));

	}
}
