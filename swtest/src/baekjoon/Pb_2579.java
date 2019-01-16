package baekjoon;

import java.util.Scanner;

public class Pb_2579 {

	static int N;
	static int score[];
	static int dp[];

	private static int dp(int n) {
		if (n == 1) {
			return score[1];
		}
		if (n == 2) {
			return score[1] + score[2];
		}
		if (n > 2) {

			if (dp[n - 2] == 0 && dp[n - 3] == 0) {
				dp[n] = Math.max(dp(n - 2) + score[n], dp(n - 3) + score[n - 1] + score[n]);
			} else if (dp[n - 2] != 0 && dp[n - 3] == 0) {
				dp[n] = Math.max(dp[n - 2] + score[n], dp(n - 3) + score[n - 1] + score[n]);
			}
			return dp[n];
		}
		return n;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		score = new int[N + 1];
		dp = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			score[i] = sc.nextInt();
		}
		System.out.println(dp(N));

	}

}
