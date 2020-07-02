
public class BiggestSquare { //가장 큰 정사각형 찾기 
	static int findMin(int n, int m, int k) {
		int x= 1001;
		if (n<x) x=n;
		if (m<x) x=m;
		if (k<x) x=k;
		return x;
	}
	public int solution(int [][]board){
		int answer = 0;
		int n = board.length;
		int m = board[0].length;
		int [][]d = new int [n][m];
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (i==0 || j==0) {
					if (board[i][j]==1) {
						d[i][j]=1;
					}
					else {
						d[i][j]=0;
					}
				}
				else {
					if(board[i][j]==1) { 
						d[i][j] = findMin(d[i-1][j],d[i][j-1],d[i-1][j-1]) + 1;
					}else {
						d[i][j] = 0;
						continue;
					}
				}
			}

		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (answer<d[i][j]) answer = d[i][j];
			}
		}
		return answer*answer;
	}
}
