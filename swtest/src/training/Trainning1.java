package training;

public class Trainning1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		
		int answer = sum(n);
		System.out.println(answer);
		select(5);

	}
	public static int sum(int n) {
		int result;
		if(n==1) {
			return 1;
		}
		result = n+sum(n-1);
		return result;
	}
	
	public static void select(int k) {
		for(int a = 0; a<k ; a++) {
			for(int b = a+1; b<k; b++) {
				for(int c = b+1; c<k; c++) {
					for(int d = c+1; d<k; d++) {
						System.out.print(a);
						System.out.print(b);
						System.out.print(c);
						System.out.print(d);
						System.out.println();
					}
				}
			}
		}
	}

}
