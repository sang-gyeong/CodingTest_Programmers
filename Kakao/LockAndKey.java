package Kakao;

import java.util.*;

//class Pair{
//	int x;
//	int y;
//	Pair(int x, int y){
//		this.x = x;
//		this.y = y;
//	}
//}

public class LockAndKey {
	
	//돌기수 < 빈공간 인지 체크. 돌기가 부족하면 true
	static boolean isLack(int[][] key, int[][] lock) {
		int n = lock.length;
		int m = key.length;
		
		int empty = 0;
		int fill = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (lock[i][j]==0) empty ++;
			}
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				if (key[i][j]==1) fill ++;
			}
		}
		
		if (fill<empty) return true;
			
		return false;
	}
	
	//돌기수 == 빈공간 인지 체크.
	static boolean isSame(int[][] key, int[][] lock) {
		int n = lock.length;
		int m = key.length;
		
		int empty = 0;
		int fill = 0;
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (lock[i][j]==0) empty ++;
			}
		}
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				if (key[i][j]==1) fill ++;
			}
		}
		
		if (fill==empty) return true;
			
		return false;
	}
	
	static int[][] rotate(int[][] key) {
		int m = key.length;
		int [][] r = new int [m][m];
		for (int i=0; i<m; i++) {
			Arrays.fill(r, 0);
		}
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				if (key[i][j]==1) {
					r[j][m-i]=1;
				}
			}
		}
		return r;
	}
	
	//키가 맞는지 체크 (isSame==true이어야함)
	public boolean check(int[][]key, int[][]lock) {
		List<Pair> list2 = new ArrayList<>();
		for (int i=0; i<key.length; i++) {
			for (int j=0; j<key.length; j++) {
				if (key[i][j]==1) {
					list2.add(new Pair(i,j));
				}
			}
		}
		for (int i=0; i<list2.size(); i++) {
			if (list.get(i)!=list2.get(i)) return false;
		}
		return true;
	}
	
	
	static List<Pair> list = new ArrayList<>();
	public boolean solution(int[][] key, int[][] lock) {
		boolean answer = true;
		list = new ArrayList<>();
		List<Pair> list2 = new ArrayList<>();
		if (isLack(key, lock)) return false;
		
		for (int i=0; i<lock.length; i++) {
			for (int j=0; j<lock.length; j++) {
				if (lock[i][j]==0) {
					list.add(new Pair(i,j));
				}
			}
		}
		if (isSame(key, lock)) {
			if (check(key, lock)) {
				return true;
			}
		}
		
		int count = 0;
		while (count <4) {
			
			
			
			
			
			int[][]r = rotate(key);
			
			count +=1;
		}
		
		
	
		
		return answer;
	}
}
