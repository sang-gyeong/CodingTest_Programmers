package Level3;

public class Hanoi {
	public int[][] solution(int n) {
		int[][] answer = new int [(2*n)-1][2];
		
		for (int i=0; i<(2*n)-1; i++) {
			if (i<n-1) {
				answer[i][0] = 1;
				answer[i][1] = 2;
			}else if(i==n-1) {
				answer[i][0] = 1;
				answer[i][1] = 3;
			}else {
				answer[i][0] = 2;
				answer[i][1] = 3;
			}
			
		}
		
		
		
		
		return answer;
	}
}
