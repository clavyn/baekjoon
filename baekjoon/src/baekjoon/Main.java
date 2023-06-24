package baekjoon;


public class Main {

	static int solution(int[][] sizes) {
		int len = sizes.length;
		int tmp = 0;
		int weight = 0;
		int height = 0;
		for(int i = 0 ; i < len ; i++) {
			if(sizes[i][0]<sizes[i][1]) {
				tmp=sizes[i][0];
				sizes[i][0]=sizes[i][1];
				sizes[i][1]=tmp;
			}
			if(weight<sizes[i][0]) weight = sizes[i][0];
			if(height<sizes[i][1]) height=sizes[i][1];
		}
		
		
		return height*weight;

	}

	public static void main(String[] args) {
		int[][] size = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
		
		System.out.println(solution(size));


	}
}
