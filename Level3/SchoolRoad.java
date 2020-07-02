package Level3;

import java.util.*;

class Pair{
	int x;
	int y;
	Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
}


public class SchoolRoad {
	
	static final int [] dx = {0,0,1,-1};
	static final int [] dy = {1,-1,0,0};
	
	
	static void go(int m, int n, boolean [][] checked, int [][] a) {
		Queue<Pair> q = new LinkedList<>();
		
		checked[0][0] = true;
		q.add(new Pair(0,0));
		a[0][0] = 0;
		
		while(!q.isEmpty()) {
			Pair p = q.poll();
			int x = p.x;
			int y = p.y;
			
			for (int k=0; k<4; k++) {
				int nx = x+dx[k];
				int ny = y+dy[k];
				if (nx>=0 && nx<n && ny>=0 && ny<m) {
					if (checked[nx][ny]==false) {
						a[nx][ny] = a[x][y] + 1;
						checked[nx][ny] = true;
						q.add(new Pair(nx,ny));
					}
				}
			}
			
		}
		
	}
	
	public int solution(int m, int n, int[][] puddles) {
		int answer = 0;
		boolean [][] checked = new boolean[n][m];
		int [][] a = new int [n][m];
		
		for (int i=0; i<puddles.length; i++) {
			checked[puddles[i][0]-1][puddles[i][1]-1] = true;
		}
		go(m,n,checked,a);
		answer = a[n-1][m-1];
		
		
		
		return answer;
	}
}
