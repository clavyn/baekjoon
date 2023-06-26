package baekjoon;

public class Main {

	static long solution(int num) {
		long[] array = new long[num + 1]; // 인덱스는 0부터 시작하니까 크기를 지정할때 num+1로
		array[0] = 0;
		array[1] = 1;

		for (int i = 2; i <= num; i++) {
			array[i] = array[i - 1] + array[i - 2];

		}

		return array[num];

	}

	public static void main(String[] args) {

		System.out.println(solution(5));

	}
}
