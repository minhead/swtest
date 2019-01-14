package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Pb2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N, M, K, min, sum;

		N = sc.nextInt();
		M = sc.nextInt();
		sum = 0;
		min = 999999999;
		K = M - N + 1;

		int[] arr = new int[K];

		for (int i = 0; i < K; i++) {
			arr[i] = N + i;
		}
		for (int i = 0; i < K; i++) {
			for (int k = 2; k < arr[i]; k++) {
				if (arr[i] % k == 0) {
					break;
				}
				if (k == arr[i] - 1) {
					sum = sum + arr[i];
					int t = arr[i];
					if (min > t) {
						min = t;
					}
				}
			}

		}
		int result = sum;
		if (sum == 0) {
			result = -1;
		}

			
		
		System.out.println(result);
		if (min !=999999999)
		System.out.println(min);

	}

}
