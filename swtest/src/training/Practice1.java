package training;

public class Practice1 {

	static int arr[] = new int[100];

	public static int fibonacci(int n) {

		if(n==0) {
			return 0;
		}else if (n==1) {
			return 1;
		}else {
			System.out.println("fibonacci "+n);
		return fibonacci(n-2) + fibonacci(n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 10;
		for(int i = 1;i<101;i++)
		{
			arr[i] = -1;
		}

		System.out.println(fibonacci(N));

	}

}
