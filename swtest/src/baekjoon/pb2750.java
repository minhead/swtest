package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class pb2750 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, tmp;
		
		num = sc.nextInt();
		int[] sort = new int[num];
		
		for(int i = 0; i<num; i++) {
			sort[i] = sc.nextInt();
		}
		
		for(int i =0; i<num-1; i++) {
			for(int j = i+1; j<num; j++) {
				
			}
		}
		
		Arrays.sort(sort);
		for(int a : sort) {
			System.out.println(a);
		}

	}

}
