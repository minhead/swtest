package training;
import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Solution1 {

	static int A, B, cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for (int test_case = 1; test_case <=T; ++test_case) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			int Answer =0;
			System.out.println("#"+test_case+" "+Answer);
		}
		

	}
	public void Stack() {
		Stack<Integer> st = new Stack<Integer>();
		int num[] = {1,2,3,4,5};
		
		for (int i : num) {
			st.push(i);
		}
		
		
	}
	
	public void Queue() {
		Queue<String> q = new LinkedList<>();
		String arr[] = {"a","b","c"};
		
		
	}
	public void asc() {
		int[] temp = new int[] {4,2,1,3};
		Arrays.sort(temp);
		for(int k : temp)
			System.out.print(k);
		
	}

}
