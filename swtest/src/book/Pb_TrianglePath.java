package book;

public class Pb_TrianglePath {

	static int n;
	static int triangle[][] = new int[100][100];
	static int cache[][] = new int[100][100];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	
	static int path2(int y, int x) {
		
		if(y == n-1)
			return triangle[y][x];
		int ret = cache[y][x];
		if( ret != -1)
			return ret;
		return ret = Math.max(path2(y+1, x), path2(y+1,x+1))+triangle[y][x];
	}



}
