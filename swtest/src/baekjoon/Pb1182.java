package baekjoon;

import java.util.Scanner;

public class Pb1182 { // 부분집합의 합

	static int N;
	static int S;
	static int cnt = 0;
	static int[] arr;

	static void solve(int sum, int step) {
		if (step == N) {
			if (sum == S) {
				cnt++;
				return;
			}
		}

		solve(sum + arr[step], step + 1);
		solve(sum, step + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.nextInt();
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		solve(0, 0);

		if (S == 0) {
			cnt = cnt - 1;
		}
		System.out.println(cnt);

	}

}
