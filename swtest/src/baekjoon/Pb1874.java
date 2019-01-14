package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Pb1874 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        int i, temp, max = 0, top = 0;
        int stack[] = new int[n];
        
        while (n-- > 0) {
            temp = Integer.parseInt(br.readLine());
            
            if (temp > max) {
                // 스택에 값이 없는 상태
                for (i = max+1; i <= temp; i++) {
                    stack[top++] = i;
                    sb.append("+\n");
                }
                max = temp;
            }else if (stack[top - 1] != temp) {
                System.out.print("NO");
                return;
            }
 
            top--;
            sb.append("-\n");
        
        }// end while
        
        System.out.println(sb);

		
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		LinkedList<Integer> stack = new LinkedList<>();
//		arr = new int[n];
//		for(int i = 0; i<n; i++) {
//			arr[i] = sc.nextInt();
//		}

	}

}
