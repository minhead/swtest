package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pb1934 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int test_case = Integer.parseInt(br.readLine());
        
        for(int i = 1; i<=test_case ; i++) {
        	String n = br.readLine();
        	String[] arr = n.split(" ");
        	int a = Integer.parseInt(arr[0]);
        	int b = Integer.parseInt(arr[1]);
        	
        	int result = 0;
        	int low = 0;
        	for(int j=1; j<=Math.min(a, b); j++) {
        		if((a%j==0)&&(b%j==0)) {
        			low = j;
        		}
        		result = a*b/low;
        	}
        	
//        	System.out.println(test_case);
//        	System.out.println(a+" =++"+b);
        	
        }
        


	}

}
