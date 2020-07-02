public class Friends4Block { //프렌즈4블록 
	static char [][] a = new char [33][33];
	static boolean [][] b = new boolean [33][33];
	static int answer;
	static boolean stop(int m, int n) {//없앨 블록이 있는지 확인
		boolean c = true;
		for (int i=0; i<m-1; i++) {
			for (int j=0; j<n-1; j++) {
				if (a[i][j]!='#' && a[i][j]==a[i][j+1] && a[i][j+1]==a[i+1][j+1] && a[i+1][j+1]==a[i+1][j]) {
				c=false;
				}
			}
		}
		return c; //없앨블록이 없으면 true 
	}
	static void check(int m, int n) {//없어질 블록위치 true처리 
		for (int i=0; i<m-1; i++) {
			for (int j=0; j<n-1; j++) {
				if (a[i][j]!='#' && a[i][j]==a[i][j+1] && a[i][j+1]==a[i+1][j+1] && a[i+1][j+1]==a[i+1][j]) {
					b[i][j]=true;
					b[i][j+1]=true;
					b[i+1][j]=true;
					b[i+1][j+1]=true;
				}
			}
		}
		return; 
	}
	static void move(int m, int n) {//블록 내려오기 
		for(int j=0; j<n; j++) {
			for (int i=m-1; i>=0; i--) {
				for (int k=i-1; k>=0; k--) {
					if(a[i][j]=='#' && a[k][j]!='#') {
						char tmp = a[k][j];
						a[k][j] = '#';
						a[i][j]= tmp;
					}
				}
			}
		}
	}
	public static void go(int m, int n) {
		if (stop(m, n)) {
			return;
		}
		check(m,n);
		for(int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				if(b[i][j]==true) { //없어지는 블록 처리 & 갯수세기 
					a[i][j]='#';
					answer++;
					b[i][j]=false;
				}
			}
		}
		move(m,n);
		go(m,n);
	}
	public static int solution(int m, int n, String[] board) {
		answer = 0;
		a = new char [m][n];
		b = new boolean [m][n];
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				a[i][j]=board[i].charAt(j);
			}
		}
		go(m,n);
		return answer;
	}
}