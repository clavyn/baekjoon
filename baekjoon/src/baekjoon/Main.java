package baekjoon;

public class Main {

	static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String tmp = "";
		String[] temp1 = new String[n];
		String[] temp2 = new String[n];

		for (int i = 0; i < n; i++) {

			temp1[i] = Integer.toBinaryString(arr1[i]);
			temp2[i] = Integer.toBinaryString(arr2[i]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < temp1[i].length(); j++) {

				if (temp1[i].charAt(j) == '0' || temp2[i].charAt(j) == '0') {
					tmp += '#';
				} else {
					tmp += ' ';
				}
			}
			answer[i] = tmp;
			tmp = "";
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		System.out.println(solution(5, arr1, arr2));

	}
}
