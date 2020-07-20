package Level3;

import java.util.*;
public class BaseStation {
	
	static boolean [] check;
	
	
	public void do_false(int n, int index, int w) {
		for (int i=index-w; i<=index+w; i++) {
			if (i<0 || i>n) {
				continue;
			}
			check[i] = false;
		}
	}
	
	public void do_true(int n, int index, int w) {
		for (int i=index-w; i<=index+w; i++) {
			if (i<0 || i>n) {
				continue;
			}
			check[i] = true;
		}
	}
	
	static int ans = Integer.MAX_VALUE;
	
	
	public void go(int index, int tmp, int n, int[] stations, int w) {
		if (index==n) {
			if (ans > w) ans = w;
			return;
		}
		
		if (check[index]==false) {
			do_true(n, index, w);
			go(index+1, tmp+1, n, stations, w);
			do_false(n, index, w);
			go(index+1, tmp, n, stations, w);
		}else {
			go(index+1, tmp, n, stations, w);
		}
	}
	
	
	public int solution(int n, int[] stations, int w) {
		check = new boolean[n];
		int answer = 0;
		
		for (int i=0; i<stations.length; i++) {
			do_true(n, stations[i]-1, w);
		}
		
		go(0, 0, n, stations, w);
		
		answer = ans;
		
		return answer;
	}
}
