package baekjoon;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

	static int[] solution(String[] name, int[] yearning, String[][] photo) {
		int[] answer = new int [photo.length];
		int tmp=0;
		HashMap<String, Integer> hm = new HashMap<>();
		for(int i = 0 ; i<name.length;i++) {
			hm.put(name[i], yearning[i]);
		}
		for(int i = 0 ; i < photo.length ; i++) {
			tmp=0;
			for(int j = 0 ; j<photo[i].length ; j++) {
				if(hm.containsKey(photo[i][j]))				
				tmp+=hm.get(photo[i][j]);
				else continue;
			}
			answer[i]=tmp;
			
		}
		
		return answer;
	}

	public static void main(String[] args) {
		String[] name= {"may", "kein", "kain", "radi"};
		int [] yearning = {5,10,1,3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		System.out.println(Arrays.toString(solution(name,yearning,photo)));
		
		
	}
}
