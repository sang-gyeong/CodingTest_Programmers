package Kakao;

import java.util.*;

class Pair{
	int x;
	int y;
	Pair (int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Location{
	Pair a;
	Pair b;
	Location(Pair a, Pair b){
		this.a = a;
		this.b = b;
	}
}


public class BlockMove {
	
	static final int [] dx = {0,0,1,-1};
	static final int [] dy = {1,-1,0,0};
	
	static int n;
	static boolean[][] check = new boolean [n][n];
	
	static void bfs() {
		Queue <Location> q = new LinkedList<>();
		q.add(new Location(new Pair(0,0), new Pair(0,1)));
		check[0][0] = true;
		check[0][1] = true;
		
		while(!q.isEmpty()) {
			Location p = q.poll();
			Pair a = p.a;
			Pair b = p.b;
			for (int k=0; k<4; k++) {
				
			}
			
			
		}
		
		
		
	}
	
	
	
	public int solution(int[][] board) {
		int answer = 0;
		n = board.length;
		check = new boolean [n][n];
		
		

		
		
		
		return answer;
	}
}
