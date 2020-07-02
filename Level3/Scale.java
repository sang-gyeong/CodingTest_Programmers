package Level3;

import java.util.*;

public class Scale {
	public int solution(int[] weight) {
		Arrays.sort(weight);
		int answer = weight[0];
		
		for (int i=1; i<weight.length; i++) {
			if (answer + 1 < weight[i]) break;
			answer += weight[i];
		}
		
		return answer + 1;
	}

}
