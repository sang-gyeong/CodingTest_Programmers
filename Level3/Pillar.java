package Level3;

import java.util.*;

class Build{
	int x;
	int y;
	int a;
	Build(int x, int y, int a){
		this.x = x;
		this.y = y;
		this.a = a;
	}
}


public class Pillar {

	static boolean CanConstructPillar(int x, int y, int[][]pillar, int[][]beam) {
		if (y==0) return true; //바닥위 
		if (pillar[y+1][x]==1) return true; //다른 기둥 위 
		if (x==0) {
			if (beam[y][x]!=1) {//x==0 & 보의 한쪽 끝이 아닐 때 
				return false;
			}
		}else if(x==beam.length-1) {
			if (beam[y][x-1]!=1) {//x==d.length-1 &보의 한쪽 끝이 아닐 때 
				return false;
			}
		}else {
			if (beam[y][x-1]==1 || beam[y][x]==1) {
				if (beam[y][x-1]==1 && beam[y][x]==1) return false; //양쪽 다 보일때 
				else return true;
			}
		}
		return true;
	}


	static boolean CanConstructBeam(int x, int y, int[][]pillar, int[][]beam) {
		if (pillar[y+1][x]==1 || pillar[y+1][x+1] == 1) { //한쪽 끝 부분이 기둥 위 
			return true;
		}
		if (x!=pillar.length-1 && x!=0) {//양쪽 끝이 다른 보와 동시에 연결 
			if (beam[y][x-1]==1 && beam[y][x+1]==1) {
				return true;
			}
		}
		return false;
	}


	static boolean CanDestruct(int x, int y, int a, int[][]pillar, int[][]beam) {
		int [][] c = new int [pillar.length][pillar.length];

		for (int i=0; i<pillar.length; i++) {
			for (int j=0; j<pillar.length; j++) {
				if (a==0) {
					c[i][j] = pillar[i][j];
				}
				else if(a==1) {
					c[i][j] = beam[i][j];
				}
			}
		}
		c[y][x] = -1; 

		if (a==0) {
			if (check(c, beam)==true) return true;
		}else if(a==1) {
			if (check(pillar, c)==true) return true;
		}
		return false;
	}


	static boolean check(int[][]pillar, int[][]beam) {
		for (int i=0; i<pillar.length; i++) {
			for (int j=0; j<pillar.length; j++) {
				if (pillar[i][j]==1) {
					if (i!=pillar.length-1) {
						if (pillar[i+1][j]!=1) {
							if (j==0 && beam[i][j]!=1) {
								return false;
							}else if (j==pillar.length-1) {
								if (beam[i][j-1]!=1) {
									return false;
								}
							}else {
								if (beam[i][j]==1 || beam[i][j-1]==1) {
									if (beam[i][j]==1 && beam[i][j-1]==1) {
										return false;
									}
									return true;
								}
							}

						}
					}
				}
				if (beam[i][j]==1) {
					if (j>=1 && j<=pillar.length-3) {
						if (beam[i][j-1]==1 && beam[i][j+1]==1) return true;
					}
					if (pillar[i+1][j]==1 || pillar[i+1][j+1]==1) return true;
				}
			}
		}
		return false;
	}



	public int[][] solution(int n, int[][] build_frame) {
		ArrayList<Build> list = new ArrayList<>();
		
		int [][] pillar = new int [n+1][n+1];
		int [][] beam = new int [n+1][n+1];

		for (int i=0; i<=n; i++) {
			Arrays.fill(pillar[i], -1);
			Arrays.fill(beam[i], -1);
		}

		for (int i=0; i<build_frame.length; i++) {
			int x=build_frame[i][0];
			int y=n-build_frame[i][1];
			int a=build_frame[i][2];
			int b=build_frame[i][3];


			if (b==1) {//설치 
				if (a==0) {//기둥 설치 
					if (CanConstructPillar(x, y, pillar, beam)==true) {
						pillar[y][x]=1;
					}
				}else if(a==1) {//보 설치 
					if (CanConstructBeam(x, y, pillar, beam)==true) {
						beam[y][x]=1;
					}
				}
			}else if (b==0) {//제거 
				if (CanDestruct(x, y, a, pillar, beam)==true) {
					if (a==0) {
						pillar[y][x]=-1;
					}else if (a==1) {
						beam[y][x]=-1;
					}
				}
			}
		}
		
		for (int i=pillar.length-1; i>=0; i--) {
			for (int j=0; j<pillar.length; j++) {
				if (pillar[i][j]==1) {
					list.add(new Build(j, n-i, 0));
				}
				if (beam[i][j]==1) {
					list.add(new Build(j, n-i, 1));
				}
			}
		}
		int [][] answer = new int [list.size()][3];
		
		for (int i=0; i<list.size(); i++) {
			answer[i][0]=list.get(i).x;
			answer[i][1]=list.get(i).y;
			answer[i][2]=list.get(i).a;
		}

		return answer;
	}
	public static void main(String[] args) {
		
		
	}
}
