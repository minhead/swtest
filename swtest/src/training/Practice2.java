package training;

//소수구하기
public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2; // i: 나눌대상
		int num;
		num = 100;
		boolean isPrime = true;

		while (i <= num) {
			isPrime = true;

			for (int n = 2; n < i; n++) {
				if (i % n == 0) {
					isPrime = false;
				}
				continue;
			}

			if (isPrime == true)
				System.out.println(i);
			i++;
		}

	}

}
