public class GetLand {//땅따먹기 
	static int findMax(int x, int y, int z) {
		int max = x;
		if (max<y) max=y;
		if (max<z) max=z;
		return max;
	}
	int solution(int[][] land) {
		int answer =0;
		int [][] sum = new int [land.length][4];
		sum[0][0] = land[0][0];
		sum[0][1] = land[0][1];
		sum[0][2] = land[0][2];
		sum[0][3] = land[0][3];
		
		for (int i=1; i<land.length; i++) {
			sum[i][0] = land[i][0]+findMax(sum[i-1][1], sum[i-1][2], sum[i-1][3]);
			sum[i][1] = land[i][1]+findMax(sum[i-1][0], sum[i-1][2], sum[i-1][3]);
			sum[i][2] = land[i][2]+findMax(sum[i-1][1], sum[i-1][0], sum[i-1][3]);
			sum[i][3] = land[i][3]+findMax(sum[i-1][1], sum[i-1][2], sum[i-1][0]);	
		}
		for (int j=0; j<4; j++) {
			if (answer < sum[land.length-1][j])
				answer = sum[land.length-1][j];
		}
		return answer;
	}
}

