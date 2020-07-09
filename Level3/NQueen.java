package Level3;

public class NQueen {

	static boolean [][] a = new boolean [12][12];
	static boolean [] check_col = new boolean[12];
	static boolean [] check_dig = new boolean[40];
	static boolean [] check_dig2 = new boolean[40];

	public boolean check(int row, int col, int n){
		if (check_col[col]){
			return false;
		}
		if (check_dig[row+col]){
			return false;
		}
		if (check_dig2[row-col+n]){
			return false;
		}
		return true;
	}

	public int calc(int row, int n){
		if (row==n) return 1;
		int cnt = 0;
		for (int col=0; col<n; col++){
			if (check(row, col, n)){
				check_col[col] = true;
				check_dig[row+col] = true;
				check_dig2[row-col+n] = true;
				a[row][col] = true;
				cnt += calc(row+1, n);
				check_col[col] = false;
				check_dig[row+col] = false;
				check_dig2[row-col+n] = false;
				a[row][col] = false;
			}
		}
		return cnt;
	}

	public int solution(int n) {
		int answer = calc(0,n);

		return answer;
	}
}
