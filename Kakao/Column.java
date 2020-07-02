package Kakao;

import java.util.*;
public class Column {
	static boolean isOk(int [][] t) {
		for (int y=0; y<t.length; y++) {
			for (int x=0; x<t.length; x++) {
				if (t[y][x]==0){
					if(y>0) {
						if (t[y-1][x]==-1) {//공중에 떠있는 경우 
							return false;
						}
						else if (t[y-1][x]==0) {
							continue;
						}
						else if (t[y-1][x-1]==1 && t[y-1][x]==1) {
							return false;
						}
						if (t[y-1][x-1]==1 || t[y-1][x]==1) {
							continue;
						}
					}
				}
				else if (t[y][x]==1) {
					if (y==0) return false; //바닥에 보설치 
					else {
						if (t[y-1][x]==0 || t[y-1][x+1]==0) { //한쪽이 기둥 
							continue;
						}else {
							if (x==0) return false; //맨왼쪽인데 어느쪽에도 기둥이 없는경우 false 
						}
						if (x>0) {
							if (!(t[y][x-1]==1 && t[y][x+1]==1)) { //양쪽에 보가 없는경우 false 
								return false;
							}
						}
					}
				}
			}
		}
		return true;
	}

	static int[][] execute(int [][] d, int x, int y, int a, int b) {
		int [][] t = new int [d.length][d.length];
		if (b==1) {
			d[y][x]=a;
		}
		else if (b==0) {
			d[y][x]=-1;
		}
		return t;
	}


	public static int[][] solution(int n, int[][] build_frame) {
		int[][] answer = {};
		int [][] d = new int [n+1][n+1];
		for (int i=0; i<=n; i++) {
			Arrays.fill(d[i], -1);
		}

		for (int i=0; i<build_frame.length; i++) {
			int x = build_frame[i][0];
			int y = build_frame[i][1];
			int a = build_frame[i][2];
			int b = build_frame[i][3];

			if (isOk(execute(d,x,y,a,b))) {
				d = execute(d,x,y,a,b);
			}
		}

		for (int i=0; i<=n; i++) {
			for (int j=0; j<=n; j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}

		return answer;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int [][] build_frame = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};
		
		solution(n, build_frame);
	}
	
	
}
