package baekjoon;

import java.util.Scanner;

public class Pb11051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N, K;
		int answer;
		
		N = sc.nextInt();
		K = sc.nextInt();
		System.out.println(choose(N,K)%10007);
		

	}
	
	static long choose(int n, int r) {
		if(n==r || r==0) {
			return 1;
		}
		
		return choose(n-1, r-1) +choose(n-1,r);
	}
	
	

}
