package Level3;

import java.util.*;

public class WaitingInLine {
	
	 public int[] solution(int N, long k) {
	        k--;
	        long[] f = new long[21];
	        f[0] = 1;
	        for (int i = 1; i < N; i++) f[i] = f[i - 1] * i;
	        
	        int[] answer = new int[N];
	        int ai = 0;
	        List<Integer> remaining = new ArrayList<>();
	        for (int i = 1; i <= N; i++) remaining.add(i);
	        for (int n = N; n > 0; n--) {
	            int i = (int)(k / f[n - 1]);
	            answer[ai++] = remaining.get(i);
	            remaining.remove(i);
	            k %= f[n - 1];
	        }
	        return answer;
	    }
}




