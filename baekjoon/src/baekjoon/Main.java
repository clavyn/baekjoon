package baekjoon;

import java.util.HashMap;

public class Main {

	static int solution(int[] nums) {
		int gets = nums.length / 2;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], 1);
		}

		if (map.size() >= gets) {
			return gets;
		} else {
			return map.size();
		}

	}

	public static void main(String[] args) {

		int[] nums = { 3, 3, 3, 2, 2, 4 };
		int[] num = { 3, 3, 3, 2, 2, 2 };
		int[] tmp = { 3, 1, 2, 3 };
		System.out.println(solution(nums));// 3
		System.out.println(solution(num));// 2
		System.out.println(solution(tmp));// 2

	}
}
