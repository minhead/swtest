package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb13241 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String t = br.readLine();
		String[] arr = t.split(" ");
		long a = Integer.parseInt(arr[0]);
		long b = Integer.parseInt(arr[1]);
		long low=0;
		long result = 0;
		for(int i = 1; i<Math.min(a, b); i++) {
			if(a%i==0 && b%i==0) {
				low = i;
			}
		}
		result = a*b/low;
		System.out.println(result);
		

	}

}
