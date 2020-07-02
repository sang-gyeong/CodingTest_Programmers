package Level3;

import java.util.*;

public class Network {//네트워크 
	
	
	static boolean [] check = new boolean [202];
	static int [] d = new int [202];
	
	
	public void go(int n, int[][]computers) {
		Queue <Integer> q = new LinkedList<>();
		int tmp=0;
		for (int i=0; i<n; i++) {
			tmp++;
			for (int j=i+1; j<n; j++) {
				if (computers[i][j]==1 && d[j]==0) {
					d[i] = tmp;
					d[j] = tmp;
					q.add(j);
					break;
				}
			}
			while(!q.isEmpty()) {
				int k = q.poll();
				for (int j=k+1; j<n; j++) {
					if (computers[k][j]==1 && d[j]==0) {
						d[j] = d[k];
						q.add(j);
					}
				}
			}
		}
		
	}
	
	
	public int solution(int n, int[][] computers) {
		int answer = 0;
		int tmp=0;
		check = new boolean [computers.length];
		d = new int [computers.length];
		go(n, computers);
		
		tmp=0;
		Arrays.sort(d); 
		for (int i=0; i<n; i++) {
			if (d[i]==0) answer++;
			else {
				if (d[i]!=tmp) {
					answer++;
					tmp=d[i];
				}
			}
		}

		
		return answer;
	}
}
