class PlusHR {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int [arr1.length][];
		for (int i=0; i<arr1.length;i++) {
			for (int j=0; j<arr1.length;i++) {
				answer[i][j] = arr1[i][j]+arr2[i][j];
			}


		}
		return answer;
	}



	public long[] solution(int x, int n) {
		long[] answer = new long [n];
		for (int i=1; i<=n; i++) {
			answer[i-1]= (long)i*x;
		}

		return answer;
	}
}