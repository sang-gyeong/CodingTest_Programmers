public class Tournament {//예상 대진표 
	public int solution(int n, int a, int b) {
		int answer = 1;
		while(Math.min(a, b)%2!=1 || Math.max(a, b)%2!=0 || Math.abs(a-b)!=1 ) {
			if(a%2==1) {
				a=(a+1)/2;
			}
			else if(a%2==0) {
				a/=2;
			}
			if(b%2==1) {
				b=(b+1)/2;
			}
			else if(b%2==0) {
				b/=2;
			}
			answer++;
		}
		return answer;
	}
}
