package baekjoon;

import java.util.Arrays;

public class Main {

	static int[] solution(int n, int m) {
		boolean flag = false;
		int max = 0;//최대공약수
		int min = 0;//최소공배수
		if(n>m) {
			int t = n ;
			n = m;
			m=t;
		}		
		if((m/(double)n)%1==0) {
			max=n;
			min=m;
		}
		
		//최대공약수 구하기
		for(int i = 0 ; i <m ;i++) {
			if((((double)n/i)%1==0)&&(((double)m/i)%1==0)) {
				max=i;
			}
		}
		//최소공배수 구하기
		int tmp=0;
		int mul = 0;
		for(int i = 1; i<m;i++) {
			tmp = m*i;
			for(int j = 1 ; j <tmp ; j++) {			
				if(tmp==mul) {
					min = tmp;
					flag=true;
					break;
				}
				mul=n*j;
			}
			if(flag) break;
		}
		
		
		
		int [] answer = {max,min};
		return answer;

	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(3,12)));
		System.out.println(Arrays.toString(solution(2,5)));
	}
}
