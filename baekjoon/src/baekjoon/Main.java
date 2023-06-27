package baekjoon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	static int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		int count = 1;
		Set<String> set = new HashSet<>();
		set.add(words[0]);
		int i = 1;
		for (i = 1; i < words.length; i++) {
			if (set.contains(words[i]))
				break;
			if (words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) {
				set.add(words[i]);
				count++;
			} else
				break;
		}
		if (count == words.length) {
			answer[0] = 0;
			answer[1] = 0;
		} else {
			answer[0] = i % n + 1;
			answer[1] = i / n + 1;
		}
		return answer;

	}

	public static void main(String[] args) {

		String[] words = { "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank" };
		System.out.println(Arrays.toString(solution(3, words)));// [3,3]

		String[] word = { "hello", "one", "even", "never", "now", "world", "draw" };
		System.out.println(Arrays.toString(solution(2, word)));// [1,3]

		String[] twos = { "land", "dream", "mom", "mom" };
		System.out.println(Arrays.toString(solution(2, twos)));// [2,2]

		String[] two = { "land", "dream", "mom", "mom", "ror" };
		System.out.println(Arrays.toString(solution(2, two)));// [2,2]

	}
}
