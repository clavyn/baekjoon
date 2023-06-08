package baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// 우선 내림차순으로 정렬 후 , 원래 배열(정렬되지 않은 배열)과 비교하여 해당 값이 있는 인덱스를 추출한다.
		// 배열안에 있는 정렬기능을 사용하지 않고 버블정렬로 할 것
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[8];
		int total = 0;
		int[] index = new int[5];

		for (int i = 0; i < 8; i++) {
			scores[i] = (sc.nextInt());
		} // 입력받은 배열

		int[] origin = Arrays.copyOf(scores, 8);// origin에는 입력받은 순서 그대로의 점수가 저장됨(이 때 origin = scores라고 주소로 참조하게 되면
		// 값이 아닌 주소를 참조하는 것이기 때문에 scores의 값이 바뀌면 origin의 값이 함께 바뀐다.)

		for (int i = 0; i < 8; i++) {// 내림차순 정렬
			for (int j = 0; j < 7; j++) {
				if (scores[j] < scores[j + 1]) {
					int tmp = scores[j + 1];
					scores[j + 1] = scores[j];
					scores[j] = tmp;
				}
			}
		}
		/*
		 * for(int i = 0; i<5;i++) { total+=scores[i]; }
		 */
		for (int i = 0; i < 5; i++) {
			total += scores[i];
			for (int j = 0; j < 8; j++) {
				if (scores[i] == origin[j]) {

					index[i] = j + 1;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (index[j] > index[j + 1]) {
					int tmp = index[j];
					index[j] = index[j + 1];
					index[j + 1] = tmp;
				}
			}
		}

		System.out.println(total);
		for (int i = 0; i < 5; i++) {
			if (i != 4) {
				System.out.print(index[i] + " ");
			} else {
				System.out.print(index[i]);
			}
		}

	}
}
