package baekjoon;


public class Main {

	static int solution(String t, String p) {
		int answer = 0;
		String tmp = "";
		for(int i = 0 ; i < t.length() - p.length() +1 ; i++) {
			tmp=t.substring(i, i+p.length());
			if((long)Integer.valueOf(tmp)<=(long)Integer.valueOf(p)) answer++;	
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		System.out.println(solution("3141592","271"));
		System.out.println(solution("500220839878","7"));
		System.out.println(solution("10203","15"));


	}
}
