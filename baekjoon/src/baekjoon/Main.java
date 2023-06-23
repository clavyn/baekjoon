package baekjoon;


public class Main {

	static String solution(String s, int n) {
		String answer="";
		int origin = n;
		char [] arr = s.toCharArray();
		for(int i = 0; i< arr.length ; i++) {
			n=origin;
			if(arr[i]==' ') {
				answer+= ' ';
				continue;
				}
			if(Character.isUpperCase(arr[i])) {
				answer+=(char)((arr[i]-'A'+n)%26 + 'A');
				
			}else if(Character.isLowerCase(arr[i])) {
				answer+=(char)((arr[i]-'a'+n)%26 + 'a');
			}
		}
		
		return answer;

	}

	public static void main(String[] args) {
		System.out.println(solution("AB",1));


	}
}
