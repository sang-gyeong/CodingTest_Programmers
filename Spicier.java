import java.util.*;
class Solution {//더 맵게 
	public int solution(int[] scoville, int K) {
		int answer = 0;
		int tmp = 0;

		Arrays.sort(scoville);
		if (scoville[0]>=K) return 0;

		while (tmp<scoville.length) {
			int t = scoville[tmp] + (scoville[tmp+1]*2);
			answer++;
			scoville[tmp] = 0;
			scoville[tmp+1] = t;

			tmp++;
			int j = tmp;
			while(scoville[j]>scoville[j+1]) {
				int a = scoville[j+1];
				scoville[j+1] = scoville[j];
				scoville[j] = a;
				j++;
			}
			if (scoville[tmp]>=K) break;
			if (tmp == scoville.length-1 && )
		}
		return answer;
	}
}

