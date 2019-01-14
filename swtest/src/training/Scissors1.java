package training;

public class Scissors1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int low = 0;
		int hi = 1000000;
		int Answer;
		int N = 0;
		
		int k = 10; //허용되는 가위질 횟수
		while (low<=hi) {
			int cnt =1;  //가위질횟수
			int min = 1000000; //조각 안에있는 min값
			int max = 0;  //조각 안에있는 max값
			int gap = -1; // max - min
			int mid=(low+hi)/2; // 중간값으로 가위질이 가능한지 체크
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
				Answer=mid; //방금했던 가위질이 유효함
			}
		}
		

	}

}
