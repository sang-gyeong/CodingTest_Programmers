package Level3;

import java.util.*;

public class BestSet {
	
	public int[] solution(int n, int s) {
		if (n>s) {
			int [] answer = new int [1];
			answer[0] = -1;
			return answer;
		}
		int [] answer = new int [n];
		
		int i = 0;
		int left_s = s;
		
		while(i < n) {
			answer[i] = left_s /(n-i);
			left_s -= answer[i];
			i++;
		}
		
		Arrays.sort(answer);
		
		return answer;
	}
}
