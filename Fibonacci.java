public class Fibonacci {
	public int solution(int n) {
	    int [] d =  new int [100001];
		
		d[0] = 0;
		d[1] = 1;
		
		for (int i=2; i<=n; i++) {
			d[i] = (d[i-2]+d[i-1])%1234567;
			
		}
		
		
		return d[n];
	}
}