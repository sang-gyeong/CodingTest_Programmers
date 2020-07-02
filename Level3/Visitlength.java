package Level3;

import java.util.*;

public class Visitlength {
	public int solution(String dirs) {
		int answer = 0;	
		boolean [][][][] a = new boolean [12][12][12][12];	
		int x=5;
		int y=5;
		int dx=5;
		int dy=5;		
		for (int i=0; i<dirs.length(); i++) {
			if(dirs.charAt(i)=='U') {
				dy+=1;
			}else if(dirs.charAt(i)=='D') {
				dy-=1;
			}
			else if(dirs.charAt(i)=='L') {
				dx-=1;
			}
			else if(dirs.charAt(i)=='R') {
				dx+=1;
			}
			if (dy<0 || dy>10 || dx<0 || dx>10) {
				dx = x;
				dy = y;
				continue;
			}
			
			if (a[x][y][dx][dy]==false) {
				a[x][y][dx][dy] = true;
				a[dx][dy][x][y] = true;
				answer++;
			}
			x = dx;
			y = dy;			
		}
		return answer;
	}
}
