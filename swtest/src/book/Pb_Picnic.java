package book;

import java.util.Scanner;

public class Pb_Picnic {
	static int C;
	static int n;
	static int m;
	static int[][] arr;
	static int result;
	static int couppled[];
	
	public static  int match(int stu) {
		if (stu==0) {
			return 1;

		}
		int k=-1;
		for(int i =0; i<n;i++) {
			if(couppled[i]==0) {
				k=i;
				break;
			}
		}
		
		for(int i=k+1;i<n;i++) {
			if(arr[k][i]==1&&couppled[i]==0) {
				couppled[k]=1;
				couppled[i]=1;
				result += match(stu-2);
			}
		}

		return result;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		int a,b;
		for (int test_case = 1; test_case <= C; test_case++) {
			n= sc.nextInt();
			m = sc.nextInt();
			arr = new int[n][n];
			couppled = new int[n];
			for(int team = 0; team<m; team++) {
				a=sc.nextInt();
				b=sc.nextInt();
				arr[a][b] = 1;
			}
			result = 0;
			match(n);
			System.out.println(result);
			
			
			

		}

	}

}
