package training;

public class Scissors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 0;
		int hi = 1000000;
		int Answer;
		int N = 0;
		
		int k = 10; //���Ǵ� ������ Ƚ��
		while (low<=hi) {
			int cnt =1;  //������Ƚ��
			int min = 1000000; //���� �ȿ��ִ� min��
			int max = 0;  //���� �ȿ��ִ� max��
			int gap = -1; // max - min
			int mid=(low+hi)/2; // �߰������� �������� �������� üũ
			int C[] = new int [N+1];
			for(int i = 1; i<=N; i++) {
				if(min>C[i]) min=C[i];
				if(max<C[i]) max=C[i];
				gap = max -min;
				if(gap>mid) {
					cnt++;
					min=C[i];
					max=C[i];
				}
			}
			if(cnt>k) low=mid+1;
			else {
				hi=mid-1;
				Answer=mid; //����ߴ� �������� ��ȿ��
			}
		}
		

	}

}
