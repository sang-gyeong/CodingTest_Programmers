public class NumExpress{ //숫자의 표현 
	public int solution(int n) {
		int answer = 0;
		for (int i=1; i<=n; i++) {
			int sum=i;
			for (int j=i+1; j<=n; j++) {
				sum+=j;
				if (sum==n) answer++;
				if (sum>n) break;
			}
		}
		
		return answer+1;//자기 자신 
	}
}
