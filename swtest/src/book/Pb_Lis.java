package book;
import java.util.*;
public class Pb_Lis {

	static int n;
	static int cache[] = new int [100];
	static int S[] = new int [100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int lis2(int start) {
		int ret = cache[start];
		if(ret!= -1)
			return ret;
		ret = 1;
		for(int next = start+1; next<n; next++) {
			if(S[start] < S[next])
				ret = Math.max(ret, lis2(next)+1);
		}
				
		return ret;
	}

}
