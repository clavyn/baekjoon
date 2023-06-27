package baekjoon;


public class Main {

	static String solution(int[] food) {
		String answer = "";
		for(int i = 1 ; i < food.length ; i++) {
			for(int j = 0; j<food[i]/2;j++) {
				answer+=i;
			}
		}
		answer+="0";
		
		for(int i = food.length-1 ; i > 0 ; i--) {
			for(int j = 0; j<food[i]/2;j++) {
				answer+=i;
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		int [] food = {1,3,4,6};
		//1223330333221
		int [] foods = {1,7,1,2};
		//111303111
		System.out.println(solution(food));// 0
		System.out.println(solution(foods));// 0

	}
}
