package baekjoon;

import java.util.Arrays;
import java.util.Stack;

public class Main {

	static int solution(int n) {
		int f1 = 0;
		int f2 = 1;
		
		while(f1+f2==n) {
			System.out.println(f1);
			System.out.println(f2);
			f1=f2;
			f2=f1+f2;	
		}
			
			
		
		
		return (f1+f2)%1234567;
		
	}

	public static void main(String[] args) {

		System.out.println(solution(5));

	}
}
