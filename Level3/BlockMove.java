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

class Robot{
	Pair left;
	Pair right;
	Robot(Pair left, Pair right){
		this.left = left;
		this.right = right;
	}
}

public class BlockMove {
	
	static List <Integer> list = new ArrayList<>();

	
	static void bfs(int[][]board) {
		int n = board.length;
		Queue<Robot> q = new LinkedList<>();
		int [][][][] d = new int [n][n][n][n];
		boolean [][][][] check = new boolean [n][n][n][n];
		for (int i=0; i<n; i++) {
			Arrays.fill(d[i], -1);
		}
		
		d[0][0][0][1] = 0;
		
		Pair left = new Pair(0,0);
	    Pair right = new Pair(0,1);
	        
		q.add(new Robot(left, right));
		
		while(!q.isEmpty()) {
			int lx = q.poll().left.x;
			int ly = q.poll().left.y;
			int rx = q.poll().right.x;
			int ry = q.poll().right.y;
			
			if (lx==rx) { //가로 
				if (lx!=0) {
					if (board[lx-1][ly]!=1 && board[rx-1][ry]!=1 && check[lx-1][ly][rx-1][ry]==false) {
						q.add(new Robot(new Pair(lx-1,ly), new Pair(rx-1,ry)));
						d[lx-1][ly][rx-1][ry] = d[lx][ly][rx][ry] + 1;
						check[lx-1][ly][rx-1][ry] = true;
						q.add(new Robot(new Pair(lx, ly), new Pair(rx-1, ry-1)));
						d[lx][ly][rx-1][ry-1] = d[lx][ly][rx][ry] + 1;
						check[lx][ly][rx-1][ry-1] = true;
						q.add(new Robot(new Pair(lx-1, ly+1), new Pair(rx, ry)));
						d[lx-1][ly+1][rx][ry] = d[lx][ly][rx][ry] + 1;
						check[lx-1][ly+1][rx][ry] = true;
					}
				}if (lx!=n-1) {
					
				}
				
				
			}else if (ly==ry) { //세로 
				
			}
			
		}
		
		
				
	}
	
	
	
	public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;
        
       
        
        
        
        for (int i=0; i<n; i++) {
        	for (int j=0; j<n; j++) {
        		
        	}
        }
        
        
        return answer;
    }
}
