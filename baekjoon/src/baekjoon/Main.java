package baekjoon;

public class Main {

	static String solution(int a, int b) {
		String answer = "";
		int[] arr = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] str = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
		int hap = b;
		for (int i = 0; i < a-1; i++) {
			hap += arr[i];
		}

		return str[hap % 7-1];

	}

	public static void main(String[] args) {
		System.out.println(solution(5, 24));// "TUE"
		System.out.println(solution(1, 11));// "TUE"
		System.out.println(solution(2, 28));// "TUE"
	}
}
